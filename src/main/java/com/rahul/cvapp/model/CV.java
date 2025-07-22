package com.rahul.cvapp.model;

import java.util.List;

public class CV {
    private PersonalInfo personalInfo;
    private String researchInterests;
    private List<Education> education;
    private TechnicalSkills technicalSkills;
    private List<Publication> publications;
    private List<Experience> researchExperience;
    private List<Project> technicalProjects;
    private List<Experience> industryExperience;
    private List<Award> awards;
    private List<String> publicProfiles;

    // Constructors
    public CV() {}

    // Getters and Setters
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public String getResearchInterests() {
        return researchInterests;
    }

    public void setResearchInterests(String researchInterests) {
        this.researchInterests = researchInterests;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public TechnicalSkills getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(TechnicalSkills technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public List<Experience> getResearchExperience() {
        return researchExperience;
    }

    public void setResearchExperience(List<Experience> researchExperience) {
        this.researchExperience = researchExperience;
    }

    public List<Project> getTechnicalProjects() {
        return technicalProjects;
    }

    public void setTechnicalProjects(List<Project> technicalProjects) {
        this.technicalProjects = technicalProjects;
    }

    public List<Experience> getIndustryExperience() {
        return industryExperience;
    }

    public void setIndustryExperience(List<Experience> industryExperience) {
        this.industryExperience = industryExperience;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public List<String> getPublicProfiles() {
        return publicProfiles;
    }

    public void setPublicProfiles(List<String> publicProfiles) {
        this.publicProfiles = publicProfiles;
    }
}
