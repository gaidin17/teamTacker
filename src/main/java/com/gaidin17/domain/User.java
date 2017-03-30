package com.gaidin17.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 2/14/2017.
 */

public class User {
    private int userId;
    private Position currentPosition;
    private List<Path> userPaths;

    public User(int userId) {
        this.userId = userId;
        this.userPaths = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public List<Path> getUserPaths() {
        return userPaths;
    }

    public void setUserPaths(List<Path> userPaths) {
        this.userPaths = userPaths;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }
}


