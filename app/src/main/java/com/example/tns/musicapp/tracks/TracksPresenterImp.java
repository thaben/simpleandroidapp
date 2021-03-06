package com.example.tns.musicapp.tracks;

import java.util.ArrayList;

public class TracksPresenterImp implements TracksPresenter,TracksInteractor.OnTracksFinishListener {

    TracksView tracksView;
    TracksInteractor tracksInteractor;

    public TracksPresenterImp(TracksView tracksView) {
        this.tracksView = tracksView;
        tracksInteractor = new TracksInteractorImp();
    }

    @Override
    public void getTracks() {

        tracksInteractor.getTracks(this);
    }

    @Override
    public void getFilteredTracks(String filter) {
        tracksInteractor.getFilteredTracks(this,filter);
    }


    @Override
    public void onSuccess(ArrayList<TrackUI> tracks) {
        tracksView.showTracks(tracks);

    }

    @Override
    public void onError() {

    }
}
