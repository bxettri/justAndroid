package com.example.doctorappointmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.DnsResolver;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.doctorappointmentsystem.api.doctor_api;
import com.example.doctorappointmentsystem.model.patients;
import com.example.doctorappointmentsystem.url.url;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class loginActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnLogin, btnRegister;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btnRegister=findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                login();
                break;
            case R.id.btnRegister:
                openRegister();
                break;
                default:
                    break;
        }
    }

    private void login() {
        if(username.getText().toString()!=null && password.getText().toString()!=null){
            patients patientLogin = new patients(username.getText().toString(), password.getText().toString());
            doctor_api patientApi = url.getInstance().create(doctor_api.class);
            Call<Void> loginCall = patientApi.login(patientLogin);

            loginCall.enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    if(!response.isSuccessful()){
                        Toast.makeText(loginActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
                        return;
                    }
//                Toast.makeText(loginActivity.this, "Clicked Login", Toast.LENGTH_SHORT).show();
                    openRegister();
//                    openDashboard();

                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                    Toast.makeText(loginActivity.this, "Error" + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });

        }



    }



    public void openRegister(){
     Intent intent = new Intent(loginActivity.this, registerActivity.class);
     startActivity(intent);
    }
}
