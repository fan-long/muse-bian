package org.museframework.bian.cardauthorization.dto;

public class RetrieveCreditCardAuthorizationAssessmentResponse {
    private org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment creditCardAuthorizationAssessment;

    public void setCreditCardAuthorizationAssessment(org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment creditCardAuthorizationAssessment) {
        this.creditCardAuthorizationAssessment = creditCardAuthorizationAssessment;
    }

    public org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment getCreditCardAuthorizationAssessment() {
        return creditCardAuthorizationAssessment;
    }
}