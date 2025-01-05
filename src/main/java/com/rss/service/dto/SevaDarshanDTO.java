package com.rss.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;

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
    private Map vibhag;

    @NotNull
    private Map jilla;

    @NotNull
    private Map taluka;

    @NotNull
    private Map sevaVasti;

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
    public Map getVibhag() {
        return vibhag;
    }
    public void setVibhag(Map vibhag) {
        this.vibhag = vibhag;
    }
    public Map getJilla() {
        return jilla;
    }
    public void setJilla(Map jilla) {
        this.jilla = jilla;
    }
    public Map getTaluka() {
        return taluka;
    }
    public void setTaluka(Map taluka) {
        this.taluka = taluka;
    }
    public Map getSevaVasti() {
        return sevaVasti;
    }

    public void setSevaVasti(Map sevaVasti) {
        this.sevaVasti = sevaVasti;
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
        this.vibhag = sevaDarshan.getVibhag();
        this.jilla = sevaDarshan.getJilla();
        this.taluka = sevaDarshan.getTaluka();
        this.createdBy = sevaDarshan.getCreatedBy();
        this.createdDate = sevaDarshan.getCreatedDate();
        this.lastModifiedBy = sevaDarshan.getLastModifiedBy();
        this.lastModifiedDate = sevaDarshan.getLastModifiedDate();
        this.sevaVasti = sevaDarshan.getSevaVasti();
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
                ", vibhag='" + vibhag + '\'' +
                ", jilla='" + jilla + '\'' +
                ", taluka='" + taluka + '\'' +
                ", sevaVasti='" + sevaVasti + '\'' +
                ", reportingPerson='" + reportingPerson + '\'' +
                ", year=" + year +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                "}";
    }

}
