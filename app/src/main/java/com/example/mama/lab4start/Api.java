package com.example.mama.lab4start;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {

    String BASE_URL = "http://anontech.info/courses/cse491/";

    @GET("employees.json")
    Call<List<Place>> getPlace();
}