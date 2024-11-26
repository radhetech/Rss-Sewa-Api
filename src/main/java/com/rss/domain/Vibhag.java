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
    private String id;

    @Size(max = 50)
    @NotNull
    @Field("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vibhag)) {
            return false;
        }
        return id != null && id.equals(((Vibhag) o).id);
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
            "id='" + id + '\'' +
            ",name='" + name + '\'' +
            "}";
    }




   
    
}

