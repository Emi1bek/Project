import company.dao.UserDao;
import company.model.User;
import company.service.impl.UserServiceImpl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User(1, 18, "Emilbek", "M");
        User user1 = new User(2, 20, "Gulnur", "W");
        User user3 = new User(3, 22, "Julduz", "W");
        User user2 = new User(4, 26, "Uson", "M");
        User user4 = new User(5, 25, "Asan", "M");
        UserDao userDao = new UserDao(user);
        UserDao userDao1 = new UserDao(user1);
        UserDao userDao2 = new UserDao(user2);
        UserDao userDao3 = new UserDao(user3);
        UserDao userDao4 = new UserDao(user4);
        userService.addUser(userDao);
        userService.addUser(userDao1);
        userService.addUser(userDao2);
        userService.addUser(userDao3);
        userService.addUser(userDao4);

        System.out.println();
        userService.getAllUsers();
        userService.searchId(3);
        userService.deletedId(1);


        userService.getAllUsers();



    }
}