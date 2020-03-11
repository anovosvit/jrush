package com.javarush.task.task33.task3310.strategy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileBucket {
    Path path;

    public FileBucket() {
        try {
            this.path = Files.createTempFile("temp", "");
            Files.deleteIfExists(this.path);
            Files.createFile(this.path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.path.toFile().deleteOnExit();
    }

    public long getFileSize() throws IOException {
        return Files.size(path);
    }

    public void putEntry(Entry entry) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path));
            objectOutputStream.writeObject(entry);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Entry getEntry() {
        Entry entry = null;
        try {
            if (getFileSize() == 0) {
                return null;
            }

            ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path));
            entry = (Entry) objectInputStream.readObject();
            objectInputStream.close();
            return entry;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void remove(){
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
