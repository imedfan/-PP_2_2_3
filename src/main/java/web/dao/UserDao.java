package web.dao;

import java.util.List;

import web.model.*;

public interface UserDao {
    void addUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getAllUsers();
}
