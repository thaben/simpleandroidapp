package com.example.tns.musicapp.tracks;

import java.util.ArrayList;

public interface TracksInteractor {
    void getTracks(OnTracksFinishListener listener);

    //sub interface for callback
    interface OnTracksFinishListener {
        void onSuccess(ArrayList<Track> tracks);
        void onError();
    }
}
