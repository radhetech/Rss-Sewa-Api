package com.rss.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * A SevaVasti.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "jhi_shakha")
public class Shakha implements Serializable {

    @Id
    private String shakhaId;

    @Size(max = 50)
    @NotNull
    @Field("shakhaName")
    private String shakhaName;

    @Field("sevaVastiId")
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
        if (!(o instanceof Shakha)) {
            return false;
        }
        return shakhaId != null && shakhaId.equals(((Shakha) o).shakhaId);
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
        return "Shakha{" +
                "shakhaId='" + shakhaId + '\'' +
                ",shakhaName='" + shakhaName + '\'' +
                ",sevaVastiId='" + sevaVastiId + '\'' +
                "}";
    }

}
