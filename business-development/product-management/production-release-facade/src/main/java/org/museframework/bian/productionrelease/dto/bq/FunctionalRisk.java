/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.productionrelease.dto.bq;

public class FunctionalRisk {
    /*The type of functional test being performed (e.g. functional coverage/integrity, usability, application integration)*/
    private String functionalRiskSystemTestType;

    /*Detailed description of the test, including expected results*/
    private String functionalRiskSystemTestDescription;

    /*Reference to testing materials, results, assessments and other documents*/
    private String functionalRiskSystemTestWorkProduct;

    /*The result of the functional risk test (including required remedial actions/fixes where appropriate)*/
    private String functionalRiskSystemTestResult;

    public void setFunctionalRiskSystemTestType(String functionalRiskSystemTestType) {
        this.functionalRiskSystemTestType = functionalRiskSystemTestType;
    }

    public String getFunctionalRiskSystemTestType() {
        return functionalRiskSystemTestType;
    }

    public void setFunctionalRiskSystemTestDescription(String functionalRiskSystemTestDescription) {
        this.functionalRiskSystemTestDescription = functionalRiskSystemTestDescription;
    }

    public String getFunctionalRiskSystemTestDescription() {
        return functionalRiskSystemTestDescription;
    }

    public void setFunctionalRiskSystemTestWorkProduct(String functionalRiskSystemTestWorkProduct) {
        this.functionalRiskSystemTestWorkProduct = functionalRiskSystemTestWorkProduct;
    }

    public String getFunctionalRiskSystemTestWorkProduct() {
        return functionalRiskSystemTestWorkProduct;
    }

    public void setFunctionalRiskSystemTestResult(String functionalRiskSystemTestResult) {
        this.functionalRiskSystemTestResult = functionalRiskSystemTestResult;
    }

    public String getFunctionalRiskSystemTestResult() {
        return functionalRiskSystemTestResult;
    }
}