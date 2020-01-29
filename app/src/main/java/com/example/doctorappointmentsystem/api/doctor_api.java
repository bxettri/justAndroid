package com.example.doctorappointmentsystem.api;

import com.example.doctorappointmentsystem.model.patients;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface doctor_api {
    @POST("patients/signup")
    Call<Void> signup(@Body patients user);

    @POST ("patients/login")
    Call<Void> login(@Body patients user);


}
