package com.rss.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * A vibhag.
 */

@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_vibhag")
public class Vibhag implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String vibhagId;

    @Size(max = 50)
    @NotNull
    @Field("name")
    private String name;
    @Field("isMahanagar")
    private Boolean isMahanagar;


    public String getVibhagId() {
        return vibhagId;
    }

    public void setVibhagId(String vibhagId) {
        this.vibhagId = vibhagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Boolean getIsMahanagar() {
        return isMahanagar;
    }

    public void setIsMahanagar(Boolean isMahanagar) {
        this.isMahanagar = isMahanagar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vibhag)) {
            return false;
        }
        return vibhagId != null && vibhagId.equals(((Vibhag) o).vibhagId);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Vibhag{" +
            "vibhagId='" + vibhagId + '\'' +
            ",name='" + name + '\'' +
            ",isMahanagar='" + isMahanagar + '\'' +
            "}";
    }




   
    
}

