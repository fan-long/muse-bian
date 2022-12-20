/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.positionmanagement.dto.bq;

public class TrialTransaction {
    /*A trial transaction that will impacts a managed position)*/
    private org.museframework.bian.classes.Object trialTransactionReference;

    /*The type of transaction that would be applied to the managed position*/
    private String trialTransactionType;

    /*Key details of the trial transaction*/
    private String trialTransactionRecord;

    /*The make up of the values of the transaction*/
    private String trialTransactionAmount;

    /*Key dates and times associated with the trial transaction*/
    private String trialTransactionDate;

    /*The booking entity where the trial transaction would be made*/
    private String trialTransactionBookingEntity;

    /*The projected impact the trial transaction will have on the managed position*/
    private String trailTransactionPositionImpactAssessment;

    public void setTrialTransactionReference(org.museframework.bian.classes.Object trialTransactionReference) {
        this.trialTransactionReference = trialTransactionReference;
    }

    public org.museframework.bian.classes.Object getTrialTransactionReference() {
        return trialTransactionReference;
    }

    public void setTrialTransactionType(String trialTransactionType) {
        this.trialTransactionType = trialTransactionType;
    }

    public String getTrialTransactionType() {
        return trialTransactionType;
    }

    public void setTrialTransactionRecord(String trialTransactionRecord) {
        this.trialTransactionRecord = trialTransactionRecord;
    }

    public String getTrialTransactionRecord() {
        return trialTransactionRecord;
    }

    public void setTrialTransactionAmount(String trialTransactionAmount) {
        this.trialTransactionAmount = trialTransactionAmount;
    }

    public String getTrialTransactionAmount() {
        return trialTransactionAmount;
    }

    public void setTrialTransactionDate(String trialTransactionDate) {
        this.trialTransactionDate = trialTransactionDate;
    }

    public String getTrialTransactionDate() {
        return trialTransactionDate;
    }

    public void setTrialTransactionBookingEntity(String trialTransactionBookingEntity) {
        this.trialTransactionBookingEntity = trialTransactionBookingEntity;
    }

    public String getTrialTransactionBookingEntity() {
        return trialTransactionBookingEntity;
    }

    public void setTrailTransactionPositionImpactAssessment(String trailTransactionPositionImpactAssessment) {
        this.trailTransactionPositionImpactAssessment = trailTransactionPositionImpactAssessment;
    }

    public String getTrailTransactionPositionImpactAssessment() {
        return trailTransactionPositionImpactAssessment;
    }
}