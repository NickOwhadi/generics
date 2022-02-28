package com.example.demo.repository;

import com.example.demo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
