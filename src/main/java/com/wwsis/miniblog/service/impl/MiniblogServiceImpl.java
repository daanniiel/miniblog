package com.wwsis.miniblog.service.impl;
 
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.wwsis.miniblog.dao.FollowerDao;
import com.wwsis.miniblog.dao.MessageDao;
import com.wwsis.miniblog.dao.UserDao;
import com.wwsis.miniblog.model.Message;
import com.wwsis.miniblog.model.User;
import com.wwsis.miniblog.service.MiniblogService;
import org.springframework.transaction.annotation.Transactional;
 
@Service
 
public class miniblogServiceImpl implements MiniblogService {
 
 
    @Qualifier("followerDaoImpl")
    @Autowired
    private FollowerDao followerDao;
 
    @Qualifier("MessageDao")
    @Autowired
    private MessageDao messageDao;
 
    @Qualifier("UserDao")
    @Autowired
    private UserDao userDao;
 
 
    @Override
    public List<Message> getUserMessages(User user) {
 
        List<Message> messages = messageDao.getUserMessages(user);
 
        Collections.reverse(messages);
 
        return messages;
    }
 
    @Override
    public List<Message> getTimelineMessages(User user) {
 
        List<Message> messages = messageDao.getTimelineMessages(user);
 
        Collections.reverse(messages);
 
        return messages;
    }
 
    @Override
    public List<Message> getAllMessages() {
 
        List<Message> messages = messageDao.getAllMessages();
 
        Collections.reverse(messages);
 
        return messages;
    }
 
    @Override
    public void addMessage(Message message) {
        messageDao.addMessage(message);
    }
 
    @Override
    public void follow(User follower, User followee) {
        followerDao.follow(follower,followee);
    }
 
    @Override
    public void unfollow(User follower, User followee) {
        followerDao.unfollow(follower,followee);
    }
 
    @Override
    public boolean isFollowing(User follower, User followee) {
        return followerDao.isFollowing(follower,followee);
    }
 
    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }
 
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
