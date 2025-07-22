package com.rahul.cvapp.service;

import com.rahul.cvapp.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CVService {

    public CV getCV() {
        CV cv = new CV();
        
        // Personal Info
        PersonalInfo personalInfo = new PersonalInfo(
            "Rahul Ranjan",
            "rahulrkm0038@gmail.com",
            "+91 7997193400",
            "https://www.linkedin.com/in/rahul-ranjan-b595891b1"
        );
        cv.setPersonalInfo(personalInfo);

        // Research Interests
        cv.setResearchInterests("Artificial Intelligence, Biomedical Signal Processing, Machine Learning, Computer Vision, Mobile Health Monitoring, Time Series Analysis, Deep Learning for Vital Sign Estimation");

        // Education
        List<Education> education = Arrays.asList(
            new Education(
                "Monash University",
                "Melbourne, Australia",
                "Master of Artificial Intelligence",
                "2023 -- 2025",
                null,
                "Deep Learning, Intelligent Image & Video Analysis, Project Management, Machine Learning, Data Science"
            ),
            new Education(
                "Birla Institute of Technology and Science, Pilani (BITS Pilani)",
                "India",
                "B.E. (Hons.) Electronics & Instrumentation + M.Sc. (Hons.) Physics",
                "2017 -- 2022",
                "3.0 / 4.0",
                null
            )
        );
        cv.setEducation(education);

        // Technical Skills
        TechnicalSkills technicalSkills = new TechnicalSkills(
            "Python, SQL, Java, R, MATLAB",
            "PyTorch, TensorFlow, Scikit-learn, Flask, Pandas, Shiny, NumPy, Matplotlib",
            "Docker, Git, Tableau, MongoDB, UNIX, PostgreSQL",
            "Deep Learning, Predictive Modeling, Signal Processing, Biomedical AI, IoT Analytics, Statistical Analysis"
        );
        cv.setTechnicalSkills(technicalSkills);

        // Publications
        List<Publication> publications = Arrays.asList(
            new Publication(
                "Roha, V. S., Ranjan, R., & Yuce, M. R.",
                "Evolving blood pressure estimation: From feature analysis to image-based deep learning models",
                "Journal of Medical Systems",
                "2025",
                "49(1), 97",
                null,
                "https://doi.org/10.1007/s10916-025-02010-4"
            )
        );
        cv.setPublications(publications);

        // Research Experience
        List<Experience> researchExperience = Arrays.asList(
            new Experience(
                "Research Intern",
                "Centre for Railway Information Systems (CRIS)",
                "New Delhi",
                "Jan 2022 -- May 2022",
                Arrays.asList(
                    "Designed predictive maintenance algorithms, reducing unplanned equipment downtime by 18%",
                    "Developed scalable PostgreSQL databases with 99.9% uptime for 100+ concurrent users",
                    "Applied machine learning techniques for railway infrastructure monitoring",
                    "Collaborated with cross-functional teams to implement data-driven solutions"
                )
            ),
            new Experience(
                "Master Thesis: Statistical Physics Simulation",
                "BITS Pilani",
                "India",
                "2022",
                Arrays.asList(
                    "Conducted Monte Carlo simulations on 2D/3D Ising models using Python",
                    "Analyzed phase transitions and critical exponents; improved runtime by 40% using vectorization and multiprocessing",
                    "Developed novel computational methods for statistical mechanics problems",
                    "Published findings demonstrating advanced understanding of phase transition dynamics"
                )
            )
        );
        cv.setResearchExperience(researchExperience);

        // Technical Projects
        List<Project> technicalProjects = Arrays.asList(
            new Project(
                "LLM-based Email Generation Platform",
                "2024",
                Arrays.asList(
                    "Built an end-to-end civic engagement tool integrating OpenRouter LLM API",
                    "Applied advanced prompt engineering and integrated chatbot with content safety filters",
                    "Flask backend and React frontend implementation for real-time response generation",
                    "Implemented user authentication and session management",
                    "Deployed scalable microservices architecture with Docker containers"
                )
            ),
            new Project(
                "Biomedical Signal Processing Research",
                "2024-2025",
                Arrays.asList(
                    "Developing deep learning models for blood pressure estimation from physiological signals",
                    "Implementing computer vision techniques for non-invasive health monitoring",
                    "Working with time series analysis for vital sign extraction",
                    "Contributing to cutting-edge research in mobile health applications"
                )
            )
        );
        cv.setTechnicalProjects(technicalProjects);

        // Industry Experience
        List<Experience> industryExperience = Arrays.asList(
            new Experience(
                "Information Technology Officer",
                "Aglow Engineers",
                "Kolkata",
                "Jun 2022 -- Feb 2023",
                Arrays.asList(
                    "Built ETL pipelines using Python & SQL for daily operational analytics",
                    "Created Tableau dashboards for 15+ KPIs; improved decision-making by 22%",
                    "Optimized inventory via statistical modeling, saving over $10,000 annually",
                    "Led digital transformation initiatives for engineering workflows",
                    "Managed database systems and ensured data integrity across platforms"
                )
            ),
            new Experience(
                "Software Development Intern – Timing Tooling",
                "Xilinx (now AMD)",
                "Hyderabad",
                "Jul 2021 -- Dec 2021",
                Arrays.asList(
                    "Developed Data Flow Sync Checker used across teams (25+ engineers)",
                    "Contributed to performance-critical tooling in FPGA development environment",
                    "Implemented automated testing frameworks for hardware design verification",
                    "Collaborated with senior engineers on timing analysis and optimization tools",
                    "Gained expertise in hardware description languages and FPGA architecture"
                )
            )
        );
        cv.setIndustryExperience(industryExperience);

        // Awards
        List<Award> awards = Arrays.asList(
            new Award(
                "The Duke of Edinburgh's International Award – Silver",
                "2015",
                "Recognized for leadership, resilience, and social responsibility in youth initiatives"
            )
        );
        cv.setAwards(awards);

        // Public Profiles
        cv.setPublicProfiles(Arrays.asList(
            "https://www.linkedin.com/in/rahul-ranjan-b595891b1"
        ));

        return cv;
    }
}
