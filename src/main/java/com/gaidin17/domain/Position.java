package com.gaidin17.domain;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
public class Position {
    private float xCoord;
    private float yCoord;
    private long positionTime;

    public Position(float xCoord, float yCoord, long positionTime) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.positionTime = positionTime;
    }

    public float getxCoord() {
        return xCoord;
    }

    public void setxCoord(float xCoord) {
        this.xCoord = xCoord;
    }

    public float getyCoord() {
        return yCoord;
    }

    public void setyCoord(float yCoord) {
        this.yCoord = yCoord;
    }

    public long getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(long positionTime) {
        this.positionTime = positionTime;
    }

    @Override
    public String toString() {
        return "Position{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", positionTime=" + positionTime +
                '}';
    }
}
