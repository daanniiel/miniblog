package com.wwsis.miniblog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="message")
public class Message {
    @Column(name="content")
    private String content;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private int post_id;
    
    @Column(name="poster_id")
    private int poster_id;
    
    @Column(name="date")
    private Date date;

    public Message() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getPoster_id() {
        return poster_id;
    }

    public void setPoster_id(int poster_id) {
        this.poster_id = poster_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
