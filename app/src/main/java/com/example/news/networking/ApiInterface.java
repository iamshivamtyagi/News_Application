package com.example.news.networking;

import com.example.news.models.NewsClass;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")

    Call<NewsClass> getNews(
        @Query("country") String country,
        @Query("apiKey") String apiKey
    );
}
