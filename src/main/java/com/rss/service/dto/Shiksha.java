package com.rss.service.dto;

import java.io.Serializable;
import java.util.Map;

import jakarta.validation.constraints.NotNull;

public class Shiksha implements Serializable{

    @NotNull
    private Map educationMaterialDistribution;

    @NotNull
    private Map examGuidanceCamp;

    @NotNull
    private Map feeAssistance;

    @NotNull
    private Map personalityDevelopmentCamp;

    @NotNull
    private Map otherActivity1;

    public Map getEducationMaterialDistribution() {
        return educationMaterialDistribution;
    }

    public void setEducationMaterialDistribution(Map educationMaterialDistribution) {
        this.educationMaterialDistribution = educationMaterialDistribution;
    }

    public Map getExamGuidanceCamp() {
        return examGuidanceCamp;
    }

    public void setExamGuidanceCamp(Map examGuidanceCamp) {
        this.examGuidanceCamp = examGuidanceCamp;
    }

    public Map getFeeAssistance() {
        return feeAssistance;
    }

    public void setFeeAssistance(Map feeAssistance) {
        this.feeAssistance = feeAssistance;
    }

    public Map getPersonalityDevelopmentCamp() {
        return personalityDevelopmentCamp;
    }

    public void setPersonalityDevelopmentCamp(Map personalityDevelopmentCamp) {
        this.personalityDevelopmentCamp = personalityDevelopmentCamp;
    }

    public Map getOtherActivity1() {
        return otherActivity1;
    }

    public void setOtherActivity1(Map otherActivity1) {
        this.otherActivity1 = otherActivity1;
    }

    

}
