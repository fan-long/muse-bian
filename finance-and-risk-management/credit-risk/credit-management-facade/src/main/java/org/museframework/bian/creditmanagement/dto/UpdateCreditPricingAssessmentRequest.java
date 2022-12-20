package org.museframework.bian.creditmanagement.dto;

public class UpdateCreditPricingAssessmentRequest {
    private String creditmanagementid;

    private org.museframework.bian.creditmanagement.dto.cr.CreditPricingAssessment creditPricingAssessment;

    public void setCreditmanagementid(String creditmanagementid) {
        this.creditmanagementid = creditmanagementid;
    }

    public String getCreditmanagementid() {
        return creditmanagementid;
    }

    public void setCreditPricingAssessment(org.museframework.bian.creditmanagement.dto.cr.CreditPricingAssessment creditPricingAssessment) {
        this.creditPricingAssessment = creditPricingAssessment;
    }

    public org.museframework.bian.creditmanagement.dto.cr.CreditPricingAssessment getCreditPricingAssessment() {
        return creditPricingAssessment;
    }
}