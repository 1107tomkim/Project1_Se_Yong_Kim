package dev.Kim.repositories;

import dev.Kim.entities.User;

import java.util.List;

// CRUD OPERATION
// C - CREATE
// R - READ
// U - UPDATE
// D - DELETE

public interface UserDAO {

    // CREATE
    User  createUser(User user);

    // READ
    User getUserById(int id);

    List<User> getAllUsers();

    // UPDATE
    User UpdateUser(User user);

    // DELETE
    boolean deleteUserById(int id);

}
