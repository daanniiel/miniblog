package com.wwsis.miniblog.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.wwsis.miniblog.model.User;
import com.wwsis.miniblog.model.Message;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
public class TestMessageDao {
    @Autowired
    Message message=new Message();
    @Autowired
    UserDao userDao;
    @Test
    public void setUp() {
        message.setContent("Mini wpis");
        message.setPost_id(1);
        message.setPoster_id(1);
        message.setDate();

        MessageDao.addMessage(message);
    }
    public void MessageCheck() {
        String name = "Mini wpis";
        Assert.assertTrue(name.equals(message.getContent(name).getUsername()));
    }
    }



