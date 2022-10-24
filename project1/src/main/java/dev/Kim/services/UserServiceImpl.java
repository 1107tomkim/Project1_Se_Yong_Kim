package dev.Kim.services;

import dev.Kim.entities.User;
import dev.Kim.repositories.UserDAO;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) { this.userDAO = userDAO; }


    @Override
    public User createUser(User user) {
        if(user.getUsername().length() == 0){
            throw new RuntimeException("Username cannot be empty!");
        }
        if(user.getPassword().length() == 0){
            throw new RuntimeException("Password cannot be empty!");
        }
        User savedUser = this.userDAO.createUser(user);
        return savedUser;
    }

    @Override
    public User getUserById(int id) {
        return this.userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDAO.getAllUsers();
    }

    @Override
    public User UpdateUser(User user) {
        if(user.getUsername().length() == 0){
            throw new RuntimeException("Username cannot be empty!");
        }
        if(user.getPassword().length() == 0){
            throw new RuntimeException("Password cannot be empty!");
        }

        return this.userDAO.UpdateUser(user);
    }

    @Override
    public boolean deleteUserById(int id) {
        return this.userDAO.deleteUserById(id);
    }
}
