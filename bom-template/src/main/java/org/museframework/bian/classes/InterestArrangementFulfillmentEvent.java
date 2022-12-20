/*A fulfillment of a specific interest arrangement */
package org.museframework.bian.classes;

public class InterestArrangementFulfillmentEvent {
    /*The amount of interest that is subject of this transaction*/
    private String interestEventAmount;

    /*The InterestType of the Interest arrangement this is a transaction for*/
    private String appliedInterestType;

    /*Interest amount that has accrued in between coupon payment periods. (ISO20022)*/
    private String accruedInterestAmount;

    /**/
    private String accruedInterestType;

    /**/
    private String interestTaxAmount;

    /*The date on which the interest has to be payed*/
    private String interestEventDueDate;

    /*Description of the transaction, such as applied interest rate, Interest period ...*/
    private String interestEventDescription;

    /**/
    private String interestEventRateType;

    public void setInterestEventAmount(String interestEventAmount) {
        this.interestEventAmount = interestEventAmount;
    }

    public String getInterestEventAmount() {
        return interestEventAmount;
    }

    public void setAppliedInterestType(String appliedInterestType) {
        this.appliedInterestType = appliedInterestType;
    }

    public String getAppliedInterestType() {
        return appliedInterestType;
    }

    public void setAccruedInterestAmount(String accruedInterestAmount) {
        this.accruedInterestAmount = accruedInterestAmount;
    }

    public String getAccruedInterestAmount() {
        return accruedInterestAmount;
    }

    public void setAccruedInterestType(String accruedInterestType) {
        this.accruedInterestType = accruedInterestType;
    }

    public String getAccruedInterestType() {
        return accruedInterestType;
    }

    public void setInterestTaxAmount(String interestTaxAmount) {
        this.interestTaxAmount = interestTaxAmount;
    }

    public String getInterestTaxAmount() {
        return interestTaxAmount;
    }

    public void setInterestEventDueDate(String interestEventDueDate) {
        this.interestEventDueDate = interestEventDueDate;
    }

    public String getInterestEventDueDate() {
        return interestEventDueDate;
    }

    public void setInterestEventDescription(String interestEventDescription) {
        this.interestEventDescription = interestEventDescription;
    }

    public String getInterestEventDescription() {
        return interestEventDescription;
    }

    public void setInterestEventRateType(String interestEventRateType) {
        this.interestEventRateType = interestEventRateType;
    }

    public String getInterestEventRateType() {
        return interestEventRateType;
    }
}