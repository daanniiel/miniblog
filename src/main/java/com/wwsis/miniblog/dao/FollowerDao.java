package com.wwsis.miniblog.dao;

import com.wwsis.miniblog.model.User;

public interface FollowerDao {

    public void follow(User follower, User followee);

    public void unfollow(User follower, User followee);

    public boolean isFollowing(User follower, User followee);

}
