package com.rss.service.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.annotation.Nonnegative;


import com.rss.domain.JillaVrut;

import jakarta.validation.constraints.NotNull;
 
public class JillaVrutDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;


    @NotNull
    private int shiksha;

    @NotNull
    private int aarogya;

    @NotNull
    private int swavalamban;

    @NotNull
    private int samajik;

    @NotNull
    private String jBethak;

    @Nonnegative
    private int shakhaPravasNum;

    @Nonnegative
    private int sevaVastiPravasNum;

    @Nonnegative
    private int sevaKaryaPravasNum;

    @Nonnegative
    private int newSevaKaryaNum;

    @NotNull
    private String vibhagId;

    @NotNull
    private String jillaId;

    @NotNull
    private String prant;

    @NotNull
    private String month;

    @Nonnegative
    private int year;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    public JillaVrutDTO() {

    }

    public JillaVrutDTO(JillaVrut jillaVrut) {
        this.id = jillaVrut.getId();
        this.shiksha = jillaVrut.getShiksha();
        this.aarogya = jillaVrut.getAarogya();
        this.swavalamban = jillaVrut.getSwavalamban();
        this.samajik = jillaVrut.getSamajik();
        this.jBethak = jillaVrut.getjBethak();
        this.shakhaPravasNum = jillaVrut.getShakhaPravasNum();
        this.sevaVastiPravasNum = jillaVrut.getSevaVastiPravasNum();
        this.sevaKaryaPravasNum = jillaVrut.getSevaKaryaPravasNum();
        this.newSevaKaryaNum = jillaVrut.getNewSevaKaryaNum();
        this.prant = jillaVrut.getPrant();
        this.vibhagId = jillaVrut.getVibhagId();
        this.createdBy = jillaVrut.getCreatedBy();
        this.createdDate = jillaVrut.getCreatedDate();
        this.lastModifiedBy = jillaVrut.getLastModifiedBy();
        this.lastModifiedDate = jillaVrut.getLastModifiedDate();
        this.jillaId = jillaVrut.getJillaId();
        this.month = jillaVrut.getMonth();
        this.year = jillaVrut.getYear();
    }
    public String getId() {
        return id;
    }

    public int getShiksha() {
        return shiksha;
    }

    public void setShiksha(int shiksha) {
        this.shiksha = shiksha;
    }

    public int getAarogya() {
        return aarogya;
    }

    public void setAarogya(int aarogya) {
        this.aarogya = aarogya;
    }

    public int getSwavalamban() {
        return swavalamban;
    }

    public void setSwavalamban(int swavalamban) {
        this.swavalamban = swavalamban;
    }

    public int getSamajik() {
        return samajik;
    }

    public void setSamajik(int samajik) {
        this.samajik = samajik;
    }

    public String getjBethak() {
        return jBethak;
    }

    public void setjBethak(String jBethak) {
        this.jBethak = jBethak;
    }

    public int getShakhaPravasNum() {
        return shakhaPravasNum;
    }

    public void setShakhaPravasNum(int shakhaPravasNum) {
        this.shakhaPravasNum = shakhaPravasNum;
    }

    public int getSevaVastiPravasNum() {
        return sevaVastiPravasNum;
    }

    public void setSevaVastiPravasNum(int sevaVastiPravasNum) {
        this.sevaVastiPravasNum = sevaVastiPravasNum;
    }

    public int getSevaKaryaPravasNum() {
        return sevaKaryaPravasNum;
    }

    public void setSevaKaryaPravasNum(int sevaKaryaPravasNum) {
        this.sevaKaryaPravasNum = sevaKaryaPravasNum;
    }

    public int getNewSevaKaryaNum() {
        return newSevaKaryaNum;
    }

    public void setNewSevaKaryaNum(int newSevaKaryaNum) {
        this.newSevaKaryaNum = newSevaKaryaNum;
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

    public String getPrant() {
        return prant;
    }

    public void setPrant(String prant) {
        this.prant = prant;
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

    // prettier-ignore
    @Override
    public String toString() {
        return "JillaVrutDTO{" +
                ", shiksha='" + shiksha + '\'' +
                ", aarogya='" + aarogya + '\'' +
                ", swavalamban='" + swavalamban + '\'' +
                ", samajik='" + samajik + '\'' +
                ",jBethak='" + jBethak + '\'' +
                ",shakhaPravasNum='" + shakhaPravasNum + '\'' +
                ",sevaVastiPravasNum='" + sevaVastiPravasNum + '\'' +
                ",sevaKaryaPravasNum='" + sevaKaryaPravasNum + '\'' +
                ",newSevaKaryaNum='" + newSevaKaryaNum + '\'' +
                ",vibhagId='" + vibhagId + '\'' +
                ",jillaId='" + jillaId + '\'' +
                ", prant='" + prant + '\'' +
                ",month='" + month + '\'' +
                ",year=" + year +
                ",createdBy=" + createdBy +
                ",createdDate=" + createdDate +
                ",lastModifiedBy='" + lastModifiedBy + '\'' +
                ",lastModifiedDate=" + lastModifiedDate +
                "}";
    }

}
