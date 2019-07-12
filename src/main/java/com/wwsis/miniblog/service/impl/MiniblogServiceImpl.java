package com.wwsis.miniblog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wwsis.miniblog.dao.FollowerDao;
import com.wwsis.miniblog.dao.MessageDao;
import com.wwsis.miniblog.dao.UserDao;
import com.wwsis.miniblog.model.Message;
import com.wwsis.miniblog.model.User;
import com.wwsis.miniblog.service.MiniblogService;

@Service
public class MiniblogServiceImpl implements MiniblogService {

    @Autowired
    MessageDao messageDao;

    @Autowired
    UserDao userDao;

    @Autowired
    FollowerDao followerDao;

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
    public List<Message> getUserMessages(User user) {
        return messageDao.getUserMessages(user);
    }

    @Override
    public List<Message> getTimelineMessages(User user) {
        return messageDao.getTimelineMessages(user);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageDao.getAllMessages();
    }

    @Override
    public void addMessage(Message message) {
        messageDao.addMessage(message);
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
