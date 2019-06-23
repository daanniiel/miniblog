package com.wwsis.miniblog.dao.impl;

import com.wwsis.miniblog.dao.FollowerDao;
import com.wwsis.miniblog.model.Follower;
import com.wwsis.miniblog.model.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Transactional
public class FollowerDaoImpl implements FollowerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void follow(User follower, User followee) {

        Follower follower1 = new Follower();
        follower1.setFollower_id(follower.getUser_id());
        follower1.setFollowee_id(followee.getUser_id());

        entityManager.persist(follower1);


    }

    @Override
    public void unfollow(User follower, User followee) {

        Query query = entityManager.createQuery("DELETE FROM Follower F WHERE F.follower_id = :follower_id and F.followee_id = :followee_id");
        query.setParameter("follower_id",follower.getUser_id());
        query.setParameter("followee_id",followee.getUser_id());

        query.executeUpdate();

    }

    @Override
    public boolean isFollowing(User follower, User followee) {

        Query query = entityManager.createQuery("COUNT(1) FROM Follower F WHERE F.follower_id = :follower_id and F.followee_id = :followee_id");
        query.setParameter("follower_id",follower.getUser_id());
        query.setParameter("followee_id",followee.getUser_id());

        int result = (Integer) query.getSingleResult();

        if (result == 1){
            return true;
        }
        else return false;
    }
}
