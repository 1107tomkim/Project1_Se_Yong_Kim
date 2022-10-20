package dev.Kim.repositories;

import dev.Kim.entities.User;
import dev.Kim.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOPostgres implements UserDAO{
    @Override
    public User createUser(User user) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "insert into users values(default, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setBoolean(3, user.isManager());


            // "execute" is just for inserting, "executeQuery"is used for selecting, "executeUpdate" is used for updating
            // v The code below actually places the values of specific variables and executes it by convert it into the sql string.
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            int generatedKey = resultSet.getInt("id");
            user.setId(generatedKey);
            return user;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(int id) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "select * from users where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();

            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setManager(rs.getBoolean("isManager"));

            return user;
        }
        catch (SQLException e) {
            e.printStackTrace(); // Printing any exception that are caught to the Stack
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        try(Connection connection = ConnectionFactory.getConnection()) { // Checking for connection to make sure we are connected
            String sql = "select * from users"; // Creating a sql string so we can write what we want sql to do
            PreparedStatement ps = connection.prepareStatement(sql); // Preparedstatement basically allows us to not hard code queries.
            ResultSet rs = ps.executeQuery();
            List<User> userList = new ArrayList<>();

            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setManager(rs.getBoolean("isManager"));
                userList.add(user);
            }
            return userList;

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User UpdateUser(User user) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "Update user set username = ?, password = ?, isManager = ?, id = ? ";
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteUserById(int id) {
        return false;
    }
}
