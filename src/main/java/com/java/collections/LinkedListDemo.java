package com.java.collections;

import com.java.collections.utils.PlayList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //TreeSet: Suppose you're developing an employee management system where you need to store a sorted list of
        // employee IDs. You can use a TreeSet to automatically maintain the employee IDs in sorted order.

        PlayList userPlaylist = new PlayList();
        userPlaylist.addSong("Shape of You");
        userPlaylist.addSong("Believer");
        userPlaylist.addSong("Despacito");

        // Removing a song from the playlist
        userPlaylist.removeSong("Believer");

        // Retrieving songs in the playlist
        LinkedList<String> songsInPlaylist = userPlaylist.getSongs();
        for (String song : songsInPlaylist) {
            System.out.println(song);
        }
    }
}
