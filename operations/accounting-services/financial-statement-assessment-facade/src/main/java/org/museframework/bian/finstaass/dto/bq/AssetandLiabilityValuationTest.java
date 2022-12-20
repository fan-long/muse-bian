/*The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test*/
package org.museframework.bian.finstaass.dto.bq;

public class AssetandLiabilityValuationTest {
    /*The required status/situation before the test can be applied*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the testing performed*/
    private String schedule;

    /*The test version employed*/
    private String versionNumber;

    /*The Asset and Liability Valuation Test specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Asset and Liability Valuation Test*/
    private org.museframework.bian.classes.Assessment financialStatementAssessmentReference;

    /*Reference to Asset and Liability Valuation Test*/
    private org.museframework.bian.classes.Test assetandLiabilityValuationTestReference;

    /*The type of Asset and Liability Valuation Test*/
    private String assetandLiabilityValuationTestType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setFinancialStatementAssessmentReference(org.museframework.bian.classes.Assessment financialStatementAssessmentReference) {
        this.financialStatementAssessmentReference = financialStatementAssessmentReference;
    }

    public org.museframework.bian.classes.Assessment getFinancialStatementAssessmentReference() {
        return financialStatementAssessmentReference;
    }

    public void setAssetandLiabilityValuationTestReference(org.museframework.bian.classes.Test assetandLiabilityValuationTestReference) {
        this.assetandLiabilityValuationTestReference = assetandLiabilityValuationTestReference;
    }

    public org.museframework.bian.classes.Test getAssetandLiabilityValuationTestReference() {
        return assetandLiabilityValuationTestReference;
    }

    public void setAssetandLiabilityValuationTestType(String assetandLiabilityValuationTestType) {
        this.assetandLiabilityValuationTestType = assetandLiabilityValuationTestType;
    }

    public String getAssetandLiabilityValuationTestType() {
        return assetandLiabilityValuationTestType;
    }
}