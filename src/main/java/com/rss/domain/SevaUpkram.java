package com.rss.domain;

import java.io.Serializable;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.rss.service.dto.Aayogya;
import com.rss.service.dto.Samajik;
import com.rss.service.dto.Shiksha;
import com.rss.service.dto.Swavalamban;

import jakarta.validation.constraints.NotNull;

/**
 * A SevaUpkram.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_sevaUpkram")
public class SevaUpkram extends AbstractAuditingEntity<String> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("shiksha")
    private Shiksha shiksha;

    @NotNull
    @Field("aayogya")
    private Aayogya aayogya;

    @NotNull
    @Field("swavalamban")
    private Swavalamban swavalamban;

    @NotNull
    @Field("samajik")
    private Samajik samajik;

    @NotNull
    @Field("prant")
    private String prant;

    @NotNull
    @Field("vibhagId")
    private String vibhagId;

    @NotNull
    @Field("jillaId")
    private String jillaId;

    @NotNull
    @Field("talukaId")
    private String talukaId;

    @NotNull
    @Field("sevaVastiId")
    private String sevaVastiId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        return id != null && id.equals(((SevaUpkram) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SevaUpkram{" +
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
