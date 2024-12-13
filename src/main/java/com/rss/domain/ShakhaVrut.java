package com.rss.domain;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotNull;

/**
 * A ShakhaVrut.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_shakhaVrut")
public class ShakhaVrut extends AbstractAuditingEntity<String> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("selectedCategory")
    private String selectedCategory;

    @NotNull
    @Field("selectedDate")
    private String selectedDate;

    @NotNull
    @Field("prant_Id")
    private String prantId;

    @NotNull
    @Field("monthlyForm")
    private Map monthlyForm;

    @NotNull
    @Field("weeklyForm")
    private Map weeklyForm;

    @NotNull
    @Field("vibhag_Id")
    private String vibhagId;

    @NotNull
    @Field("jilla_Id")
    private String jillaId;

    @NotNull
    @Field("taluka_Id")
    private String talukaId;

    @NotNull
    @Field("vasti_Id")
    private String vastiId;

    @NotNull
    @Field("shakha_Id")
    private String shakhaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    public String getPrantId() {
        return prantId;
    }

    public void setPrantId(String prantId) {
        this.prantId = prantId;
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

    public String getVastiId() {
        return vastiId;
    }

    public void setVastiId(String vastiId) {
        this.vastiId = vastiId;
    }

    public String getShakhaId() {
        return shakhaId;
    }

    public void setShakhaId(String shakhaId) {
        this.shakhaId = shakhaId;
    }

    public Map getMonthlyForm() {
        return monthlyForm;
    }

    public void setMonthlyForm(Map monthlyForm) {
        this.monthlyForm = monthlyForm;
    }
    public Map getWeeklyForm() {
        return weeklyForm;
    }

    public void setWeeklyForm(Map weeklyForm) {
        this.weeklyForm = weeklyForm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        return id != null && id.equals(((ShakhaVrut) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ShakhaVrut{" +
                "selectedCategory='" + selectedCategory + '\'' +
                ", selectedDate='" + selectedDate + '\'' +
                ", monthlyForm='" + monthlyForm + '\'' +
                ", weeklyForm='" + weeklyForm + '\'' +
                ", prantId='" + prantId + '\'' +
                ", vibhagId='" + vibhagId + '\'' +
                ", jillaId='" + jillaId + '\'' +
                ", talukaId='" + talukaId + '\'' +
                ", vastiId='" + vastiId + '\'' +
                ", shakhaId=" + shakhaId +
                "}";
    }

}
