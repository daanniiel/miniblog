package com.wwsis.miniblog.service;
import java.util.List;
import com.wwsis.miniblog.model.*;


public interface MiniblogService {

    public void follow(User follower, User followee);

    public void unfollow(User follower, User followee);

    public boolean isFollowing(User follower, User followee);


    public List<Message> getUserMessages(User user);

    public List<Message> getTimelineMessages(User user);

    public List<Message> getAllMessages();

    public void addMessage(Message message);


    public User getUser(String name);

    public void addUser(User user);


}
