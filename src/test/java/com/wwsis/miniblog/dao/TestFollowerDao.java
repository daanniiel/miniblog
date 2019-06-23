package com.wwsis.miniblog.dao;


import com.wwsis.miniblog.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
public class TestFollowerDao {
    @Autowired
    FollowerDao followerDAO;
    @Autowired
    UserDao userDAO;
    //śledzony
    User newFollowee;
    //śledzący
    User newFollower;
    @Before
    public void setUp() {

    }
    @Test
    public void testAddFollower() {
<<<<<<< HEAD
    }
}
=======
//...
    }
//. . .
  //      . . .
}

>>>>>>> c0dc9f16270558dc23358b61c21207160b05417e
