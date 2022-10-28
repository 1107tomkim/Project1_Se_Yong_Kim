package dev.Kim.repositories;

import dev.Kim.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class UserDAOTest {

    static UserDAO userDAO = new UserDAOPostgres();

    @Test
    @Order(1)
    void create_user_test() {
        User testUser = new User("Shawnpurple", "12345");
        User savedUser = userDAO.createUser(testUser);
        System.out.println(savedUser);
        Assertions.assertNotEquals(0,savedUser.getId());
    }

    @Test
    @Order(2)
    void get_user_by_id_test() {
        User getUser = userDAO.getUserById(1);
        System.out.println(getUser);
        Assertions.assertNotNull(getUser);
    }

    @Test
    @Order(3)
    void get_user_by_username_test() {
        User user = userDAO.getUserById(1);
        String username = user.getUsername();
        int id = user.getId();
        User testUser = userDAO.getUserByUsername(username);
        Assertions.assertEquals(id, testUser.getId());
    }


}