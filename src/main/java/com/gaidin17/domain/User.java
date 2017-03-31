package com.gaidin17.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 2/14/2017.
 */

public class User {
    private int userId;
    private String name;
    private Position currentPosition;
    private List<Path> userPaths;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.userPaths = new ArrayList<>();
        this.currentPosition = new Position(0, 0, 0);
    }

    public int getUserId() {
        return userId;
    }

    public List<Path> getUserPaths() {
        return userPaths;
    }

    public void setUserPaths(List<Path> userPaths) {
        this.userPaths = userPaths;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }
}


