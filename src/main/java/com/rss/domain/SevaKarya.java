package com.rss.domain;

import java.io.Serializable;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.rss.service.dto.AayogyaSevaKarya;
import com.rss.service.dto.SamajikSevaKarya;
import com.rss.service.dto.ShikshaSevaKarya;
import com.rss.service.dto.SwavalambanSevaKarya;

import jakarta.validation.constraints.NotNull;

/**
 * A SevaUpkram.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_sevaKarya")
public class SevaKarya extends AbstractAuditingEntity<String> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("shiksha")
    private ShikshaSevaKarya shiksha;

    @NotNull
    @Field("aayogya")
    private AayogyaSevaKarya aayogya;

    @NotNull
    @Field("swavalamban")
    private SwavalambanSevaKarya swavalamban;

    @NotNull
    @Field("samajik")
    private SamajikSevaKarya samajik;

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

    @Field("shakhaId")
    private String shakhaId;

    @NotNull
    @Field("year")
    private int year;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SevaKarya)) {
            return false;
        }
        return id != null && id.equals(((SevaKarya) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SevaKarya{" +
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
