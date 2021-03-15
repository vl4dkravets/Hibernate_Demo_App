package org.example.dao;

import org.example.models.Auto;
import org.example.models.User;

import java.util.List;

public interface UserDao {
    public User findById(int id);

    public void save(User user);

    public void update(User user);

    public void delete(User user);

    public Auto findAutoById(int id);

    public List<User> findAll();
}

