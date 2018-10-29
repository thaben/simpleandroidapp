package com.example.tns.musicapp.playlists;

import com.example.tns.musicapp.R;

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
        ArrayList<PlaylistUI> playlistsUI = new ArrayList<>();
        for (Playlist playlist : playlists) {
            PlaylistUI playlistUI = new PlaylistUI(
                    playlist.getPlaylistId(),
                    playlist.getName(),
                    playlist.getItemCount()
            );

            if (playlistUI.getItemCount() > 10)
                playlistUI.setColorId(R.color.red);
            else
                playlistUI.setColorId(R.color.blue);
            playlistsUI.add(playlistUI);
        }

        playlistsView.showPlaylists(playlistsUI);

    }

    @Override
    public void onError() {

    }
}

