package com.wwsis.miniblog.dao;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Date;
import java.util.List;
 
import org.junit.Assert;
import org.junit.Before;
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
    MessageDao messageDao;
    Message message = new Message();
 
    @Before
    public void setUp() {
        message.setContent("Mini wpis");
        message.setPoster_id(200);
 
 
        messageDao.addMessage(message);
    }
    @Test
    public void MessageCheck() {
        User user = new User();
        user.setUser_id(200);
 
 
        Assert.assertTrue(message.getContent().equals(messageDao.getUserMessages(user).get(0).getContent()));
 
    }
 
    @Test
    public void PosterCheck(){
 
 
 
    }
 
   
    }
