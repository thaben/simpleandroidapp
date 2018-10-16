package com.example.tns.musicapp.playlists;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tns.musicapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaylistsFragment extends Fragment implements PlaylistView {


    RecyclerView playlistsRv;
    PlaylistsPresenter playlistPresenter;

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

//        ArrayList<Playlist> playlists = new ArrayList<>(); this was for MVC now we use presenter
//        insertMockPlaylists(playlists); this was for MVC now we use presenter

        playlistPresenter = new PlaylistsPresenterImp(this);
        playlistPresenter.getPlaylists();

        return v;
    }



//withOUT onClickListener - old
//    @Override
//    public void showPlaylists(ArrayList<Playlist> playlists) {
//        PlaylistsRvAdapter playlistsRvAdapter = new PlaylistsRvAdapter(playlists);
//        playlistsRv.setAdapter(playlistsRvAdapter);
//
//    }

//with onClickListener
    @Override
    public void showPlaylists(ArrayList<Playlist> playlists) {
        PlaylistsRvAdapter playlistsRvAdapter = new PlaylistsRvAdapter(playlists, new OnPlaylistClickListener() {
            @Override
            public void onPlaylistClicked(Playlist playlist) {
                Log.d("CS_TAG", "the playlist "
                        + playlist.getName() + " got clicked");

                Toast.makeText(getActivity(), "the playlist "
                        + playlist.getName() + " got clicked", Toast.LENGTH_LONG).show();
            }
        });
        playlistsRv.setAdapter(playlistsRvAdapter);
    }
}
