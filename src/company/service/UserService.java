package company.service;

import company.dao.UserDao;
import company.model.User;

public interface UserService {
    void addUser(UserDao user);
    void searchId(int id);
    void deletedId(int id);
    void getAllUsers(User[] users);
}
