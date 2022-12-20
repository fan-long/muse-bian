/**/
package org.museframework.bian.cusproandsereli.dto.bq;

public class EligibilityCheck {
    /*The result of the eligibility assessment for the requested product/service - details any eligibility considerations or requirements and the applicable terms*/
    private String customerProductandServiceEligibilityAssessmentResult;

    public void setCustomerProductandServiceEligibilityAssessmentResult(String customerProductandServiceEligibilityAssessmentResult) {
        this.customerProductandServiceEligibilityAssessmentResult = customerProductandServiceEligibilityAssessmentResult;
    }

    public String getCustomerProductandServiceEligibilityAssessmentResult() {
        return customerProductandServiceEligibilityAssessmentResult;
    }
}