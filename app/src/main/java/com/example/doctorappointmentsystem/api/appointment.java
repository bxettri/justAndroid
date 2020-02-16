package com.example.doctorappointmentsystem.api;

import com.example.doctorappointmentsystem.model.appointmentModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface appointment {
    @POST("/appointment/appointDoctor")
    Call<appointmentModel> saveAppointment(@Header("Authorization") String token, @Body appointmentModel appointment);

    @GET("/appointment/getAppointment")
    Call<List<appointmentModel>> getAppointment(@Header("Authorization") String token);
}
