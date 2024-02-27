package com.java.mostwanted.usecases.collections.utils;

import java.util.LinkedList;

public class PlayList {
    private LinkedList<String> songs;

    public PlayList() {
        this.songs = new LinkedList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public LinkedList<String> getSongs() {
        return songs;
    }
}