package com.gaidin17.service;

import com.gaidin17.DAO.UserDao;
import com.gaidin17.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */

@Component
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

    public List<User> getUsersExceptId(int id) {
        List<User> otherusers = new ArrayList<>();
        for (User user : userDao.getUsers()) {
            if (!(user.getUserId() == id)) {
                otherusers.add(user);
            }
        }
        return otherusers;
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }


    public User createUser(String name, String deviceId) {

        return userDao.createUser(name, deviceId);
    }

    public User getUserByDeviceId(String deviceId) {
        return userDao.getUserByDeviceId(deviceId);
    }

    public boolean removeUserById(int id) {
        return userDao.removeUserById(id);
    }

    public void updateUserposition(int id, float x, float y, long time) {
        User user = userDao.getUserById(id);
        if (user != null) {
            user.getCurrentPosition().setxCoord(x);
            user.getCurrentPosition().setyCoord(y);
            user.getCurrentPosition().setPositionTime(time);
        }
    }

    public boolean isUserNameExist(String name) {
        return  userDao.getUserByName(name) != null;
    }
}
