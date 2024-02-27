package com.java.mostwanted.usecases.collections;

import com.java.mostwanted.usecases.collections.utils.PlayList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
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
