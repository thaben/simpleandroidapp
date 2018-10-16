package com.example.tns.musicapp.tracks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tns.musicapp.R;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.tracks_root, new TracksFragment())
                .commit();
    }
}
