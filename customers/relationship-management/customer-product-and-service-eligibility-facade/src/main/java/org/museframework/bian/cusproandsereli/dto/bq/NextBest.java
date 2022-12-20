/**/
package org.museframework.bian.cusproandsereli.dto.bq;

public class NextBest {
    /*Product/service features used to focus the selection*/
    private String requestedProductandServiceProperties;

    /*The general type of product/service for which the best eligible product match is requested (e.g. term deposit, loan)*/
    private String productServiceType;

    /*The result is a descending list of matched products with the associated eligibility that are available to the customer*/
    private String customerProductandServiceNextBestAssessmentResult;

    public void setRequestedProductandServiceProperties(String requestedProductandServiceProperties) {
        this.requestedProductandServiceProperties = requestedProductandServiceProperties;
    }

    public String getRequestedProductandServiceProperties() {
        return requestedProductandServiceProperties;
    }

    public void setProductServiceType(String productServiceType) {
        this.productServiceType = productServiceType;
    }

    public String getProductServiceType() {
        return productServiceType;
    }

    public void setCustomerProductandServiceNextBestAssessmentResult(String customerProductandServiceNextBestAssessmentResult) {
        this.customerProductandServiceNextBestAssessmentResult = customerProductandServiceNextBestAssessmentResult;
    }

    public String getCustomerProductandServiceNextBestAssessmentResult() {
        return customerProductandServiceNextBestAssessmentResult;
    }
}