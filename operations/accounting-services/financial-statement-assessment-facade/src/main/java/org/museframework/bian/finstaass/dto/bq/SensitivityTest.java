/*The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test*/
package org.museframework.bian.finstaass.dto.bq;

public class SensitivityTest {
    /*The required status/situation before the test can be applied*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the testing performed*/
    private String schedule;

    /*The test version employed*/
    private String versionNumber;

    /*The Sensitivity Test specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Sensitivity Test*/
    private org.museframework.bian.classes.Assessment financialStatementAssessmentReference;

    /*Reference to Sensitivity Test*/
    private org.museframework.bian.classes.Test sensitivityTestReference;

    /*The type of Sensitivity Test*/
    private String sensitivityTestType;

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

    public void setSensitivityTestReference(org.museframework.bian.classes.Test sensitivityTestReference) {
        this.sensitivityTestReference = sensitivityTestReference;
    }

    public org.museframework.bian.classes.Test getSensitivityTestReference() {
        return sensitivityTestReference;
    }

    public void setSensitivityTestType(String sensitivityTestType) {
        this.sensitivityTestType = sensitivityTestType;
    }

    public String getSensitivityTestType() {
        return sensitivityTestType;
    }
}