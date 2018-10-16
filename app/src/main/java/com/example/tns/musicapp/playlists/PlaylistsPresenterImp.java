package com.example.tns.musicapp.playlists;

import java.util.ArrayList;

public class PlaylistsPresenterImp implements PlaylistsPresenter, PlaylistsInteractor.OnPlaylistsFinishListener {

    PlaylistView playlistsView;
    PlaylistsInteractor playlistsInteractor;

    public PlaylistsPresenterImp(PlaylistView playlistView) {
        this.playlistsView = playlistView;
        playlistsInteractor = new PlaylistsInteractorImp();
    }

    @Override
    public void getPlaylists() {
       playlistsInteractor.getPlaylists(this);
    }

    @Override
    public void getFilteredPlaylists(String filter) {
        playlistsInteractor.getFilteredPlaylists(this,filter);
    }


    @Override
    public void onSuccess(ArrayList<Playlist> playlists) {
        playlistsView.showPlaylists(playlists);
    }

    @Override
    public void onError() {

    }
}

