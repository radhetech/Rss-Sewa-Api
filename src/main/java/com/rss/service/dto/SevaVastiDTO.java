package com.rss.service.dto;

import java.io.Serializable;


import jakarta.validation.constraints.NotNull;

/**
 * A SevaVastiDTO.
 */
public class SevaVastiDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sevaVastiId;

    @NotNull
    private String sevaVastiName;

    @NotNull
    private String talukaId;

    @NotNull
    private boolean fiveKUp;

    public String getSevaVastiId() {
        return sevaVastiId;
    }

    public void setSevaVastiId(String sevaVastiId) {
        this.sevaVastiId = sevaVastiId;
    }

    public String getSevaVastiName() {
        return sevaVastiName;
    }

    public void setSevaVastiName(String sevaVastiName) {
        this.sevaVastiName = sevaVastiName;
    }

    public String getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(String talukaId) {
        this.talukaId = talukaId;
    }

    public boolean isFiveKUp() {
        return fiveKUp;
    }

    public void setFiveKUp(boolean fiveKUp) {
        this.fiveKUp = fiveKUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SevaVastiDTO)) {
            return false;
        }
        return sevaVastiId != null && sevaVastiId.equals(((SevaVastiDTO) o).sevaVastiId);
    }

    @Override
    public int hashCode() {
        // see
        // https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "SevaVastiDTO [sevaVastiId=" + sevaVastiId + ", sevaVastiName=" + sevaVastiName+ ", fiveKUp=" + fiveKUp + ", talukaId="
                + talukaId + "]";
    }

     

}
