package dev.Kim.services;

import dev.Kim.entities.User;

import java.util.List;

public interface UserService {

    // CREATE
    User createUser(User user);

    // READ
    User getUserById(int id);
    User getUserByUsername(String username);

    int authenticateUser(String username, String password);

    List<User> getAllUsers();

    // UPDATE
    User UpdateUser(User user);
    User UpdateRole(int id);

    // DELETE
    boolean deleteUserById(int id);
}
