/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.productionrelease.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionRisk {
    /*The type of production test being performed (e.g. division of responsibilities, access control, audit trail, back-up and recovery)*/
    @MetaField(0)
    private String productionRiskSystemTestType;

    /*Detailed description of the test, including expected results*/
    @MetaField(0)
    private String productionRiskSystemTestDescription;

    /*Reference to testing materials, results, assessments and other documents*/
    @MetaField(0)
    private String productionRiskSystemTestWorkProduct;

    /*The result of the production risk test (including required remedial actions/fixes where appropriate)*/
    @MetaField(0)
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