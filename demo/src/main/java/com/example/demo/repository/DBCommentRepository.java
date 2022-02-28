package com.example.demo.repository;

import com.example.demo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment has been stored in DB....");
    }
}
