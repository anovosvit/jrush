package com.javarush.task.task35.task3513;

import java.awt.*;

public class Tile {
    int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Tile(int value) {
        this.value = value;
    }

    public Tile() {
        this.value = 0;
    }

    public boolean isEmpty(){
        return this.value == 0 ? true : false;
    }

    public Color getFontColor() {
        return this.value < 16 ? new Color(0x776e65) : new Color(0xf9f6f2);
    }

    public Color getTileColor() {
        Color titleColor = null;
        switch (value){
            case 0 :
                titleColor = new Color(0xcdc1b4);
                break;
            case 2 :
                titleColor = new Color(0xeee4da);
                break;
            case 4 :
                titleColor = new Color(0xede0c8);
                break;
            case 8 :
                titleColor = new Color(0xf2b179);
                break;
            case 16 :
                titleColor = new Color(0xf59563);
                break;
            case 32 :
                titleColor = new Color(0xf67c5f);
                break;
            case 64 :
                titleColor = new Color(0xf65e3b);
                break;
            case 128 :
                titleColor = new Color(0xedcf72);
                break;
            case 256 :
                titleColor = new Color(0xedcc61);
                break;
            case 512 :
                titleColor = new Color(0xedc850);
                break;
            case 1024 :
                titleColor = new Color(0xedc53f);
                break;
            case 2048 :
                titleColor = new Color(0xedc22e);
                break;
            default:
                titleColor = new Color(0xff0000);
        }

        return titleColor;
    }


}
