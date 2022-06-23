package web.service;
import web.model.*;
import java.util.List;


public interface UserService {
    void addUser(User user);
    User getUser(long id);
    void deleteUser(int id);
    void updateUser(User user);
    List<User> getAllUsers();
}
