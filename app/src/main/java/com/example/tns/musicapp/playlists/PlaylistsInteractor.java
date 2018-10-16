package com.example.tns.musicapp.playlists;

import java.util.ArrayList;

public interface PlaylistsInteractor {

    void getPlaylists(OnPlaylistsFinishListener listener);

        interface OnPlaylistsFinishListener {

            void onSuccess(ArrayList<Playlist> playlists);

            void onError();

        }


}
