package com.example.tns.musicapp.playlists;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tns.musicapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlaylistsRvAdapter extends RecyclerView.Adapter<PlaylistsRvAdapter.PlaylistsViewHolder> {

    private ArrayList<Playlist> playlists;

    TextView mPlaylistName;
    TextView mTracksNumber;
    ImageView mPlaylistLogo;

    public PlaylistsRvAdapter(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    //create inner class for less memory references
    public static class PlaylistsViewHolder extends RecyclerView.ViewHolder {
        TextView mPlaylistName;
        TextView mTracksNumber;
        ImageView mPlaylistLogo;

        public PlaylistsViewHolder(View v) {
            super(v);
            mPlaylistName = v.findViewById(R.id.playlists_name);
            mTracksNumber = v.findViewById(R.id.tracks_number);
            mPlaylistLogo = v.findViewById(R.id.playlist_logo);
        }
    }


    @NonNull
    @Override
    public PlaylistsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.view_playlist_item, viewGroup, false);
        PlaylistsViewHolder vh = new PlaylistsViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistsViewHolder viewHolder, int i) {
        viewHolder.mPlaylistName.setText(playlists.get(i).getName());
        viewHolder.mTracksNumber.setText(String.valueOf(playlists.get(i).getItemCount()));
        viewHolder.mPlaylistLogo.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
