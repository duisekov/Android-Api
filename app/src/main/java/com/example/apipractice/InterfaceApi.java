package com.example.apipractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceApi {

    @GET("posts")
    Call<List<Post>> getPosts();

}
