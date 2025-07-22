package com.rahul.cvapp.model;

public class TechnicalSkills {
    private String programming;
    private String frameworks;
    private String tools;
    private String domains;

    public TechnicalSkills() {}

    public TechnicalSkills(String programming, String frameworks, String tools, String domains) {
        this.programming = programming;
        this.frameworks = frameworks;
        this.tools = tools;
        this.domains = domains;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(String frameworks) {
        this.frameworks = frameworks;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }
}
