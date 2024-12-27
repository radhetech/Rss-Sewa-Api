package com.rss.service.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.annotation.Nonnegative;

import com.rss.domain.SevaKarya;

import jakarta.validation.constraints.NotNull;
 
public class SevaKaryaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @NotNull
    private ShikshaSevaKarya shiksha;

    @NotNull
    private AayogyaSevaKarya aayogya;

    @NotNull
    private SwavalambanSevaKarya swavalamban;

    @NotNull
    private SamajikSevaKarya samajik;


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

    private String shakhaId;

    @Nonnegative
    private int year;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    public SevaKaryaDTO() {

    }

    public SevaKaryaDTO(SevaKarya sevaKarya) {
        this.id = sevaKarya.getId();
        this.shiksha = sevaKarya.getShiksha();
        this.aayogya = sevaKarya.getAayogya();
        this.swavalamban = sevaKarya.getSwavalamban();
        this.samajik = sevaKarya.getSamajik();
        this.prant = sevaKarya.getPrant();
        this.vibhagId = sevaKarya.getVibhagId();
        this.jillaId = sevaKarya.getJillaId();
        this.talukaId = sevaKarya.getTalukaId();
        this.createdBy = sevaKarya.getCreatedBy();
        this.createdDate = sevaKarya.getCreatedDate();
        this.lastModifiedBy = sevaKarya.getLastModifiedBy();
        this.lastModifiedDate = sevaKarya.getLastModifiedDate();
        this.sevaVastiId = sevaKarya.getSevaVastiId();
        this.year = sevaKarya.getYear();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public ShikshaSevaKarya getShiksha() {
        return shiksha;
    }

    public void setShiksha(ShikshaSevaKarya shiksha) {
        this.shiksha = shiksha;
    }

    public AayogyaSevaKarya getAayogya() {
        return aayogya;
    }

    public void setAayogya(AayogyaSevaKarya aayogya) {
        this.aayogya = aayogya;
    }

    public SwavalambanSevaKarya getSwavalamban() {
        return swavalamban;
    }

    public void setSwavalamban(SwavalambanSevaKarya swavalamban) {
        this.swavalamban = swavalamban;
    }

    public SamajikSevaKarya getSamajik() {
        return samajik;
    }

    public void setSamajik(SamajikSevaKarya samajik) {
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

    public String getShakhaId() {
        return shakhaId;
    }

    public void setShakhaId(String shakhaId) {
        this.shakhaId = shakhaId;
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
        return "SevaKaryaDTO{" +
                "shiksha='" + shiksha + '\'' +
                ", aayogya='" + aayogya + '\'' +
                ", swavalamban='" + swavalamban + '\'' +
                ", samajik='" + samajik + '\'' +
                ", prant='" + prant + '\'' +
                ", vibhagId='" + vibhagId + '\'' +
                ", jillaId='" + jillaId + '\'' +
                ", talukaId='" + talukaId + '\'' +
                ", sevaVastiId='" + sevaVastiId + '\'' +
                ", shakhaId='" + shakhaId + '\'' +
                ", year=" + year +
                "}";
    }

}
