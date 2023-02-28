package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao[] userDaos  = new UserDao[5];
    int i = 0;
    @Override
    public void addUser(UserDao user) {

        if (i < userDaos.length ) {
            userDaos[i] = user;
            System.out.println("Успешно добавлено!");
            i++;
        }


    }

    @Override
    public void searchId(int id) {


    }

    @Override
    public void deletedId(int id) {

    }

    @Override
    public void getAllUsers(User[] users) {

    }
}
