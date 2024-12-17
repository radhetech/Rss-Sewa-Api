package com.rss.service.dto;

import java.io.Serializable;
import java.util.Map;

import jakarta.validation.constraints.NotNull;

public class Samajik implements Serializable{

    @NotNull
    private Map girlWorship;

    @NotNull
    private Map massMarriage;

    @NotNull
    private Map templeCleanliness;

    @NotNull
    private Map publicCleanliness;

    @NotNull
    private Map waterConservationPondConstruction;

    @NotNull
    private Map roadConstruction;

    @NotNull
    private Map communityCelebration;

    @NotNull
    private Map treePlantation;

    @NotNull
    private Map sportsCompetition;

    @NotNull
    private Map blanketSweaterDelivery;

    @NotNull
    private Map foodDonation;

    @NotNull
    private Map otherActivity4;

    public Map getGirlWorship() {
        return girlWorship;
    }

    public void setGirlWorship(Map girlWorship) {
        this.girlWorship = girlWorship;
    }

    public Map getMassMarriage() {
        return massMarriage;
    }

    public void setMassMarriage(Map massMarriage) {
        this.massMarriage = massMarriage;
    }

    public Map getTempleCleanliness() {
        return templeCleanliness;
    }

    public void setTempleCleanliness(Map templeCleanliness) {
        this.templeCleanliness = templeCleanliness;
    }

    public Map getPublicCleanliness() {
        return publicCleanliness;
    }

    public void setPublicCleanliness(Map publicCleanliness) {
        this.publicCleanliness = publicCleanliness;
    }

    public Map getWaterConservationPondConstruction() {
        return waterConservationPondConstruction;
    }

    public void setWaterConservationPondConstruction(Map waterConservationPondConstruction) {
        this.waterConservationPondConstruction = waterConservationPondConstruction;
    }

    public Map getRoadConstruction() {
        return roadConstruction;
    }

    public void setRoadConstruction(Map roadConstruction) {
        this.roadConstruction = roadConstruction;
    }

    public Map getCommunityCelebration() {
        return communityCelebration;
    }

    public void setCommunityCelebration(Map communityCelebration) {
        this.communityCelebration = communityCelebration;
    }

    public Map getTreePlantation() {
        return treePlantation;
    }

    public void setTreePlantation(Map treePlantation) {
        this.treePlantation = treePlantation;
    }

    public Map getSportsCompetition() {
        return sportsCompetition;
    }

    public void setSportsCompetition(Map sportsCompetition) {
        this.sportsCompetition = sportsCompetition;
    }

    public Map getBlanketSweaterDelivery() {
        return blanketSweaterDelivery;
    }

    public void setBlanketSweaterDelivery(Map blanketSweaterDelivery) {
        this.blanketSweaterDelivery = blanketSweaterDelivery;
    }

    public Map getFoodDonation() {
        return foodDonation;
    }

    public void setFoodDonation(Map foodDonation) {
        this.foodDonation = foodDonation;
    }

    public Map getOtherActivity4() {
        return otherActivity4;
    }

    public void setOtherActivity4(Map otherActivity4) {
        this.otherActivity4 = otherActivity4;
    }

    
    
}
