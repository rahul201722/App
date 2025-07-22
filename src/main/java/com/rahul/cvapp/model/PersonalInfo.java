package com.rahul.cvapp.model;

public class PersonalInfo {
    private String name;
    private String email;
    private String phone;
    private String linkedin;

    public PersonalInfo() {}

    public PersonalInfo(String name, String email, String phone, String linkedin) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.linkedin = linkedin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
}
