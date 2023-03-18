package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    private ArrayList<UserDao> userDaoArrayList = new ArrayList<>();

    int i = 0;

    @Override
    public void addUser(UserDao user) {
        userDaoArrayList.add(user);
        System.out.println("Успешно добавлено!" + (++i));
    }

    @Override
    public void searchId(int id) {
        for (UserDao u : userDaoArrayList) {
            if (u.getUsers().getId() == id) {
                System.out.println(u);
            }
        }
    }

    @Override
    public void deletedId(int id) {
        for (UserDao u : userDaoArrayList) {
            if (u.getUsers().getId() == id) {
                userDaoArrayList.remove(u);
                System.out.println("Успешно удалено!");
            }
            System.out.println(userDaoArrayList.toString());
        }
    }

    @Override
    public void getAllUsers() {
        for (UserDao u : userDaoArrayList) {
            System.out.println(u);
        }

    }
}
