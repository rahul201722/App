package com.rahul.cvapp.controller;

import com.rahul.cvapp.model.CV;
import com.rahul.cvapp.service.CVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CVController {

    @Autowired
    private CVService cvService;

    @GetMapping("/")
    public String home(Model model) {
        CV cv = cvService.getCV();
        model.addAttribute("cv", cv);
        return "cv-simple";
    }

    @GetMapping("/cv")
    public String cv(Model model) {
        CV cv = cvService.getCV();
        model.addAttribute("cv", cv);
        return "cv";
    }

    @GetMapping("/cv/compact")
    public String cvCompact(Model model) {
        CV cv = cvService.getCV();
        model.addAttribute("cv", cv);
        return "cv-compact";
    }

    @GetMapping("/cv/simple")
    public String cvSimple(Model model) {
        CV cv = cvService.getCV();
        model.addAttribute("cv", cv);
        return "cv-simple";
    }

    @GetMapping("/debug")
    @ResponseBody
    public String debug() {
        CV cv = cvService.getCV();
        StringBuilder sb = new StringBuilder();
        sb.append("Research Experience size: ").append(cv.getResearchExperience().size()).append("\n");
        cv.getResearchExperience().forEach(exp -> {
            sb.append("- ").append(exp.getTitle()).append(" at ").append(exp.getCompany()).append("\n");
            sb.append("  Responsibilities: ").append(exp.getResponsibilities().size()).append("\n");
        });
        sb.append("\nIndustry Experience size: ").append(cv.getIndustryExperience().size()).append("\n");
        cv.getIndustryExperience().forEach(exp -> {
            sb.append("- ").append(exp.getTitle()).append(" at ").append(exp.getCompany()).append("\n");
        });
        sb.append("\nAwards size: ").append(cv.getAwards().size()).append("\n");
        cv.getAwards().forEach(award -> {
            sb.append("- ").append(award.getTitle()).append("\n");
        });
        return sb.toString();
    }
}
