package com.wwsis.miniblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Follower {
    @Column(name="follower_id")
   private int follower_id;
    @Column(name="followee_id")
   private int followee_id;


    public Follower() {
        //konstruktor
    }

    public int getFollower_id() {
        return follower_id;
    }

    public void setFollower_id(int follower_id) {
        this.follower_id = follower_id;
    }

    public int getFollowee_id() {
        return followee_id;
    }

    public void setFollowee_id(int followee_id) {
        this.followee_id = followee_id;
    }
}
