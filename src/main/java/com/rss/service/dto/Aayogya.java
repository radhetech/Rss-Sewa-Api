package com.rss.service.dto;

import java.io.Serializable;
import java.util.Map;

import jakarta.validation.constraints.NotNull;

public class Aayogya implements Serializable{

    @NotNull
    private Map bloodDonationCamp;

    @NotNull
    private Map healthCamp;

    @NotNull
    private Map eyeCheckupCamp;

    @NotNull
    private Map yogaCamp;

    @NotNull
    private Map divyangCamp;

    @NotNull
    private Map bloodDonorList;

    @NotNull
    private Map firstAidTraining;

    @NotNull
    private Map counseling;

    @NotNull
    private Map deAddictionCamp;

    @NotNull
    private Map otherActivity2;

    public Map getBloodDonationCamp() {
        return bloodDonationCamp;
    }

    public void setBloodDonationCamp(Map bloodDonationCamp) {
        this.bloodDonationCamp = bloodDonationCamp;
    }

    public Map getHealthCamp() {
        return healthCamp;
    }

    public void setHealthCamp(Map healthCamp) {
        this.healthCamp = healthCamp;
    }

    public Map getEyeCheckupCamp() {
        return eyeCheckupCamp;
    }

    public void setEyeCheckupCamp(Map eyeCheckupCamp) {
        this.eyeCheckupCamp = eyeCheckupCamp;
    }

    public Map getYogaCamp() {
        return yogaCamp;
    }

    public void setYogaCamp(Map yogaCamp) {
        this.yogaCamp = yogaCamp;
    }

    public Map getDivyangCamp() {
        return divyangCamp;
    }

    public void setDivyangCamp(Map divyangCamp) {
        this.divyangCamp = divyangCamp;
    }

    public Map getBloodDonorList() {
        return bloodDonorList;
    }

    public void setBloodDonorList(Map bloodDonorList) {
        this.bloodDonorList = bloodDonorList;
    }

    public Map getFirstAidTraining() {
        return firstAidTraining;
    }

    public void setFirstAidTraining(Map firstAidTraining) {
        this.firstAidTraining = firstAidTraining;
    }

    public Map getCounseling() {
        return counseling;
    }

    public void setCounseling(Map counseling) {
        this.counseling = counseling;
    }

    public Map getDeAddictionCamp() {
        return deAddictionCamp;
    }

    public void setDeAddictionCamp(Map deAddictionCamp) {
        this.deAddictionCamp = deAddictionCamp;
    }

    public Map getOtherActivity2() {
        return otherActivity2;
    }

    public void setOtherActivity2(Map otherActivity2) {
        this.otherActivity2 = otherActivity2;
    }

    
    
}
