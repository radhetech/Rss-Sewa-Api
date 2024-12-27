package com.rss.service.dto;

import java.io.Serializable;


public class SummaryReportDTO implements Serializable{

    private String jillaName;

    private int mahaNagarCount;

    private int sevaVastiCount;

    private int totalVastiWithSevaKarya;

    private int totalShakhaWithSevaKarya;

    private int totalSevaKarya;

    private int monthlyvastiContactBranchandMeetingNumber;

    public String getJillaName() {
        return jillaName;
    }

    public void setJillaName(String jillaName) {
        this.jillaName = jillaName;
    }

    public int getMahaNagarCount() {
        return mahaNagarCount;
    }

    public void setMahaNagarCount(int mahaNagarCount) {
        this.mahaNagarCount = mahaNagarCount;
    }

    public int getSevaVastiCount() {
        return sevaVastiCount;
    }

    public void setSevaVastiCount(int sevaVastiCount) {
        this.sevaVastiCount = sevaVastiCount;
    }

    public int getTotalVastiWithSevaKarya() {
        return totalVastiWithSevaKarya;
    }

    public void setTotalVastiWithSevaKarya(int totalVastiWithSevaKarya) {
        this.totalVastiWithSevaKarya = totalVastiWithSevaKarya;
    }

    public int getTotalShakhaWithSevaKarya() {
        return totalShakhaWithSevaKarya;
    }

    public void setTotalShakhaWithSevaKarya(int totalShakhaWithSevaKarya) {
        this.totalShakhaWithSevaKarya = totalShakhaWithSevaKarya;
    }

    public int getTotalSevaKarya() {
        return totalSevaKarya;
    }

    public void setTotalSevaKarya(int totalSevaKarya) {
        this.totalSevaKarya = totalSevaKarya;
    }

    public int getMonthlyvastiContactBranchandMeetingNumber() {
        return monthlyvastiContactBranchandMeetingNumber;
    }

    public void setMonthlyvastiContactBranchandMeetingNumber(int monthlyvastiContactBranchandMeetingNumber) {
        this.monthlyvastiContactBranchandMeetingNumber = monthlyvastiContactBranchandMeetingNumber;
    } 

    

}
