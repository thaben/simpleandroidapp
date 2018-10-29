package com.example.tns.musicapp.tracks;

import java.util.ArrayList;

public class TracksInteractorImp implements TracksInteractor {

    @Override
    public void getTracks(OnTracksFinishListener listener) {
       ArrayList tracks = addMockTracks();
       listener.onSuccess(tracks);
    }

    @Override
    public void getFilteredTracks(OnTracksFinishListener listener, String filter) {
        ArrayList<TrackUI> filteredTracks = new ArrayList<>();
        ArrayList<TrackUI> tracks = addMockTracks();

        for(TrackUI t:tracks){
            if(t.getTrackName().startsWith(filter)){
                filteredTracks.add(t);
            }
        }
        listener.onSuccess(filteredTracks);
    }


    private ArrayList<TrackUI> addMockTracks() {
        ArrayList<TrackUI> tracks = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            TrackUI track = new TrackUI("Track Name " + i, "Track Artist " + i, "TheCategory " + i);
            tracks.add(track);
        }
        return tracks;
    }
}
