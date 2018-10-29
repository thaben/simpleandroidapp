package com.example.tns.musicapp.playlists;

public class PlaylistUI {

    private String photoUrl;
    private String playlistId;
    private String name;
    private int itemCount;
    private int colorId;


    public PlaylistUI(String playlistId, String name, int itemCount) {
        this.playlistId = playlistId;
        this.name = name;
        this.itemCount = itemCount;
    }

    public PlaylistUI(String playlistId, String name, int itemCount, String photoUrl) {
        this.playlistId = playlistId;
        this.name = name;
        this.itemCount = itemCount;
        this.photoUrl = photoUrl;
    }

    public String getPlaylistId() {

        return playlistId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getItemCount() {

        return itemCount;
    }

    public void setItemCount(int itemCount) {

        this.itemCount = itemCount;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getColorId() {

        return colorId;
    }

    public void setColorId(int colorId) {

        this.colorId = colorId;
    }
}
