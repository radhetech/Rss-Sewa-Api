package com.rss.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * A SevaVasti.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_sevaVasti")
public class SevaVasti implements Serializable {

    @Id
    private String sevaVastiId;

    @Size(max = 50)
    @NotNull
    @Field("sevaVastiName")
    private String sevaVastiName;

    @Field("talukaId")
    private String talukaId;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SevaVasti)) {
            return false;
        }
        return sevaVastiId != null && sevaVastiId.equals(((SevaVasti) o).sevaVastiId);
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
        return "SevaVasti{" +
                "sevaVastiId='" + sevaVastiId + '\'' +
                ",sevaVastiName='" + sevaVastiName + '\'' +
                ",talukaId='" + talukaId + '\'' +
                "}";
    }

}
