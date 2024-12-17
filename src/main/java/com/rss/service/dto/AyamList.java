package com.rss.service.dto;

import java.io.Serializable;

import javax.annotation.Nonnegative;

import jakarta.validation.constraints.NotBlank;

public class AyamList implements Serializable{
    
    @NotBlank
    private String ayamName;

    @Nonnegative
    private int ayamSahNum;

    public String getAyamName() {
        return ayamName;
    }

    public void setAyamName(String ayamName) {
        this.ayamName = ayamName;
    }

    public int getAyamSahNum() {
        return ayamSahNum;
    }

    public void setAyamSahNum(int ayamSahNum) {
        this.ayamSahNum = ayamSahNum;
    }

     

}
