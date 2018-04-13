package com.example.thuanhuynh.giuaky_game;

/**
 * Created by thuanhuynh on 4/13/18.
 */

public class Line {
    private int startX;
    private int stopX;
    private int startY;
    private int stopY;

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStopX() {
        return stopX;
    }

    public void setStopX(int stopX) {
        this.stopX = stopX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getStopY() {
        return stopY;
    }

    public void setStopY(int stopY) {
        this.stopY = stopY;
    }

    public Line(int startX, int startY, int stopX, int stopY)
    {
        this.startX = startX;
        this.startY = startY;
        this.stopX = stopX;
        this.stopY = stopY;

    }


}

