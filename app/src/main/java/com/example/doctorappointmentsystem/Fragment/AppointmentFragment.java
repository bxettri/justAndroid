package com.example.doctorappointmentsystem.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctorappointmentsystem.R;
import com.example.doctorappointmentsystem.adapter.DoctorAdapter;
import com.example.doctorappointmentsystem.model.doctor;

import java.util.ArrayList;
import java.util.List;

public class AppointmentFragment extends Fragment {

    RecyclerView rv;
    public static List<doctor> lstdocter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_appointment, container, false);

        rv = v.findViewById(R.id.recycler_docter);


        lstdocter = new ArrayList<>();
        lstdocter.add(new doctor("Ashish","ashish"));
        lstdocter.add(new doctor("Ashish","ashish"));
        lstdocter.add(new doctor("Ashish","ashish"));
        lstdocter.add(new doctor("Ashish","ashish"));


        DoctorAdapter doctorAdapter = new DoctorAdapter(getContext(),lstdocter);

        rv.setAdapter(doctorAdapter);
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));



        return  v;
    }
}
