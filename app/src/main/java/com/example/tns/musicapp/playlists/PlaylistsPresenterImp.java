package com.example.tns.musicapp.playlists;

import java.util.ArrayList;

public class PlaylistsPresenterImp implements PlaylistsPresenter {

    PlaylistView playlistsView;

    public PlaylistsPresenterImp(PlaylistView playlistView) {
        this.playlistsView = playlistView;
    }

    @Override
    public void getPlaylists() {
        ArrayList playlists =insertMockPlaylists();
        playlistsView.showPlaylists(playlists);
    }

    private ArrayList<Playlist>  insertMockPlaylists() {
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("1", "Post-rock", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Nisiotika", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Country", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));

        return playlists;
    }




}

