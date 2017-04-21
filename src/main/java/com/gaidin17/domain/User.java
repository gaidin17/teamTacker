package com.gaidin17.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 2/14/2017.
 */

public class User {

    @JsonIgnore
    private int userId;

    @JsonIgnore
    private String deviceId;
    private String name;
    private String status;

    @JsonProperty("position")
    private Position currentPosition;
    @JsonIgnore
    private List<Path> userPaths;

    public User(int userId, String name, String deviceId) {
        this.userId = userId;
        this.name = name;
        this.deviceId = deviceId;
        this.userPaths = new ArrayList<>();
        this.status = "";
        this.currentPosition = new Position(0, 0, 0);
    }

    public String getDeviceId() {
        return deviceId;
    }


    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


