package com.example.tns.musicapp.playlists;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tns.musicapp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaylistsFragment extends Fragment implements PlaylistView {

    @BindView(R.id.playslists_rv)
    RecyclerView playlistsRv;

    PlaylistsPresenter playlistPresenter;

    @BindView(R.id.filter_edit_text)
    EditText mFilterEditText;

    Button mFilterButton;

    public PlaylistsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_playlists, container, false);
        ButterKnife.bind(this, v);

        playlistsRv = v.findViewById(R.id.playslists_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        playlistsRv.setLayoutManager(layoutManager);

//        ArrayList<Playlist> playlists = new ArrayList<>(); this was for MVC now we use presenter
//        insertMockPlaylists(playlists); this was for MVC now we use presenter

        playlistPresenter = new PlaylistsPresenterImp(this);

        //filter-butterknifed
//        mFilterEditText = v.findViewById(R.id.filter_edit_text);
//        mFilterButton = v.findViewById(R.id.filter_button);
//        mFilterButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String filterText = mFilterEditText.getText().toString();
//                playlistPresenter.getFilteredPlaylists(filterText);
//            }
//        });

        //end of filter



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
public void showPlaylists(ArrayList<PlaylistUI> playlists) {
    PlaylistsRvAdapter playlistsRvAdapter = new PlaylistsRvAdapter(playlists, new OnPlaylistClickListener() {
        @Override
        public void onPlaylistClicked(PlaylistUI playlist) {
            Timber.d("the playlist "
                    + playlist.getName() + " got clicked");

            Toast.makeText(getActivity(), "the playlist "
                    + playlist.getName() + " got clicked", Toast.LENGTH_LONG).show();
        }
    }, getActivity());
    playlistsRv.setAdapter(playlistsRvAdapter);
}

    @OnClick(R.id.filter_button)
    public void filterPlaylists(View view) {
        String filterText = mFilterEditText.getText().toString();
        playlistPresenter.getFilteredPlaylists(filterText);
    }
}
