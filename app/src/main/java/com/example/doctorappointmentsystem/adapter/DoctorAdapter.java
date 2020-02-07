package com.example.doctorappointmentsystem.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctorappointmentsystem.R;
import com.example.doctorappointmentsystem.activity.BookingActivity;
import com.example.doctorappointmentsystem.model.doctor;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DoctorAdapter extends  RecyclerView.Adapter<DoctorAdapter.DocterViewHolder> {

    Context mcontext;
    List<doctor> doctorList;

    public DoctorAdapter(Context mcontext, List<doctor> doctorList){
        this.mcontext = mcontext;
        this.doctorList = doctorList;
    }


    @NonNull
    @Override
    public DocterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.docterlist,parent,false);
        return new DocterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DocterViewHolder holder, int position) {
        doctor doc = doctorList.get(position);
        holder.txtdoctername.setText(doc.getFirstname());

       holder.txtdoctername.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(mcontext,BookingActivity.class);
               mcontext.startActivity(i);
           }
       });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    public class DocterViewHolder extends RecyclerView.ViewHolder{
        CircleImageView docterimg;
        TextView txtdoctername;

        public DocterViewHolder(@NonNull View itemView) {
            super(itemView);

            docterimg = itemView.findViewById(R.id.imgProfile);
            txtdoctername = itemView.findViewById(R.id.docterfullName);


        }
    }

}
