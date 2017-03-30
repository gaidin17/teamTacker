package com.gaidin17.DAO;

import com.gaidin17.domain.User;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
@Component
public class UserDaoImpl implements UserDao {
    private Set<User> users;
}
