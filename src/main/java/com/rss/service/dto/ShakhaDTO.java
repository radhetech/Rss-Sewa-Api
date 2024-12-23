package com.rss.service.dto;

import java.io.Serializable;


import jakarta.validation.constraints.NotNull;

/**
 * A ShakhaDTO.
 */
public class ShakhaDTO implements Serializable {

    private String shakhaId;

    @NotNull
    private String shakhaName;

    @NotNull
    private String sevaVastiId;

    public String getShakhaId() {
        return shakhaId;
    }

    public void setShakhaId(String shakhaId) {
        this.shakhaId = shakhaId;
    }
 
    public String getShakhaName() {
        return shakhaName;
    }

    public void setShakhaName(String shakhaName) {
        this.shakhaName = shakhaName;
    }

    public String getSevaVastiId() {
        return sevaVastiId;
    }

    public void setSevaVastiId(String sevaVastiId) {
        this.sevaVastiId = sevaVastiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShakhaDTO)) {
            return false;
        }
        return shakhaId != null && shakhaId.equals(((ShakhaDTO) o).shakhaId);
    }

    @Override
    public int hashCode() {
        // see
        // https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ShakhaDTO{" +
                "shakhaId='" + shakhaId + '\'' +
                ",shakhaName='" + shakhaName + '\'' +
                ",sevaVastiId='" + sevaVastiId + '\'' +
                "}";
    }

}
