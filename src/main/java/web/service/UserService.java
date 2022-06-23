package web.service;

import org.springframework.stereotype.Component;

import java.util.List;

import web.model.User;

@Component
public class UserService {
    private List<User> usersList;

    public UserService(List<User> usersList) {
        this.usersList = usersList;

        User user1 = new User("Artem",27, "Volvo", true);
        User user2 = new User("Petr",15, "toyCars", false);
        User user3 = new User("John", 54, "Mersedes", false);
        User user4 = new User("Irina", 37, "Lava", true);

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
    }

    public List<User> getUsersList(int i) {
        if (i > 0 && i < usersList.size()) {
            return usersList.subList(0, i);
        }
        return usersList;
    }


}
