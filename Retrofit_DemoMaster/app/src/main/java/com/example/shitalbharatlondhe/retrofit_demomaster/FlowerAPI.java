package com.example.shitalbharatlondhe.retrofit_demomaster;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Felix-ITS012 on 12/05/16.
 */
public interface FlowerAPI
{

    @GET("/feeds/flowers.json")
    public Call<List<Flower>> getData();


}
