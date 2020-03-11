package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message){
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Ошибка отправки сообщения");
            }
        }
    }


    public static void main(String[] args) throws IOException {
//        а) Запрашивать порт сервера, используя ConsoleHelper
        ConsoleHelper consoleHelper = new ConsoleHelper();
        ConsoleHelper.writeMessage("Введите порт:");
        int port = consoleHelper.readInt();
//        б) Создавать серверный сокет java.net.ServerSocket, используя порт из предыдущего пункта.
        try (ServerSocket serverSocket = new ServerSocket(port)) {
//        в) Выводить сообщение, что сервер запущен.
            System.out.println("Сервер запущен");
//        г) В бесконечном цикле слушать и принимать входящие сокетные соединения только что созданного серверного сокета.
//        д) Создавать и запускать новый поток Handler, передавая в конструктор сокет из предыдущего пункта.

            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        }
        catch (IOException e){
            ConsoleHelper.writeMessage("Что-то случилось, серсер сокет закрылся.");
        }
//        е) После создания потока обработчика Handler переходить на новый шаг цикла.
//        ж) Предусмотреть закрытие серверного сокета в случае возникновения исключения.
//        з) Если исключение Exception все же произошло, поймать его и вывести сообщение об ошибке.
        
    }

    private static class Handler extends Thread{
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();
                String userName = "";
                if (answer.getType().equals(MessageType.USER_NAME)) {
                    if (!answer.getData().isEmpty() && !connectionMap.containsKey(answer.getData())) {
                        userName = answer.getData();
                        connectionMap.put(userName, connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        return userName;
                    }
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException{
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()){
                if (!entry.getKey().equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true) {
                Message message = connection.receive();
                if (message != null && message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Error!");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединение с " + socket.getRemoteSocketAddress());
            String userName = null;
            try {
                Connection connection = new Connection(socket);
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка при обмене данными с удаленным адресом");
            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
                ConsoleHelper.writeMessage("Соединение закрыто"); // + socketAddress);
            }

        }


    }
}
