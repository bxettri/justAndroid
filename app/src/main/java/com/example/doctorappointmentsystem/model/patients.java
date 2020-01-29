package com.example.doctorappointmentsystem.model;

public class patients {
    private String username;



    private String password;
    private String firstname;
    private String lastname;
    private String address;


    public patients(String username, String password, String address, String firstname, String lastname)
        {
           this.username = username;
           this.firstname= firstname;
           this.password=password;
           this.lastname=lastname;
           this.address=address;

         }
    public patients(String username, String password){

        this.username= username;
        this.password=password;
    }

    public String getUsername() {return username; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}