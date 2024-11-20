package com.rss.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * A Taluka.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_taluka")
public class Taluka implements Serializable {

    @Id
    private String id;

    @Size(max = 50)
    @NotNull
    @Field("talukaName")
    private String talukaName;

    @Field("jillaId")
    private String jillaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTalukaName() {
        return talukaName;
    }

    public void setTalukaName(String talukaName) {
        this.talukaName = talukaName;
    }

    public String getJillaId() {
        return jillaId;
    }

    public void setJillaId(String jillaId) {
        this.jillaId = jillaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Taluka)) {
            return false;
        }
        return id != null && id.equals(((Taluka) o).id);
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
        return "Taluka{" +
                "id='" + id + '\'' +
                ",talukaName='" + talukaName + '\'' +
                ",jillaId='" + jillaId + '\'' +
                "}";
    }

}
