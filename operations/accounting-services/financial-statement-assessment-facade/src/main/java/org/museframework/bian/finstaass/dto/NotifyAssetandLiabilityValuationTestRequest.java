package org.museframework.bian.finstaass.dto;

public class NotifyAssetandLiabilityValuationTestRequest {
    private String financialstatementassessmentid;

    private String assetandliabilityvaluationtestid;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setAssetandliabilityvaluationtestid(String assetandliabilityvaluationtestid) {
        this.assetandliabilityvaluationtestid = assetandliabilityvaluationtestid;
    }

    public String getAssetandliabilityvaluationtestid() {
        return assetandliabilityvaluationtestid;
    }
}