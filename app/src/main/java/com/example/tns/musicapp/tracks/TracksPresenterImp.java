package com.example.tns.musicapp.tracks;

import java.util.ArrayList;

public class TracksPresenterImp implements TracksPresenter {

    TracksView tracksView;

    public TracksPresenterImp(TracksView tracksView) {
        this.tracksView = tracksView;
    }

    @Override
    public void getTracks() {
        ArrayList playlists = addMockTracks();
        tracksView.showTracks(playlists);
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
