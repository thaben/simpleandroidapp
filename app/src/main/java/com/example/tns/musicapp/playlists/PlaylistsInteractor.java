package com.example.tns.musicapp.playlists;

import java.util.ArrayList;

public interface PlaylistsInteractor {

    void getPlaylists(OnPlaylistsFinishListener listener);

    void getFilteredPlaylists(OnPlaylistsFinishListener listener,String filterString);

        interface OnPlaylistsFinishListener {

            void onSuccess(ArrayList<Playlist> playlists);

            void onError();

        }


}
