/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.productionrelease.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BusinessRisk {
    /*The type of business risk test being performed (e.g. compliance, pricing, exposure)*/
    @MetaField(0)
    private String businessRiskSystemTestType;

    /*Detailed description of the test, including expected results*/
    @MetaField(0)
    private String businessRiskSystemTestDescription;

    /*Reference to testing materials, results, assessments and other documents*/
    @MetaField(0)
    private String businessRiskTestWorkProduct;

    /*The result of the business risk test (including required remedial actions/fixes where appropriate)*/
    @MetaField(0)
    private String businessRiskTestResult;

    public void setBusinessRiskSystemTestType(String businessRiskSystemTestType) {
        this.businessRiskSystemTestType = businessRiskSystemTestType;
    }

    public String getBusinessRiskSystemTestType() {
        return businessRiskSystemTestType;
    }

    public void setBusinessRiskSystemTestDescription(String businessRiskSystemTestDescription) {
        this.businessRiskSystemTestDescription = businessRiskSystemTestDescription;
    }

    public String getBusinessRiskSystemTestDescription() {
        return businessRiskSystemTestDescription;
    }

    public void setBusinessRiskTestWorkProduct(String businessRiskTestWorkProduct) {
        this.businessRiskTestWorkProduct = businessRiskTestWorkProduct;
    }

    public String getBusinessRiskTestWorkProduct() {
        return businessRiskTestWorkProduct;
    }

    public void setBusinessRiskTestResult(String businessRiskTestResult) {
        this.businessRiskTestResult = businessRiskTestResult;
    }

    public String getBusinessRiskTestResult() {
        return businessRiskTestResult;
    }
}