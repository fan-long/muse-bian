/*Monitor and define the status/rating of some entity within Customer Credit Rating. */
package org.museframework.bian.cuscrerat.dto.cr;

public class CustomerCreditRatingState {
    /*Reference to the associated customer (can currently be a person or a company)*/
    private org.museframework.bian.classes.Object customerReference;

    /*The type of credit status being monitored (e.g. consumer, small business, corporate)*/
    private String customerCreditRatingStatusType;

    /*The schedule for refreshing the credit state and supporting analysis, and update history as appropriate*/
    private String customerCreditRatingSchedule;

    /*The record of the underlying credit assessment performed to support the credit rating state*/
    private String customerCreditRatingAssessmentRecord;

    /*Reference to the customer behavior model(s) used to develop any underlying analysis for determining the credit state*/
    private org.museframework.bian.classes.Object assessmentCustomerBehaviorModelReference;

    /*The type of analysis performed to support the credit state*/
    private String creditRatingAssessmentType;

    /*The date and time the supporting credit assessment was developed*/
    private String creditRatingAssessmentDate;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String creditRatingAssessmentWorkProducts;

    /*The resulting report from the credit rating assessment*/
    private String creditRatingAssessmentResult;

    /*A record of the customers credit state*/
    private String customerCreditRatingRecord;

    /*Is the current credit rating or score (typically a ranking value e.g. 1-10)*/
    private String customerCreditRatingState;

    /*Any underlying analysis records and results that support the credit rating*/
    private String customerCreditRatingAssessment;

    /*A structured report outlining basis for the credit rating*/
    private String customerCreditRatingNarrative;

    /*The date/time the value was last refreshed*/
    private String customerCreditRatingDate;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerCreditRatingStatusType(String customerCreditRatingStatusType) {
        this.customerCreditRatingStatusType = customerCreditRatingStatusType;
    }

    public String getCustomerCreditRatingStatusType() {
        return customerCreditRatingStatusType;
    }

    public void setCustomerCreditRatingSchedule(String customerCreditRatingSchedule) {
        this.customerCreditRatingSchedule = customerCreditRatingSchedule;
    }

    public String getCustomerCreditRatingSchedule() {
        return customerCreditRatingSchedule;
    }

    public void setCustomerCreditRatingAssessmentRecord(String customerCreditRatingAssessmentRecord) {
        this.customerCreditRatingAssessmentRecord = customerCreditRatingAssessmentRecord;
    }

    public String getCustomerCreditRatingAssessmentRecord() {
        return customerCreditRatingAssessmentRecord;
    }

    public void setAssessmentCustomerBehaviorModelReference(org.museframework.bian.classes.Object assessmentCustomerBehaviorModelReference) {
        this.assessmentCustomerBehaviorModelReference = assessmentCustomerBehaviorModelReference;
    }

    public org.museframework.bian.classes.Object getAssessmentCustomerBehaviorModelReference() {
        return assessmentCustomerBehaviorModelReference;
    }

    public void setCreditRatingAssessmentType(String creditRatingAssessmentType) {
        this.creditRatingAssessmentType = creditRatingAssessmentType;
    }

    public String getCreditRatingAssessmentType() {
        return creditRatingAssessmentType;
    }

    public void setCreditRatingAssessmentDate(String creditRatingAssessmentDate) {
        this.creditRatingAssessmentDate = creditRatingAssessmentDate;
    }

    public String getCreditRatingAssessmentDate() {
        return creditRatingAssessmentDate;
    }

    public void setCreditRatingAssessmentWorkProducts(String creditRatingAssessmentWorkProducts) {
        this.creditRatingAssessmentWorkProducts = creditRatingAssessmentWorkProducts;
    }

    public String getCreditRatingAssessmentWorkProducts() {
        return creditRatingAssessmentWorkProducts;
    }

    public void setCreditRatingAssessmentResult(String creditRatingAssessmentResult) {
        this.creditRatingAssessmentResult = creditRatingAssessmentResult;
    }

    public String getCreditRatingAssessmentResult() {
        return creditRatingAssessmentResult;
    }

    public void setCustomerCreditRatingRecord(String customerCreditRatingRecord) {
        this.customerCreditRatingRecord = customerCreditRatingRecord;
    }

    public String getCustomerCreditRatingRecord() {
        return customerCreditRatingRecord;
    }

    public void setCustomerCreditRatingState(String customerCreditRatingState) {
        this.customerCreditRatingState = customerCreditRatingState;
    }

    public String getCustomerCreditRatingState() {
        return customerCreditRatingState;
    }

    public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
        this.customerCreditRatingAssessment = customerCreditRatingAssessment;
    }

    public String getCustomerCreditRatingAssessment() {
        return customerCreditRatingAssessment;
    }

    public void setCustomerCreditRatingNarrative(String customerCreditRatingNarrative) {
        this.customerCreditRatingNarrative = customerCreditRatingNarrative;
    }

    public String getCustomerCreditRatingNarrative() {
        return customerCreditRatingNarrative;
    }

    public void setCustomerCreditRatingDate(String customerCreditRatingDate) {
        this.customerCreditRatingDate = customerCreditRatingDate;
    }

    public String getCustomerCreditRatingDate() {
        return customerCreditRatingDate;
    }
}