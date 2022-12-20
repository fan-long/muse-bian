/*The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test*/
package org.museframework.bian.finstaass.dto.bq;

public class RiskTest {
    /*The required status/situation before the test can be applied*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the testing performed*/
    private String schedule;

    /*The test version employed*/
    private String versionNumber;

    /*The Risk Test specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Risk Test*/
    private org.museframework.bian.classes.Assessment financialStatementAssessmentReference;

    /*Reference to Risk Test*/
    private org.museframework.bian.classes.Test riskTestReference;

    /*The type of Risk Test*/
    private String riskTestType;

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

    public void setRiskTestReference(org.museframework.bian.classes.Test riskTestReference) {
        this.riskTestReference = riskTestReference;
    }

    public org.museframework.bian.classes.Test getRiskTestReference() {
        return riskTestReference;
    }

    public void setRiskTestType(String riskTestType) {
        this.riskTestType = riskTestType;
    }

    public String getRiskTestType() {
        return riskTestType;
    }
}