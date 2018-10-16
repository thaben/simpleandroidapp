package com.example.tns.musicapp.playlists;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.example.tns.musicapp.R;

import static com.example.tns.musicapp.R.id.playlists_root;


public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.playlists_root, new PlaylistsFragment())
                .commit();

    }

}
