package org.museframework.bian.cardauthorization.dto;

public class UpdateCreditCardAuthorizationAssessmentRequest {
    private String cardauthorizationid;

    private org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment creditCardAuthorizationAssessment;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setCreditCardAuthorizationAssessment(org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment creditCardAuthorizationAssessment) {
        this.creditCardAuthorizationAssessment = creditCardAuthorizationAssessment;
    }

    public org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment getCreditCardAuthorizationAssessment() {
        return creditCardAuthorizationAssessment;
    }
}