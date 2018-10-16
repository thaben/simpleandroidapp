package com.example.tns.musicapp.tracks;

import java.util.ArrayList;

public class TracksInteractorImp implements TracksInteractor {

    @Override
    public void getTracks(OnTracksFinishListener listener) {
       ArrayList tracks = addMockTracks();
       listener.onSuccess(tracks);
    }




    private ArrayList<Track> addMockTracks() {
        ArrayList<Track> tracks = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            Track track = new Track("Track Name " + i, "Track Artist " + i, "TheCategory " + i);
            tracks.add(track);
        }
        return tracks;
    }
}
