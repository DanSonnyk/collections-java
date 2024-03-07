package com.java.collections;

import com.java.collections.utils.Post;

import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList: Suppose you're building a social media application where users can create posts, and you want to
        // store the comments for each post. You can use an ArrayList to store the comments for each post,
        // as it provides fast access by index and preserves the order of comments.

        Post post1 = new Post();
        post1.addComment("Great post!");
        post1.addComment("I agree with you.");
        post1.addComment("Keep up the good work!");
        post1.addComment("Nice job!");
        post1.addComment("Congrats! you`re awesome!");
        post1.addComment("Not so good!");
        post1.addComment("Need improve your speaking!");

        // Retrieving comments for post1
        ArrayList<String> commentsForPost1 = post1.getComments();
        for (String comment : commentsForPost1) {
            System.out.println(comment);
        }
        System.out.println("Your fifth post was:"+ commentsForPost1.get(4));
    }
}
