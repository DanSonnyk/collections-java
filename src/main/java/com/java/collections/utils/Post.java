package com.java.collections.utils;

import java.util.ArrayList;

public class Post {
    private ArrayList<String> comments;

    public Post() {
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public ArrayList<String> getComments() {
        return comments;
    }
}

