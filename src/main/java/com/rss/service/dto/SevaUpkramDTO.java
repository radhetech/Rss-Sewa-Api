package com.rss.service.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.annotation.Nonnegative;

import com.rss.domain.SevaUpkram;

import jakarta.validation.constraints.NotNull;
 
public class SevaUpkramDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @NotNull
    private Shiksha shiksha;

    @NotNull
    private Aayogya aayogya;

    @NotNull
    private Swavalamban swavalamban;

    @NotNull
    private Samajik samajik;


    @NotNull
    private String prant;

    @NotNull
    private String vibhagId;

    @NotNull
    private String jillaId;

    @NotNull
    private String talukaId;

    @NotNull
    private String sevaVastiId;

    @NotNull
    private String month;

    @Nonnegative
    private int year;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    public SevaUpkramDTO() {

    }

    public SevaUpkramDTO(SevaUpkram sevaUpkram) {
        this.id = sevaUpkram.getId();
        this.shiksha = sevaUpkram.getShiksha();
        this.aayogya = sevaUpkram.getAayogya();
        this.swavalamban = sevaUpkram.getSwavalamban();
        this.samajik = sevaUpkram.getSamajik();
        this.prant = sevaUpkram.getPrant();
        this.vibhagId = sevaUpkram.getVibhagId();
        this.jillaId = sevaUpkram.getJillaId();
        this.talukaId = sevaUpkram.getTalukaId();
        this.createdBy = sevaUpkram.getCreatedBy();
        this.createdDate = sevaUpkram.getCreatedDate();
        this.lastModifiedBy = sevaUpkram.getLastModifiedBy();
        this.lastModifiedDate = sevaUpkram.getLastModifiedDate();
        this.sevaVastiId = sevaUpkram.getSevaVastiId();
        this.month = sevaUpkram.getMonth();
        this.year = sevaUpkram.getYear();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Shiksha getShiksha() {
        return shiksha;
    }

    public void setShiksha(Shiksha shiksha) {
        this.shiksha = shiksha;
    }

    public Aayogya getAayogya() {
        return aayogya;
    }

    public void setAayogya(Aayogya aayogya) {
        this.aayogya = aayogya;
    }

    public Swavalamban getSwavalamban() {
        return swavalamban;
    }

    public void setSwavalamban(Swavalamban swavalamban) {
        this.swavalamban = swavalamban;
    }

    public Samajik getSamajik() {
        return samajik;
    }

    public void setSamajik(Samajik samajik) {
        this.samajik = samajik;
    }

    public String getPrant() {
        return prant;
    }

    public void setPrant(String prant) {
        this.prant = prant;
    }

    public String getVibhagId() {
        return vibhagId;
    }

    public void setVibhagId(String vibhagId) {
        this.vibhagId = vibhagId;
    }

    public String getJillaId() {
        return jillaId;
    }

    public void setJillaId(String jillaId) {
        this.jillaId = jillaId;
    }

    public String getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(String talukaId) {
        this.talukaId = talukaId;
    }

    public String getSevaVastiId() {
        return sevaVastiId;
    }

    public void setSevaVastiId(String sevaVastiId) {
        this.sevaVastiId = sevaVastiId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        return "SevaUpkramDTO{" +
                "shiksha='" + shiksha + '\'' +
                ", aayogya='" + aayogya + '\'' +
                ", swavalamban='" + swavalamban + '\'' +
                ", samajik='" + samajik + '\'' +
                ", prant='" + prant + '\'' +
                ", vibhagId='" + vibhagId + '\'' +
                ", jillaId='" + jillaId + '\'' +
                ", talukaId='" + talukaId + '\'' +
                ", sevaVastiId='" + sevaVastiId + '\'' +
                ", month='" + month + '\'' +
                ", year=" + year +
                "}";
    }

}
