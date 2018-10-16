package com.example.tns.musicapp.tracks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TracksInteractorImp implements TracksInteractor {

    @Override
    public void getTracks(OnTracksFinishListener listener) {
       ArrayList tracks = addMockTracks();
       listener.onSuccess(tracks);
    }

    @Override
    public void getFilteredTracks(OnTracksFinishListener listener, String filter) {
        ArrayList<Track> filteredTracks = new ArrayList<>();
        ArrayList<Track> tracks = addMockTracks();

        for(Track t:tracks){
            if(t.getTrackName().startsWith(filter)){
                filteredTracks.add(t);
            }
        }
        listener.onSuccess(filteredTracks);
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
