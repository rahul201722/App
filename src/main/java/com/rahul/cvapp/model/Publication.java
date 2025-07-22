package com.rahul.cvapp.model;

public class Publication {
    private String authors;
    private String title;
    private String journal;
    private String year;
    private String volume;
    private String pages;
    private String url;

    public Publication() {}

    public Publication(String authors, String title, String journal, String year, String volume, String pages, String url) {
        this.authors = authors;
        this.title = title;
        this.journal = journal;
        this.year = year;
        this.volume = volume;
        this.pages = pages;
        this.url = url;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
