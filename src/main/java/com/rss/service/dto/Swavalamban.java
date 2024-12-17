package com.rss.service.dto;

import java.io.Serializable;
import java.util.Map;

import jakarta.validation.constraints.NotNull;

public class Swavalamban implements Serializable{

    @NotNull
    private Map professionalTrainingCamp;

    @NotNull
    private Map panchgavyaTrainingCamp;

    @NotNull
    private Map rakdiMaking;

    @NotNull
    private Map electricMalaConstruction;

    @NotNull
    private Map decorativeMaterialProduction;

    @NotNull
    private Map diwaliLampMaking;

    @NotNull
    private Map sweetsAndSnacksProduction;

    @NotNull
    private Map managerialTraining;

    @NotNull
    private Map organicFertilizerTraining;

    @NotNull
    private Map otherActivity3;

    public Map getProfessionalTrainingCamp() {
        return professionalTrainingCamp;
    }

    public void setProfessionalTrainingCamp(Map professionalTrainingCamp) {
        this.professionalTrainingCamp = professionalTrainingCamp;
    }

    public Map getPanchgavyaTrainingCamp() {
        return panchgavyaTrainingCamp;
    }

    public void setPanchgavyaTrainingCamp(Map panchgavyaTrainingCamp) {
        this.panchgavyaTrainingCamp = panchgavyaTrainingCamp;
    }

    public Map getRakdiMaking() {
        return rakdiMaking;
    }

    public void setRakdiMaking(Map rakdiMaking) {
        this.rakdiMaking = rakdiMaking;
    }

    public Map getElectricMalaConstruction() {
        return electricMalaConstruction;
    }

    public void setElectricMalaConstruction(Map electricMalaConstruction) {
        this.electricMalaConstruction = electricMalaConstruction;
    }

    public Map getDecorativeMaterialProduction() {
        return decorativeMaterialProduction;
    }

    public void setDecorativeMaterialProduction(Map decorativeMaterialProduction) {
        this.decorativeMaterialProduction = decorativeMaterialProduction;
    }

    public Map getDiwaliLampMaking() {
        return diwaliLampMaking;
    }

    public void setDiwaliLampMaking(Map diwaliLampMaking) {
        this.diwaliLampMaking = diwaliLampMaking;
    }

    public Map getSweetsAndSnacksProduction() {
        return sweetsAndSnacksProduction;
    }

    public void setSweetsAndSnacksProduction(Map sweetsAndSnacksProduction) {
        this.sweetsAndSnacksProduction = sweetsAndSnacksProduction;
    }

    public Map getManagerialTraining() {
        return managerialTraining;
    }

    public void setManagerialTraining(Map managerialTraining) {
        this.managerialTraining = managerialTraining;
    }

    public Map getOrganicFertilizerTraining() {
        return organicFertilizerTraining;
    }

    public void setOrganicFertilizerTraining(Map organicFertilizerTraining) {
        this.organicFertilizerTraining = organicFertilizerTraining;
    }

    public Map getOtherActivity3() {
        return otherActivity3;
    }

    public void setOtherActivity3(Map otherActivity3) {
        this.otherActivity3 = otherActivity3;
    }


    
    
}
