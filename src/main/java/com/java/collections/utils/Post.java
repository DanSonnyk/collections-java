package com.java.collections.utils;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private List<String> comments;

    public Post() {
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }
}

