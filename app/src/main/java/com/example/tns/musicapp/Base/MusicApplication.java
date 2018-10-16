package com.example.tns.musicapp.Base;

import android.app.Application;
import android.util.Log;

public class MusicApplication extends Application {

    //Empty Constructor
    public MusicApplication(){

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("CS_TAG", "Application got created");
    }

    @Override
    public void onTerminate() {
        Log.e("CS_TAG", "Application got terinate");
        super.onTerminate();
    }


}
