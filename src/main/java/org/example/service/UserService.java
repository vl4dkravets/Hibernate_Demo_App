package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.models.Auto;
import org.example.models.User;

import java.util.List;

public class UserService {

    /**
     * More precise way to assign/obtain dao implementation
     * would be to have a factory class which returns
     * a certain dao implementation; the latter can be specified
     * in application.properties file. Namely, properties will contain
     * a name of the class with needed dao implementation
     * Them, factory would obtain its name, create its instance &
     * return it here
     */

    private UserDao usersDao = new UserDaoImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}