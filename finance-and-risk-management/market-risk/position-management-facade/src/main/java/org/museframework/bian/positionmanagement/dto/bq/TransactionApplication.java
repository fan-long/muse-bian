/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.positionmanagement.dto.bq;

public class TransactionApplication extends org.museframework.bian.classes.TransactionApplication {
    /*A trial transaction that will impacts a managed position)*/
    private org.museframework.bian.classes.Object transactionReference;

    /*The type of transaction that would be applied to the managed position*/
    private String transactionType;

    /*Key details of the trial transaction*/
    private String transactionRecord;

    /*The make up of the values of the transaction*/
    private String transactionAmount;

    /*Key dates and times associated with the trial transaction*/
    private String transactionDate;

    /*The booking entity where the trial transaction would be made*/
    private String transactionBookingEntity;

    /*The projected impact the trial transaction will have on the managed position*/
    private String transactionPositionImpactAssessment;

    public void setTransactionReference(org.museframework.bian.classes.Object transactionReference) {
        this.transactionReference = transactionReference;
    }

    public org.museframework.bian.classes.Object getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionRecord(String transactionRecord) {
        this.transactionRecord = transactionRecord;
    }

    public String getTransactionRecord() {
        return transactionRecord;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionBookingEntity(String transactionBookingEntity) {
        this.transactionBookingEntity = transactionBookingEntity;
    }

    public String getTransactionBookingEntity() {
        return transactionBookingEntity;
    }

    public void setTransactionPositionImpactAssessment(String transactionPositionImpactAssessment) {
        this.transactionPositionImpactAssessment = transactionPositionImpactAssessment;
    }

    public String getTransactionPositionImpactAssessment() {
        return transactionPositionImpactAssessment;
    }
}