package com.example.madcamp_week2.server;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @GET("/login")
    Call<LoginResult> executeLogin(@Body HashMap<String, String> map);

    @POST("/post/add")
    Call<Void> executePostAdd(@Body HashMap<String,String> map);

    @POST("/user/add")
    Call<Void> executeSignup(@Body HashMap<String,String> map);

    @POST("/rest/getone")
    Call<RestResult> executeGetOneRest(@Body HashMap<String, String> map);

    @POST("/user/getfavorites")
    Call<List<RestResult>> executeGetMyFavorites(@Body HashMap<String, String> map);

    @GET("/rest/getall")
    Call<List<RestResult>> executeGetAllRest();

    @GET("post/getall")
    Call<List<PostResult>> executeGetAllPost();
}
