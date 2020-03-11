package com.javarush.task.task35.task3513;

import java.util.*;

public class Model {
    private static final int FIELD_WIDTH = 4; //ширина игрового поля
    private Tile[][] gameTiles; //массив игровое поле
    int score; //текущий счет
    int maxTile; //максимальный вес игровой плитки

    private Stack previousStates;
    private Stack previousScores;
    private boolean isSaveNeeded = true;

    public Model() {
        resetGameTiles();
        previousScores = new Stack();
        previousStates = new Stack();
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++){
            for (int j = 0; j < FIELD_WIDTH; j++){
                this.gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    public boolean canMove(){
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                if (gameTiles[i][j].value == 0) return true;
                if (i != 0 && gameTiles[i - 1][j].value == gameTiles[i][j].value) return true;
                if (j != 0 && gameTiles[i][j - 1].value == gameTiles[i][j].value) return true;
            }
        }
        return false;
    }

    //будет сохранять текущее
    //игровое состояние и счет в стеки с помощью метода push и устанавливать флаг isSaveNeeded равным false
    private void saveState(Tile[][] field){
        Tile[][] fieldToSave = new Tile[field.length][field[0].length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                fieldToSave[i][j] = new Tile(field[i][j].getValue());
            }
        }
        previousStates.push(fieldToSave);
        int scoreToSave = score;
        previousScores.push(scoreToSave);
        isSaveNeeded = false;
    }

    //будет устанавливать текущее игровое состояние равным последнему находящемуся в стеках с помощью метода pop
    //откат на ход назад
    public void rollback(){
        if (!previousStates.isEmpty() && !previousScores.isEmpty()) {
            this.score = (int) previousScores.pop();
            this.gameTiles = (Tile[][]) previousStates.pop();
        }
    }

    public void left() {
        if (isSaveNeeded)
            saveState(this.gameTiles);

        boolean isChanged = false;
        for (Tile[] tiles : gameTiles) {
            if (compressTiles(tiles) | mergeTiles(tiles)) {
                isChanged = true;
            }
        }
        if (isChanged) {
            addTile();
        }

        isSaveNeeded = true;
    }

    public void up() {
        saveState(this.gameTiles);
        rotate();
        rotate();
        rotate();
        left();
        rotate();
    }

    public void right() {
        saveState(this.gameTiles);
        rotate();
        rotate();
        left();
        rotate();
        rotate();
    }

    public void down() {
        saveState(this.gameTiles);
        rotate();
        left();
        rotate();
        rotate();
        rotate();
    }

    public void rotate() {
        Tile[][] tiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                tiles[i][j] = new Tile();
            }
        }
        for (int i = gameTiles.length - 1; i >= 0; i--) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                tiles[j][gameTiles.length - 1 - i].value = gameTiles[i][j].value;
            }
        }
        gameTiles = tiles;
    }

    public void autoMove() {
        PriorityQueue<MoveEfficiency> priorityQueue = new PriorityQueue(4, Collections.reverseOrder()); //для того, чтобы вверху очереди всегда был максимальный элемент
        priorityQueue.add(getMoveEfficiency(this::left));
        priorityQueue.add(getMoveEfficiency(this::right));
        priorityQueue.add(getMoveEfficiency(this::up));
        priorityQueue.add(getMoveEfficiency(this::down));
        priorityQueue.peek().getMove().move();
    }

    public void randomMove() {
        int n = ((int) (Math.random() * 100)) % 4;
        switch (n){
            case 0 :
                left();
                break;
            case 1 :
                right();
                break;
            case 2 :
                up();
                break;
            case 3 :
                down();
                break;
        }
    }

    public boolean hasBoardChanged(){
        int gameWeight = 0;
        int previousWeight = 0;
        Tile[][] gameT = getGameTiles();
        Tile[][] tmp = (Tile[][]) previousStates.peek();
        for (int i = 0; i < FIELD_WIDTH; i++){
            for (int j = 0; j < FIELD_WIDTH; j++){
                gameWeight += gameT[i][j].value;
                previousWeight += tmp[i][j].value;
            }
        }
        return gameWeight != previousWeight ? true : false;
    }

    private MoveEfficiency getMoveEfficiency(Move move) {
        MoveEfficiency moveEfficiency;
        move.move();
        if (hasBoardChanged()) moveEfficiency = new MoveEfficiency(getEmptyTiles().size(), score, move);
        else moveEfficiency = new MoveEfficiency(-1, 0, move);
        rollback();

        return moveEfficiency;
    }

    private boolean compressTiles(Tile[] tiles) {
        boolean isChanged = false;
        for (int i = 0; i < tiles.length; i++){
            int index = i;
            while (index != 0 && tiles[index - 1].isEmpty() && !tiles[i].isEmpty()) {
                index--;
            }
            if (index != i) {
                tiles[index].value = tiles[i].value;
                tiles[i].value = 0;
                isChanged = true;
            }
        }

        return isChanged;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean isChanged = false;
        for (int i = 1; i < tiles.length; i++) {
            if (tiles[i].value != 0 && tiles[i - 1].value == tiles[i].value) {
                isChanged = true;
                tiles[i - 1].value = tiles[i - 1].value * 2;
                for (int j = i + 1; j < tiles.length; j++) {
                    tiles[j - 1].value = tiles[j].value;
                }
                tiles[tiles.length - 1].value = 0;

                score += tiles[i - 1].value;
                if (tiles[i - 1].value > maxTile)
                    maxTile = tiles[i - 1].value;
            }
        }
        return isChanged;
    }

    private void addTile(){
        List<Tile> emptyTiles = getEmptyTiles();
        if (emptyTiles.size() == 0) return;
        Tile randomTile = emptyTiles.get((int) (Math.random() * emptyTiles.size()));
        randomTile.value = Math.random() < 0.9 ? 2 : 4;
    }

    private List<Tile> getEmptyTiles(){
        List<Tile> emptyTiles = new ArrayList<>();
        for (int i = 0; i < FIELD_WIDTH; i++){
            for (int j = 0; j < FIELD_WIDTH; j++){
                if (gameTiles[i][j].isEmpty()){
                    emptyTiles.add(gameTiles[i][j]);
                }
            }
        }
        return emptyTiles;
    }
}
