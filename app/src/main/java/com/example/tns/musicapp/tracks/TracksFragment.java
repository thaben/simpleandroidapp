package com.example.tns.musicapp.tracks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tns.musicapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TracksFragment extends Fragment implements TracksView {

    RecyclerView mTracksRv;
    TracksPresenter tracksPresenter;


    public TracksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tracks, container, false);

        mTracksRv = v.findViewById(R.id.tracks_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mTracksRv.setLayoutManager(layoutManager);

//        ArrayList<Track> tracks = new ArrayList<>(); This was MVC now converting for MVP - useless now
//        addMockTracks(tracks);

        tracksPresenter = new TracksPresenterImp(this);
        tracksPresenter.getTracks();
        return v;
    }



    @Override
    public void showTracks(ArrayList<Track> tracks) {
        TracksRvAdapter tracksRvAdapter = new TracksRvAdapter(tracks);
        mTracksRv.setAdapter(tracksRvAdapter);
    }
}
