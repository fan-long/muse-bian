/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.productionrelease.dto.bq;

public class ProductionRisk {
    /*The type of production test being performed (e.g. division of responsibilities, access control, audit trail, back-up and recovery)*/
    private String productionRiskSystemTestType;

    /*Detailed description of the test, including expected results*/
    private String productionRiskSystemTestDescription;

    /*Reference to testing materials, results, assessments and other documents*/
    private String productionRiskSystemTestWorkProduct;

    /*The result of the production risk test (including required remedial actions/fixes where appropriate)*/
    private String productionRiskSystemTestResult;

    public void setProductionRiskSystemTestType(String productionRiskSystemTestType) {
        this.productionRiskSystemTestType = productionRiskSystemTestType;
    }

    public String getProductionRiskSystemTestType() {
        return productionRiskSystemTestType;
    }

    public void setProductionRiskSystemTestDescription(String productionRiskSystemTestDescription) {
        this.productionRiskSystemTestDescription = productionRiskSystemTestDescription;
    }

    public String getProductionRiskSystemTestDescription() {
        return productionRiskSystemTestDescription;
    }

    public void setProductionRiskSystemTestWorkProduct(String productionRiskSystemTestWorkProduct) {
        this.productionRiskSystemTestWorkProduct = productionRiskSystemTestWorkProduct;
    }

    public String getProductionRiskSystemTestWorkProduct() {
        return productionRiskSystemTestWorkProduct;
    }

    public void setProductionRiskSystemTestResult(String productionRiskSystemTestResult) {
        this.productionRiskSystemTestResult = productionRiskSystemTestResult;
    }

    public String getProductionRiskSystemTestResult() {
        return productionRiskSystemTestResult;
    }
}