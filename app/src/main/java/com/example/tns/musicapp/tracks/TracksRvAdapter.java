package com.example.tns.musicapp.tracks;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tns.musicapp.R;

import java.util.ArrayList;

public class TracksRvAdapter extends RecyclerView.Adapter<TracksRvAdapter.TracksViewHolder> {

    ArrayList<Track> tracks;

    public TracksRvAdapter(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    //inner class to save memory for less memory usage-references
    public static class TracksViewHolder extends RecyclerView.ViewHolder{

        TextView mTracksName;
        TextView mTracksArtist;
        TextView mTracksCategory;
        ImageView mTracksLogo;

        public TracksViewHolder(View v) {
            super(v);
            mTracksName = v.findViewById(R.id.track_name);
            mTracksArtist = v.findViewById(R.id.track_artist);
            mTracksCategory = v.findViewById(R.id.track_category);
            mTracksLogo = v.findViewById(R.id.track_logo);
        }
    }


    @NonNull
    @Override
    public TracksViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.view_track_item, viewGroup, false);
        TracksRvAdapter.TracksViewHolder vh = new TracksViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TracksViewHolder viewHolder, int i) {
        viewHolder.mTracksName.setText(tracks.get(i).getTrackName());
        viewHolder.mTracksArtist.setText(tracks.get(i).getTrackArtist());
        viewHolder.mTracksCategory.setText(tracks.get(i).getTrackCategory());
        viewHolder.mTracksLogo.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }






}
