package com.wwsis.miniblog.dao.impl;

import com.wwsis.miniblog.dao.UserDao;
import com.wwsis.miniblog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUser(String name) {
        Query query = entityManager.createQuery("FROM User U WHERE LOWER(U.username) = :name", User.class);
        query.setParameter("name",name.toLowerCase());

        User user = (User) query.getSingleResult();
        return user;
    }

    @Override
    public void addUser(User user) {

      entityManager.persist(user);
  //     entityManager.flush();
//        entityManager.refresh(user);



//        Query query = entityManager.createNativeQuery("INSERT INTO User(email, username, password) VALUES (:email,:username,:password)");
//        query.setParameter("email",user.getEmail());
//        query.setParameter("username",user.getUsername());
//        query.setParameter("password",user.getPassword());
//
//        query.executeUpdate();


    }
}
