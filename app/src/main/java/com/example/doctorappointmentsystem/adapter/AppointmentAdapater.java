package com.example.doctorappointmentsystem.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctorappointmentsystem.R;
import com.example.doctorappointmentsystem.model.appointmentModel;

import java.util.List;

public class AppointmentAdapater extends  RecyclerView.Adapter<AppointmentAdapater.AppointmentViewHolder> {

    Context mcontext;
    List<appointmentModel> lstappoint;

    public AppointmentAdapater(Context mcontext,List<appointmentModel> lstappoint){
        this.mcontext = mcontext;
        this.lstappoint = lstappoint;
    }

    @NonNull
    @Override
    public AppointmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.appointment,parent,false);
        return new AppointmentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AppointmentViewHolder holder, int position) {

        appointmentModel  apoint = lstappoint.get(position);

        holder.txtdate.setText(apoint.getAppointmentDate());
        holder.txttime.setText(apoint.getAppointmentTime());
        holder.txtquery.setText(apoint.getQuery());


    }


    @Override
    public int getItemCount() {
        return lstappoint.size();
    }

    public class AppointmentViewHolder extends RecyclerView.ViewHolder{
        TextView txtdate,txttime, txtquery, txt4;

        public AppointmentViewHolder(@NonNull View itemView) {
            super(itemView);
           txtdate = itemView.findViewById(R.id.tvDoctor);
           txttime  = itemView.findViewById(R.id.tvTime);
            txtquery  = itemView.findViewById(R.id.tvQuery);
            txt4 = itemView.findViewById(R.id.btnCancel);

        }
    }
}
