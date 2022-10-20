package dev.Kim.repositories;

import dev.Kim.entities.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAOLocal implements UserDAO{


    private Map<Integer, User> userTable = new HashMap();
    private int idCount = 1;

    @Override
    public User createUser(User user) {
        user.setId(idCount);
        idCount++;
        userTable.put(user.getId(), user);
        System.out.println(userTable.values());
        return user;
    }

    @Override
    public User getUserById(int id) {
        return userTable.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User UpdateUser(User user) {
        return userTable.put(user.getId(), user);
    }

    @Override
    public boolean deleteUserById(int id) {
        User user = userTable.remove(id);
        if (user == null) {
            return false;
        } else {
            return true;
        }
    }
}
