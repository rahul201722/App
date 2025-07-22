package com.rahul.cvapp.model;

public class Education {
    private String institution;
    private String location;
    private String degree;
    private String duration;
    private String gpa;
    private String coursework;

    public Education() {}

    public Education(String institution, String location, String degree, String duration, String gpa, String coursework) {
        this.institution = institution;
        this.location = location;
        this.degree = degree;
        this.duration = duration;
        this.gpa = gpa;
        this.coursework = coursework;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getCoursework() {
        return coursework;
    }

    public void setCoursework(String coursework) {
        this.coursework = coursework;
    }
}
