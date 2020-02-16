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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.doctorappointmentsystem.R;

public class ProfileFragment extends Fragment {


    EditText firstName, lastName, address, email, username, password, profileImage;
    Button btnUpdate;
    ImageView imgProfilePic;


    Dialog editProfile, editPass;



   // @Nullable
    //@Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v= inflater.inflate(R.layout.fragment_profile, container, false);
//
//
//        editProfile = new Dialog(getActivity());
//        editProfile.setContentView(R.layout.profile_info);//Create edit_info Layout to show on Dialog
//        editProfile.setTitle("Edit Information");
//
//        username = editProfile.findViewById(R.id.username);
//        firstName= editProfile.findViewById(R.id.firstName);
//        lastName= editProfile.findViewById(R.id.lastName);
//        email= editProfile.findViewById(R.id.email);
//        address= editProfile.findViewById(R.id.address);
//        password= editProfile.findViewById(R.id.password);
//        profileImage= editProfile.findViewById(R.id.imageView);
//        btnUpdate= editPass.findViewById(R.id.btnUpdate);
//
//       // btnUpdate.setOnClickListener(this);
//
//
//
//    }
}
