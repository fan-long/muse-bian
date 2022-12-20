package org.museframework.bian.finstaass.dto;

public class EvaluateAssetandLiabilityValuationTestRequest {
    private String financialstatementassessmentid;

    private String assetandliabilityvaluationtestid;

    private org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest assetandLiabilityValuationTest;

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

    public void setAssetandLiabilityValuationTest(org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest assetandLiabilityValuationTest) {
        this.assetandLiabilityValuationTest = assetandLiabilityValuationTest;
    }

    public org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest getAssetandLiabilityValuationTest() {
        return assetandLiabilityValuationTest;
    }
}