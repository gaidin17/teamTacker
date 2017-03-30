package com.gaidin17.stub;

import com.gaidin17.DAO.UserDao;
import com.gaidin17.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
@Component
public class userDaoStub implements UserDao {
    private List<User> users;

    public userDaoStub() {
        
    }
}
