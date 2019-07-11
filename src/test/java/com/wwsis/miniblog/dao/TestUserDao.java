package com.wwsis.miniblog.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.wwsis.miniblog.dao.UserDao;
import com.wwsis.miniblog.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
public class TestUserDao {
    @Autowired
    UserDao userDAO;
    User user = new User();
    @Before
    public void setUp() {
        user.setEmail("grzegorz@wp.pl");
        user.setPassword("test1234");
        user.setUsername("grzegorz8");

        userDAO.addUser(user);

    }
    @Test
   public void userNameCheck() {
        String name = "grzegorz8";
        Assert.assertTrue(user.getUsername().equals(userDAO.getUser(name).getUsername()));
    }
    @Test
    public void userEmailCheck(){
        String name = "grzegorz8";
        Assert.assertTrue(user.getEmail().equals(userDAO.getUser(name).getEmail()));
    }
    @Test
    public void userPasswordCheck(){
        String name = "grzegorz8";
        Assert.assertTrue(user.getPassword().equals(userDAO.getUser(name).getPassword()));
    }



}

