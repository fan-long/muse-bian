/*Specifies a series of stages that characterize the course of existence of a party relationship in a specific context.*/
package org.museframework.bian.classes;

public class PartyRelationshipLifecyclePhase {
    /**/
    private String description;

    /*Specifies whether the phase is the current phase of the party relationship.*/
    private String isCurrentPhase;

    /*The name of the phase of the relationship, such as prospect, contracted, on-board, etc.*/
    private String phaseName;

    /**/
    private String phaseStatus;

    /*The period of time during which the phase was the current phase of the party relationship.*/
    private String phasePeriod;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setIsCurrentPhase(String isCurrentPhase) {
        this.isCurrentPhase = isCurrentPhase;
    }

    public String getIsCurrentPhase() {
        return isCurrentPhase;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhasePeriod(String phasePeriod) {
        this.phasePeriod = phasePeriod;
    }

    public String getPhasePeriod() {
        return phasePeriod;
    }
}