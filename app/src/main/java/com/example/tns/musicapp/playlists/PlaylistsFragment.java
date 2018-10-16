package com.example.tns.musicapp.playlists;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.tns.musicapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaylistsFragment extends Fragment {


    RecyclerView playlistsRv;

    public PlaylistsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_playlists, container, false);

        playlistsRv = v.findViewById(R.id.playslists_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        playlistsRv.setLayoutManager(layoutManager);

        ArrayList<Playlist> playlists = new ArrayList<>();
        insertMockPlaylists(playlists);

        PlaylistsRvAdapter playlistsRvAdapter = new PlaylistsRvAdapter(playlists);
        playlistsRv.setAdapter(playlistsRvAdapter);

        return v;
    }


    private void insertMockPlaylists(ArrayList<Playlist> playlists) {
        playlists.add(new Playlist("1", "Post-rock", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Nisiotika", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Country", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
        playlists.add(new Playlist("1", "Country", 11));
        playlists.add(new Playlist("2", "Rock", 14));
        playlists.add(new Playlist("3", "Pop", 9));
        playlists.add(new Playlist("4", "Metal", 8));
    }



}
