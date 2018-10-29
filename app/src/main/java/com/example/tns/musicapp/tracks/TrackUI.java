package com.example.tns.musicapp.tracks;

public class TrackUI {

    private String trackName;
    private String trackArtist;
    private String trackCategory;
    private String trackLogoUrl;
    private int trackNameColorid;

    public TrackUI(String trackName, String trackArtist, String trackCategory) {
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

    public String getTrackLogoUrl() {
        return trackLogoUrl;
    }

    public void setTrackLogoUrl(String trackLogoUrl) {
        this.trackLogoUrl = trackLogoUrl;
    }

    public int getTrackNameColorid() {
        return trackNameColorid;
    }

    public void setTrackNameColorid(int trackNameColorid) {
        this.trackNameColorid = trackNameColorid;
    }
}
