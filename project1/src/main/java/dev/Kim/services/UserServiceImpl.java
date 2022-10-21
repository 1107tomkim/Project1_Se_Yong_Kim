package dev.Kim.services;

import dev.Kim.entities.User;
import dev.Kim.repositories.UserDAO;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) { this.userDAO = userDAO; }


    @Override
    public User createUser(User user) {
        if (user.getUsername().length() == 0){
            throw new RuntimeException("Username cannot be empty!");
        }
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User UpdateUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUserById(int id) {
        return false;
    }
}
