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
    private String id;

    @Size(max = 50)
    @NotNull
    @Field("sevaVastiName")
    private String sevaVastiName;

    @Field("talukaId")
    private String talukaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return id != null && id.equals(((SevaVasti) o).id);
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
                "id='" + id + '\'' +
                ",sevaVastiName='" + sevaVastiName + '\'' +
                ",talukaId='" + talukaId + '\'' +
                "}";
    }

}
