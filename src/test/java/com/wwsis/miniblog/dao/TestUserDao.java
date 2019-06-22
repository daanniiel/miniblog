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
        user.setUsername("grzegorz");
        userDAO.addUser(user);

    }
    @Test
    public void userNameCheck() {
        String name = "grzegorz";
        Assert.assertTrue(name.equals(user.getUsername()));
    }

    @Test
    public void userEmailCheck(){
        String email = "grzegorz@wp.pl";
        Assert.assertTrue(email.equals(user.getEmail()));
    }

    @Test
    public void userPasswordCheck(){
        Assert.assertNotNull(user.getPassword());
    }

}

