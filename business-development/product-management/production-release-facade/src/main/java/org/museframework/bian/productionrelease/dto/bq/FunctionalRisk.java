/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.productionrelease.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FunctionalRisk {
    /*The type of functional test being performed (e.g. functional coverage/integrity, usability, application integration)*/
    @MetaField(0)
    private String functionalRiskSystemTestType;

    /*Detailed description of the test, including expected results*/
    @MetaField(0)
    private String functionalRiskSystemTestDescription;

    /*Reference to testing materials, results, assessments and other documents*/
    @MetaField(0)
    private String functionalRiskSystemTestWorkProduct;

    /*The result of the functional risk test (including required remedial actions/fixes where appropriate)*/
    @MetaField(0)
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