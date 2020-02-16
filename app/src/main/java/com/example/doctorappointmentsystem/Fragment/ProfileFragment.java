package com.example.doctorappointmentsystem.Fragment;

import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.doctorappointmentsystem.R;
import com.example.doctorappointmentsystem.activity.MainActivity;
import com.example.doctorappointmentsystem.api.doctor_api;
import com.example.doctorappointmentsystem.serverResponse.patientResponse;
import com.example.doctorappointmentsystem.url.url;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileFragment extends Fragment {


    EditText firstName, lastName, address, email, username;
    Button btnUpdate;
    ImageView ivProfile;


    Dialog editProfile, editPass;



  @Nullable
    @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.fragment_profile, container, false);


      username = v.findViewById(R.id.username);
      firstName = v.findViewById(R.id.firstName);
      lastName = v.findViewById(R.id.lastName);
      email = v.findViewById(R.id.email);
      address = v.findViewById(R.id.address);
      ivProfile  = v.findViewById(R.id.ivProfile);
      btnUpdate = v.findViewById(R.id.btnUpdate);


        loadUserDetails();

      return v;




  }

    private void loadUserDetails() {

        doctor_api userDetails = url.getInstance().create(doctor_api.class);
        Call<patientResponse> callUser = userDetails.getUserDetails(url.token);

        callUser.enqueue(new Callback<patientResponse>() {
            @Override
            public void onResponse(Call<patientResponse> call, Response<patientResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(), "Error : Couldn't get user", Toast.LENGTH_SHORT).show();
                }
                username.setText(response.body().getUsername());
                firstName.setText(response.body().getFirstName());
                lastName.setText(response.body().getLastName());
                address.setText(response.body().getAddress());
                email.setText(response.body().getEmail());

                String imgPath = url.imagePath +  response.body().getProfileImage();
                Picasso.get().load(imgPath).into(ivProfile);

            }

            @Override
            public void onFailure(Call<patientResponse> call, Throwable t) {

            }
        });




    }

}
