/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.productmatching.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductEligibility {
    /*The required status/situation before the test can be applied*/
    @MetaField
    private String productEligibilityPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField
    private String productEligibilityAnalysisSchedule;

    /*The test version employed*/
    @MetaField
    private String productEligibilityVersionNumber;

    /*The Product/Customer Combination Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productEligibility;

    /*Reference to the specific business service type*/
    @MetaField
    private String productEligibilityServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String productEligibilityServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String productEligibilityServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String productEligibilityServiceWorkProduct;

    /**/
    @MetaField
    private String productEligibilityServiceName;

    public void setProductEligibilityPreconditions(String productEligibilityPreconditions) {
        this.productEligibilityPreconditions = productEligibilityPreconditions;
    }

    public String getProductEligibilityPreconditions() {
        return productEligibilityPreconditions;
    }

    public void setProductEligibilityAnalysisSchedule(String productEligibilityAnalysisSchedule) {
        this.productEligibilityAnalysisSchedule = productEligibilityAnalysisSchedule;
    }

    public String getProductEligibilityAnalysisSchedule() {
        return productEligibilityAnalysisSchedule;
    }

    public void setProductEligibilityVersionNumber(String productEligibilityVersionNumber) {
        this.productEligibilityVersionNumber = productEligibilityVersionNumber;
    }

    public String getProductEligibilityVersionNumber() {
        return productEligibilityVersionNumber;
    }

    public void setProductEligibility(org.museframework.bian.classes.BusinessService productEligibility) {
        this.productEligibility = productEligibility;
    }

    public org.museframework.bian.classes.BusinessService getProductEligibility() {
        return productEligibility;
    }

    public void setProductEligibilityServiceType(String productEligibilityServiceType) {
        this.productEligibilityServiceType = productEligibilityServiceType;
    }

    public String getProductEligibilityServiceType() {
        return productEligibilityServiceType;
    }

    public void setProductEligibilityServiceDescription(String productEligibilityServiceDescription) {
        this.productEligibilityServiceDescription = productEligibilityServiceDescription;
    }

    public String getProductEligibilityServiceDescription() {
        return productEligibilityServiceDescription;
    }

    public void setProductEligibilityServiceInputsandOuputs(String productEligibilityServiceInputsandOuputs) {
        this.productEligibilityServiceInputsandOuputs = productEligibilityServiceInputsandOuputs;
    }

    public String getProductEligibilityServiceInputsandOuputs() {
        return productEligibilityServiceInputsandOuputs;
    }

    public void setProductEligibilityServiceWorkProduct(String productEligibilityServiceWorkProduct) {
        this.productEligibilityServiceWorkProduct = productEligibilityServiceWorkProduct;
    }

    public String getProductEligibilityServiceWorkProduct() {
        return productEligibilityServiceWorkProduct;
    }

    public void setProductEligibilityServiceName(String productEligibilityServiceName) {
        this.productEligibilityServiceName = productEligibilityServiceName;
    }

    public String getProductEligibilityServiceName() {
        return productEligibilityServiceName;
    }
}