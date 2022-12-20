/*The fulfilment of TransactionScheduleArrangement*/
package org.museframework.bian.classes;

public class TransactionScheduleArrangementFulfillmentEvent {
    /*The fee type applied*/
    private String appliedServiceFeeType;

    /*The derived fee amount to be charged*/
    private String appliedServiceFeeAmount;

    /*General description of the fee*/
    private String appliedServiceFeeDescription;

    public void setAppliedServiceFeeType(String appliedServiceFeeType) {
        this.appliedServiceFeeType = appliedServiceFeeType;
    }

    public String getAppliedServiceFeeType() {
        return appliedServiceFeeType;
    }

    public void setAppliedServiceFeeAmount(String appliedServiceFeeAmount) {
        this.appliedServiceFeeAmount = appliedServiceFeeAmount;
    }

    public String getAppliedServiceFeeAmount() {
        return appliedServiceFeeAmount;
    }

    public void setAppliedServiceFeeDescription(String appliedServiceFeeDescription) {
        this.appliedServiceFeeDescription = appliedServiceFeeDescription;
    }

    public String getAppliedServiceFeeDescription() {
        return appliedServiceFeeDescription;
    }
}