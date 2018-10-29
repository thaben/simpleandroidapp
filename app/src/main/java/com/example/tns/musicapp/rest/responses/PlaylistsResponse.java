package com.example.tns.musicapp.rest.responses;

import com.example.tns.musicapp.playlists.Playlist;

import java.util.ArrayList;

public class PlaylistsResponse {
    private ArrayList<Playlist> Result;

    public PlaylistsResponse(ArrayList<Playlist> result) {
        Result = result;
    }

    public ArrayList<Playlist> getResult() {

        return Result;
    }

    public void setResult(ArrayList<Playlist> result) {
        Result = result;
    }
}
