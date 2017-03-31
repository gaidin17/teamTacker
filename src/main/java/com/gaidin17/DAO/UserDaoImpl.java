package com.gaidin17.DAO;

import com.gaidin17.domain.User;
import com.gaidin17.service.IdCreatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
@Primary
@Component
public class UserDaoImpl implements UserDao {
    private List<User> users;
    private IdCreatorService idCreatorService;
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    public UserDaoImpl(IdCreatorService idCreatorService) {
        this.idCreatorService = idCreatorService;
        users = new ArrayList<>();
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User createUser(String name) {
        int id = idCreatorService.generateId();
        User newUser = new User(id, name);
        users.add(newUser);
        logger.debug("Был создан пользователем с id = {0} и именем {1}", id, name);
        return newUser;
    }

    @Override
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void removeUserById(int id) {
        for (User user : users) {
            if (user.getUserId() == id) {
                users.remove(user);
                logger.debug("Был удален пользователем с id = {0}", id);
                return;
            }
        }
        logger.debug("Удаление не произошло: Пользователя с id = {0} не было найдено ", id);
    }

}
