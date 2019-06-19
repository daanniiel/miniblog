package com.wwsis.miniblog.dao;

import com.wwsis.miniblog.model.User;

public interface UserDao {

    public User getUser(String name);

    public void addUser(User user);

}
