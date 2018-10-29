package com.example.tns.musicapp.playlists;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tns.musicapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlaylistsRvAdapter extends RecyclerView.Adapter<PlaylistsRvAdapter.PlaylistsViewHolder> {

    private ArrayList<PlaylistUI> playlists;
    private OnPlaylistClickListener listener; //onClickListener
    private Context context; //color in list


    public PlaylistsRvAdapter(ArrayList<PlaylistUI> playlists) {
        this.playlists = playlists;
    }

    //onClickListener Constructor
    public PlaylistsRvAdapter(ArrayList<PlaylistUI> playlists, OnPlaylistClickListener listener, Context context) {
        this.playlists = playlists;
        this.listener = listener;
        this.context = context;
    }

    //create inner class for less memory references
    public static class PlaylistsViewHolder extends RecyclerView.ViewHolder {
        TextView mPlaylistName;
        TextView mTracksNumber;
        ImageView mPlaylistLogo;
        RelativeLayout mPlaylistItemRoot; //onClickListener

        public PlaylistsViewHolder(View v) {
            super(v);
            mPlaylistName = v.findViewById(R.id.playlists_name);
            mTracksNumber = v.findViewById(R.id.tracks_number);
            mPlaylistLogo = v.findViewById(R.id.playlist_logo);
            mPlaylistItemRoot = v.findViewById(R.id.playlist_item_root);  //onClickListener
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
        final int position = i;//onClickListener
        final PlaylistUI playlist = playlists.get(position);

        viewHolder.mPlaylistName.setText(playlists.get(i).getName());
        viewHolder.mTracksNumber.setText(String.valueOf(playlists.get(i).getItemCount()));
        viewHolder.mPlaylistLogo.setImageResource(R.mipmap.ic_launcher);
        //onClickListener
        viewHolder.mPlaylistItemRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onPlaylistClicked(playlist);
            }
        });
    }

    @Override
    public int getItemCount() {

        return playlists.size();
    }
}
