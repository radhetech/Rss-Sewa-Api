package com.rss.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * A Jilla.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_jilla")
public class Jilla implements Serializable {

    @Id
    private String jillaId;

    @Size(max = 50)
    @NotNull
    @Field("jillaName")
    private String jillaName;

    @Field("vibhagID")
    private String vibhagID;

    @Field("IsBhag")
    private String IsBhag;

    public String getJillaId() {
        return jillaId;
    }

    public void setJillaId(String jillaId) {
        this.jillaId = jillaId;
    }


    public String getJillaName() {
        return jillaName;
    }

    public void setJillaName(String jillaName) {
        this.jillaName = jillaName;
    }

    public String getVibhagID() {
        return vibhagID;
    }

    public void setVibhagID(String vibhagID) {
        this.vibhagID = vibhagID;
    }

    public String getIsBhag() {
        return IsBhag;
    }

    public void setIsBhag(String isBhag) {
        this.IsBhag = isBhag;
    }

    

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Jilla)) {
            return false;
        }
        return jillaId != null && jillaId.equals(((Jilla) o).jillaId);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Jilla{" +
            "jillaId='" + jillaId + '\'' +
            ",jillaName='" + jillaName + '\'' +
            ",vibhagID='" + vibhagID + '\'' +
            ",IsBhag='" + IsBhag + '\'' +
            "}";
    }


}
