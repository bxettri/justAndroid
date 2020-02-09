package com.example.doctorappointmentsystem.model;

public class doctor {
    private String username;
    private String password;
    private String firstName;


    private String qualification;
    private String lastName;
    private String address;
    private String email;
    private String profileImage;

    public doctor(String username, String email,String password, String firstName, String qualification, String lastName, String address, String profileImage)
    {
        this.email=email;
        this.username = username;
        this.firstName= firstName;
        this.password=password;
        this.lastName=lastName;
        this.address=address;
        this.profileImage = profileImage;
        this.qualification= qualification;

    }
    public doctor(String username, String password){

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
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
