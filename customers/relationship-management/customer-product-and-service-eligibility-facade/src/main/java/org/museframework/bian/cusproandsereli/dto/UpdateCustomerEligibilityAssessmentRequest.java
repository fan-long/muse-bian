package org.museframework.bian.cusproandsereli.dto;

public class UpdateCustomerEligibilityAssessmentRequest {
    private String customerproductandserviceeligibilityid;

    private org.museframework.bian.cusproandsereli.dto.cr.CustomerEligibilityAssessment customerEligibilityAssessment;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setCustomerEligibilityAssessment(org.museframework.bian.cusproandsereli.dto.cr.CustomerEligibilityAssessment customerEligibilityAssessment) {
        this.customerEligibilityAssessment = customerEligibilityAssessment;
    }

    public org.museframework.bian.cusproandsereli.dto.cr.CustomerEligibilityAssessment getCustomerEligibilityAssessment() {
        return customerEligibilityAssessment;
    }
}