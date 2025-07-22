package com.rahul.cvapp.model;

import java.util.List;

public class Project {
    private String title;
    private String year;
    private List<String> description;

    public Project() {}

    public Project(String title, String year, List<String> description) {
        this.title = title;
        this.year = year;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }
}
