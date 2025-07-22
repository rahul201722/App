package com.rahul.cvapp.model;

import java.util.List;

public class Experience {
    private String title;
    private String company;
    private String location;
    private String duration;
    private List<String> responsibilities;

    public Experience() {}

    public Experience(String title, String company, String location, String duration, List<String> responsibilities) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.duration = duration;
        this.responsibilities = responsibilities;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
