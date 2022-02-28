package com.example.demo.proxy;

import com.example.demo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment has been pushed to: " + comment.getText());
    }
}
