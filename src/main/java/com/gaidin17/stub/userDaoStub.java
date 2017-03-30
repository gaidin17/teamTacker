package com.gaidin17.stub;

import com.gaidin17.DAO.UserDao;
import com.gaidin17.domain.Operation;
import com.gaidin17.domain.Path;
import com.gaidin17.domain.Position;
import com.gaidin17.domain.User;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
@Primary
@Component
public class userDaoStub implements UserDao {
    private static int conut = 10;
    private List<User> users;

    public userDaoStub() {
        users = generateFakeUsers(conut);
    }

    private List<User> generateFakeUsers(int count) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            users.add(createFakeUser(i));
        }
        return users;
    }

    private User createFakeUser(int count) {
        User user = null;
        user = new User(count);
        Position position = new Position(1f + (float) Math.random() * 10, 1f + (float) Math.random() * 10, new Date().getTime());
        user.setCurrentPosition(position);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
