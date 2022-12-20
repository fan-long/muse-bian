/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.customerposition.dto.bq;

public class Credit {
    /*The internal bank credit rating/assessment*/
    private String customerCreditRatingAssessment;

    /*Credit assessment type (e.g. consumer, small business, corporate)*/
    private String customerCreditRatingAssessmentType;

    /*The structured report outlining basis for the bank's rating*/
    private String customerCreditRatingNarrative;

    /*The customer credit position analysis - combines credit assessment with product/service available balance/utilized credit position analysis*/
    private String customerCreditPositionAnalysisRecord;

    public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
        this.customerCreditRatingAssessment = customerCreditRatingAssessment;
    }

    public String getCustomerCreditRatingAssessment() {
        return customerCreditRatingAssessment;
    }

    public void setCustomerCreditRatingAssessmentType(String customerCreditRatingAssessmentType) {
        this.customerCreditRatingAssessmentType = customerCreditRatingAssessmentType;
    }

    public String getCustomerCreditRatingAssessmentType() {
        return customerCreditRatingAssessmentType;
    }

    public void setCustomerCreditRatingNarrative(String customerCreditRatingNarrative) {
        this.customerCreditRatingNarrative = customerCreditRatingNarrative;
    }

    public String getCustomerCreditRatingNarrative() {
        return customerCreditRatingNarrative;
    }

    public void setCustomerCreditPositionAnalysisRecord(String customerCreditPositionAnalysisRecord) {
        this.customerCreditPositionAnalysisRecord = customerCreditPositionAnalysisRecord;
    }

    public String getCustomerCreditPositionAnalysisRecord() {
        return customerCreditPositionAnalysisRecord;
    }
}