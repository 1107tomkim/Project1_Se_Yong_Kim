package dev.Kim.daotests;

import dev.Kim.entities.User;
import dev.Kim.repositories.UserDAO;
import dev.Kim.repositories.UserDAOLocal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDAOTests {

    static UserDAO userDAO = new UserDAOLocal();

    @Test
    void create_user_test(){
        User new_user = new User("Tom1107", "Abc12345");
        User saved_user = userDAO.createUser(new_user);
        Assertions.assertNotEquals(0,saved_user.getId());
    }

    @Test
    void get_User_By_Id(){
        User gottenUser = userDAO.getUserById(1);
        Assertions.assertEquals("Tom1107", gottenUser.getUsername());
    }
}
