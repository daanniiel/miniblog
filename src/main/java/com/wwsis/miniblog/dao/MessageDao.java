package com.wwsis.miniblog.dao;

import com.wwsis.miniblog.model.Message;
import com.wwsis.miniblog.model.User;

import java.util.List;

public interface MessageDao {

    public List<Message> getUserMessages(User user);

    public List<Message> getTimelineMessages(User user);

    public List<Message> getAllMessages();

    public void addMessage(Message message);

}
