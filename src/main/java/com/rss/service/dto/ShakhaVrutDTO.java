package com.rss.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;

import com.rss.domain.ShakhaVrut;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ShakhaVrutDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @NotBlank
    @Size(max = 1)
    private String selectedCategory;

    @NotBlank
    private String selectedDate;

    @NotBlank
    private String prantId;

    @NotBlank
    private String vibhagId;

    @NotBlank
    private String jillaId;

    @NotBlank
    private String talukaId;

    @NotNull
    private Map monthlyForm;

    @NotNull
    private Map weeklyForm;

    @NotBlank
    private String vastiId;

    @NotBlank
    private String shakhaId;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    public ShakhaVrutDTO() {

    }

    public ShakhaVrutDTO(ShakhaVrut shakhaVrut) {
        this.id = shakhaVrut.getId();
        this.selectedCategory = shakhaVrut.getSelectedCategory();
        this.selectedDate = shakhaVrut.getSelectedDate();
        this.prantId = shakhaVrut.getPrantId();
        this.vibhagId = shakhaVrut.getVibhagId();
        this.jillaId = shakhaVrut.getJillaId();
        this.talukaId = shakhaVrut.getTalukaId();
        this.vastiId = shakhaVrut.getVastiId();
        this.shakhaId = shakhaVrut.getShakhaId();
        this.createdBy = shakhaVrut.getCreatedBy();
        this.createdDate = shakhaVrut.getCreatedDate();
        this.lastModifiedBy = shakhaVrut.getLastModifiedBy();
        this.lastModifiedDate = shakhaVrut.getLastModifiedDate();
        this.monthlyForm = shakhaVrut.getMonthlyForm();
        this.weeklyForm = shakhaVrut.getWeeklyForm();
    }

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

    // prettier-ignore
    @Override
    public String toString() {
        return "ShakhaVrutDTO{" +
                "selectedCategory='" + selectedCategory + '\'' +
                "selectedDate='" + selectedDate + '\'' +
                "monthlyForm='" + monthlyForm + '\'' +
                "weeklyForm='" + weeklyForm + '\'' +
                ", prantId='" + prantId + '\'' +
                ", vibhagId='" + vibhagId + '\'' +
                ", jillaId='" + jillaId + '\'' +
                ", talukaId='" + talukaId + '\'' +
                ", vastiId=" + vastiId +
                ", shakhaId='" + shakhaId + '\'' +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +

                "}";
    }

}
