package dev.Kim.repositories;

import dev.Kim.entities.Tickets;
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
            preparedStatement.setString(2, user.getPassword());
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
    public User getUserByUsername(String username) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "select * from users where username = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();

            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setManager(rs.getBoolean("isManager"));
            return user;
        }
        catch (SQLException e){
            System.out.print("This is from the catch block  ");
            e.printStackTrace();
            return null;
        }
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
            String sql = "Update users set username = ?, password = ?, isManager = ?, id = ? ";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setBoolean(3, user.isManager());
            ps.setInt(4, user.getId());

            ps.executeUpdate();
            return user;

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteUserById(int id) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "delete from user where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);

            ps.execute();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    /*@Override
    public Tickets createTickets(Tickets tickets) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "insert into tickets values(default, ?, ? ,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1, tickets.getAmount());
            preparedStatement.setString(2, tickets.getDescriptions());
            preparedStatement.setString(3, tickets.getStatus().name());

            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int generatedKey = rs.getInt("id");
            tickets.setId(generatedKey);
            return tickets;

        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Tickets getTicketsById(int id) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "select * from tickets where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ps.execute();
            ResultSet rs = ps.executeQuery();
            rs.next();

            Tickets tickets = new Tickets();
            tickets.setId(rs.getInt("id"));
            tickets.setAmount(rs.getLong("amount"));
            tickets.setDescriptions(rs.getString("descriptions"));
            tickets.setStatus(rs.getStatus().name("isManager"));  //????
            ticketsList.add(tickets);

        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
*/}
