/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.productionrelease.dto.bq;

public class OperationalRisk {
    /*The type of operational risk test being performed (e.g. operator error recovery, major IT component failure recovery/continuity)*/
    private String operationalRiskSystemTestType;

    /*Detailed description of the test, including expected results*/
    private String operationalRiskSystemTestDescription;

    /*Reference to testing materials, results, assessments and other documents*/
    private String operationalRiskSystemTestWorkProduct;

    /*The result of the operational risk test (including required remedial actions/fixes where appropriate)*/
    private String operationalRiskSystemTestResult;

    public void setOperationalRiskSystemTestType(String operationalRiskSystemTestType) {
        this.operationalRiskSystemTestType = operationalRiskSystemTestType;
    }

    public String getOperationalRiskSystemTestType() {
        return operationalRiskSystemTestType;
    }

    public void setOperationalRiskSystemTestDescription(String operationalRiskSystemTestDescription) {
        this.operationalRiskSystemTestDescription = operationalRiskSystemTestDescription;
    }

    public String getOperationalRiskSystemTestDescription() {
        return operationalRiskSystemTestDescription;
    }

    public void setOperationalRiskSystemTestWorkProduct(String operationalRiskSystemTestWorkProduct) {
        this.operationalRiskSystemTestWorkProduct = operationalRiskSystemTestWorkProduct;
    }

    public String getOperationalRiskSystemTestWorkProduct() {
        return operationalRiskSystemTestWorkProduct;
    }

    public void setOperationalRiskSystemTestResult(String operationalRiskSystemTestResult) {
        this.operationalRiskSystemTestResult = operationalRiskSystemTestResult;
    }

    public String getOperationalRiskSystemTestResult() {
        return operationalRiskSystemTestResult;
    }
}