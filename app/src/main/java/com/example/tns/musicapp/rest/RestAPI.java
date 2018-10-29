package com.example.tns.musicapp.rest;


import com.example.tns.musicapp.rest.responses.PlaylistsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestAPI {

    @GET("playlists")
    Call<PlaylistsResponse> fetchPlaylists();

}
