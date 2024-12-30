package com.rss.service.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.annotation.Nonnegative;

import com.rss.domain.SevaDarshan;

import jakarta.validation.constraints.NotNull;

public class SevaDarshanDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @NotNull
    private ShikshaSevaDarshan shiksha;

    @NotNull
    private AayogyaSevaDarshan aayogya;

    @NotNull
    private SwavalambanSevaDarshan swavalamban;

    @NotNull
    private SamajikSevaDarshan samajik;

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
    private String reportingPerson;

    @Nonnegative
    private int year;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShikshaSevaDarshan getShiksha() {
        return shiksha;
    }

    public void setShiksha(ShikshaSevaDarshan shiksha) {
        this.shiksha = shiksha;
    }

    public AayogyaSevaDarshan getAayogya() {
        return aayogya;
    }

    public void setAayogya(AayogyaSevaDarshan aayogya) {
        this.aayogya = aayogya;
    }

    public SwavalambanSevaDarshan getSwavalamban() {
        return swavalamban;
    }

    public void setSwavalamban(SwavalambanSevaDarshan swavalamban) {
        this.swavalamban = swavalamban;
    }

    public SamajikSevaDarshan getSamajik() {
        return samajik;
    }

    public void setSamajik(SamajikSevaDarshan samajik) {
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

    public String getReportingPerson() {
        return reportingPerson;
    }

    public void setReportingPerson(String reportingPerson) {
        this.reportingPerson = reportingPerson;
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

    public SevaDarshanDTO() {

    }

    public SevaDarshanDTO(SevaDarshan sevaDarshan) {
        this.id = sevaDarshan.getId();
        this.shiksha = sevaDarshan.getShiksha();
        this.aayogya = sevaDarshan.getAayogya();
        this.swavalamban = sevaDarshan.getSwavalamban();
        this.samajik = sevaDarshan.getSamajik();
        this.reportingPerson = sevaDarshan.getReportingPerson();
        this.prant = sevaDarshan.getPrant();
        this.vibhagId = sevaDarshan.getVibhagId();
        this.jillaId = sevaDarshan.getJillaId();
        this.talukaId = sevaDarshan.getTalukaId();
        this.createdBy = sevaDarshan.getCreatedBy();
        this.createdDate = sevaDarshan.getCreatedDate();
        this.lastModifiedBy = sevaDarshan.getLastModifiedBy();
        this.lastModifiedDate = sevaDarshan.getLastModifiedDate();
        this.sevaVastiId = sevaDarshan.getSevaVastiId();
        this.year = sevaDarshan.getYear();
    }

    @Override
    public String toString() {
        return "SevaDarshanDTO{" +
                "shiksha='" + shiksha + '\'' +
                ", aayogya='" + aayogya + '\'' +
                ", swavalamban='" + swavalamban + '\'' +
                ", samajik='" + samajik + '\'' +
                ", prant='" + prant + '\'' +
                ", vibhagId='" + vibhagId + '\'' +
                ", jillaId='" + jillaId + '\'' +
                ", talukaId='" + talukaId + '\'' +
                ", sevaVastiId='" + sevaVastiId + '\'' +
                ", reportingPerson='" + reportingPerson + '\'' +
                ", year=" + year +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                "}";
    }

}
