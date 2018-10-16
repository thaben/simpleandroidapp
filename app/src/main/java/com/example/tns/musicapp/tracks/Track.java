package com.example.tns.musicapp.tracks;

public class Track {

    private String trackName;
    private String trackArtist;
    private String trackCategory;
    private String tracklogoUrl;

    public Track(String trackName, String trackArtist, String trackCategory) {
        this.trackName = trackName;
        this.trackArtist = trackArtist;
        this.trackCategory = trackCategory;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public String getTrackCategory() {
        return trackCategory;
    }

    public void setTrackCategory(String trackCategory) {
        this.trackCategory = trackCategory;
    }

    public String getTracklogoUrl() {
        return tracklogoUrl;
    }

    public void setTracklogoUrl(String tracklogoUrl) {
        this.tracklogoUrl = tracklogoUrl;
    }
}
