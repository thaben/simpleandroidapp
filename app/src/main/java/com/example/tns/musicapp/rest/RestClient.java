package com.example.tns.musicapp.rest;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static RestAPI API;

    static {
        setupRestClient();
    }

    public static RestAPI call() {
        return API;
    }

    private static void setupRestClient() {

        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();


        final Retrofit retrorift = new Retrofit.Builder()
                .baseUrl("http://akazoo.com/services/Test/TestMobileService.svc/")
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API = retrorift.create(RestAPI.class);

    }
}
