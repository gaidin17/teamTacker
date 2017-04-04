package com.gaidin17.DAO;

import com.gaidin17.domain.User;

import java.util.List;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
public interface UserDao {
    List<User> getUsers();

    User createUser(String name, String deviceId);

    User getUserById(int id);

    User getUserByDeviceId(String deviceId);

    boolean removeUserById(int id);

    User getUserByName(String name);
}
