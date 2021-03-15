package org.example;

/**
 * Hello world!
 *
 */
import org.example.models.Auto;
import org.example.models.User;
import org.example.service.UserService;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Jane",26);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);

        user.setName("John");

        userService.updateUser(user);

        userService.deleteUser(user);
    }
}
