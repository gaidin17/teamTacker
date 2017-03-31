package com.gaidin17.controller;

import com.gaidin17.DAO.UserDao;
import com.gaidin17.domain.User;
import com.gaidin17.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Gaidin on 11.02.2017.
 */
@RestController
public class MainController {
    private String testQuery = "pid=18&px=1233124.21&py=1443224.99&ptime=32489723";
    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/cdo")
    public String getAndUpdatePositions(@RequestParam("pid") int pid, @RequestParam("px") float px, @RequestParam("py") float py, @RequestParam("ptime") long ptime) {
        userService.updateUserposition(pid, px, py, ptime);
        List<User> users = userService.getUsersExceptId(pid);
        StringBuilder stringBuilder = new StringBuilder();
        for (User user : users) {
            stringBuilder.append(user.getCurrentPosition());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @RequestMapping("/create")
    public String initialiseUser(@RequestParam("name") String name, @RequestParam("px") float px, @RequestParam("py") float py, @RequestParam("ptime") long ptime) {
        User user = userService.createUser(name);
        userService.updateUserposition(user.getUserId(), px, py, ptime);
        return user.toString();
    }
}
