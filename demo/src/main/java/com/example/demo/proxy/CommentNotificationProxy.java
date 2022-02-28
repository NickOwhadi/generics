package com.example.demo.proxy;

import com.example.demo.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
