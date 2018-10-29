package com.example.tns.musicapp.tracks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tns.musicapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TracksFragment extends Fragment implements TracksView {

    RecyclerView mTracksRv;
    TracksPresenter tracksPresenter;

    //filter
    EditText mFilterEditText;
    Button mFilterButton;



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



        //filter
        mFilterEditText = v.findViewById(R.id.filter_edit_text);
        mFilterButton = v.findViewById(R.id.filter_button);
        mFilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filterText = mFilterEditText.getText().toString();
                tracksPresenter.getFilteredTracks(filterText);
            }
        });

        tracksPresenter = new TracksPresenterImp(this);///
        tracksPresenter.getTracks();
        return v;
    }


// WITHOUT CLICK LISTENERS
//    @Override
//    public void showTracks(ArrayList<Track> tracks) {
//        TracksRvAdapter tracksRvAdapter = new TracksRvAdapter(tracks);
//        mTracksRv.setAdapter(tracksRvAdapter);
//    }

//WITH CLICK LISTENERS
    @Override
    public void showTracks(ArrayList<Track> tracks) {
        TracksRvAdapter tracksRvAdapter = new TracksRvAdapter(tracks, new OnTrackClickListener() {
            @Override
            public void onTrackClick(Track track) {
                Toast.makeText(getActivity(), "the track "
                        + track.getTrackName() + " got clicked", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTrackLogoClick(Track track) {
                Toast.makeText(getActivity(), "The track logo got clicked", Toast.LENGTH_LONG).show();
            }
        });
        mTracksRv.setAdapter(tracksRvAdapter);
    }
}