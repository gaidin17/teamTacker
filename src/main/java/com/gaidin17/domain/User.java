package com.gaidin17.domain;

/**
 * Created by Evgeny_Akulenko on 2/14/2017.
 */

public class User {
    private int userId;
    private Position currentPosition;
    private Path userPath;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Path getUserPath() {
        return userPath;
    }

    public void setUserPath(Path userPath) {
        this.userPath = userPath;
    }
}


