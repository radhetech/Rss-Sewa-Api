package com.rss.domain;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.rss.service.dto.AyamList;

import jakarta.validation.constraints.NotNull;

/**
 * A ShakhaVrut.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_jillaVrut")
public class JillaVrut extends AbstractAuditingEntity<String> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("ayamList")
    private ArrayList<AyamList> ayamList;


    @NotNull
    @Field("jBethak")
    private String jBethak;

    @NotNull
    @Field("shakhaPravasNum")
    private int shakhaPravasNum;

    @NotNull
    @Field("sevaVastiPravasNum")
    private int sevaVastiPravasNum;

    @NotNull
    @Field("sevaKaryaPravasNum")
    private int sevaKaryaPravasNum;

    @NotNull
    @Field("newSevaKaryaNum")
    private int newSevaKaryaNum;

    @NotNull
    @Field("vibhag_Id")
    private String vibhagId;

    @NotNull
    @Field("jilla_Id")
    private String jillaId;

    @NotNull
    @Field("prant")
    private String prant;

    @NotNull
    @Field("month")
    private String month;

    @NotNull
    @Field("year")
    private int year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getjBethak() {
        return jBethak;
    }

    public ArrayList<AyamList> getAyamList() {
        return ayamList;
    }

    public void setAyamList(ArrayList<AyamList> ayamList) {
        this.ayamList = ayamList;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        return id != null && id.equals(((JillaVrut) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "JillaVrut{" +
                "ayamList='" + ayamList + '\'' +
                ", jBethak='" + jBethak + '\'' +
                ", shakhaPravasNum='" + shakhaPravasNum + '\'' +
                ", sevaVastiPravasNum='" + sevaVastiPravasNum + '\'' +
                ", sevaKaryaPravasNum='" + sevaKaryaPravasNum + '\'' +
                ", newSevaKaryaNum='" + newSevaKaryaNum + '\'' +
                ", vibhagId='" + vibhagId + '\'' +
                ", jillaId='" + jillaId + '\'' +
                ", prant='" + prant + '\'' +
                ", month='" + month + '\'' +
                ", year=" + year +
                "}";
    }

}
