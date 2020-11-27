package com.example.ouk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
    @GET("/Posts")
    Call<List<Post>> getPosts();
}
