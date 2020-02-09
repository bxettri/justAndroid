package com.example.doctorappointmentsystem.api;

import com.example.doctorappointmentsystem.model.doctor;
import com.example.doctorappointmentsystem.model.patients;
import com.example.doctorappointmentsystem.serverResponse.doctorResponse;
import com.example.doctorappointmentsystem.serverResponse.patientResponse;
import com.example.doctorappointmentsystem.serverResponse.picResponse;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface doctor_api {
    @Multipart
    @POST("upload")
    Call<picResponse> uploadPic(@Part MultipartBody.Part file);

    @POST("patient/signup")
    Call<patientResponse> signup(@Body patients user);

    @POST("doctor/signup")
    Call<doctorResponse> signup(@Body doctor doc);

    @POST ("doctor/login")
    Call<doctorResponse> login(@Body doctor doc);

    @POST ("patient/login")
    Call<patientResponse> login(@Body patients user);

    @GET ("patient/me")
    Call<patientResponse> getUserDetails(@Header("Authorization") String token);

    @GET ("doctor/me")
    Call<doctorResponse> getDoctorDetails(@Header("Authorization") String token);
}
