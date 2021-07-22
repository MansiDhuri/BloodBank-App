package com.example.project.bloodbank.model;



public class LoginModel {

    private String Email;
    private String Password;
//    private boolean Admin;


//    public boolean isAdmin() {
//        return Admin;
//    }
//
//    public void setAdmin(boolean admin) {
//        Admin = admin;
//    }



    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public LoginModel(String email, String password) {
        Email = email;
        Password = password;
//        Admin = admin;
    }

    public LoginModel() {

    }
}
