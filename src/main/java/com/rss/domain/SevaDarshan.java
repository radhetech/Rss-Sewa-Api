package com.rss.domain;

import java.io.Serializable;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.rss.service.dto.AayogyaSevaDarshan;
import com.rss.service.dto.SamajikSevaDarshan;
import com.rss.service.dto.ShikshaSevaDarshan;
import com.rss.service.dto.SwavalambanSevaDarshan;

import jakarta.validation.constraints.NotNull;

/**
 * A SevaDarshan.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_sevaDarshan")
public class SevaDarshan extends AbstractAuditingEntity<String> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("shiksha")
    private ShikshaSevaDarshan shiksha;

    @NotNull
    @Field("aayogya")
    private AayogyaSevaDarshan aayogya;

    @NotNull
    @Field("swavalamban")
    private SwavalambanSevaDarshan swavalamban;

    @NotNull
    @Field("samajik")
    private SamajikSevaDarshan samajik;

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

    @Field("reportingPerson")
    private String reportingPerson;

    @NotNull
    @Field("year")
    private int year;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SevaDarshan)) {
            return false;
        }
        return id != null && id.equals(((SevaDarshan) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SevaDarshan{" +
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
                "}";
    }

}
