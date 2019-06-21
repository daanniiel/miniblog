package com.wwsis.miniblog.dao.impl;

import com.wwsis.miniblog.dao.MessageDao;
import com.wwsis.miniblog.model.Message;
import com.wwsis.miniblog.model.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
public class MessageDaoImpl implements MessageDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Message> getUserMessages(User user) {

        Query query = entityManager.createQuery("SELECT * FROM Message M WHERE M.poster_id = :user_id");
        query.setParameter("user_id", user.getUser_id());
        List<Message> messages = query.getResultList();

        return messages;
    }

    @Override
    public List<Message> getTimelineMessages(User user) {
        Query query = entityManager.createQuery("SELECT * FROM Message M WHERE M.poster_id = :user_id OR M.poster_id IN (SELECT followee_id FROM Follower WHERE follower_id = user_id)");
        query.setParameter("user_id", user.getUser_id());
        List<Message> messages = query.getResultList();

        return messages;
    }

    @Override
    public List<Message> getAllMessages() {

        Query query = entityManager.createQuery("SELECT * FROM Message");
        List<Message> messages  = query.getResultList();

        return messages;
    }

    @Override
    public void addMessage(Message message) {

        entityManager.persist(message);

    }
}
