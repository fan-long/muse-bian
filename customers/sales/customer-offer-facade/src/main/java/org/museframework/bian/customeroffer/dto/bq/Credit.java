/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Credit {
    /*The customer's current credit rating*/
    @MetaField
    private String customerCreditRating;

    /*Reference to the authorization if an aspect of the offer procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object creditAuthorizationDecisionReference;

    /*The credit decision (indicates credit position is adequate for the offer)*/
    @MetaField
    private String creditAuthorizationDecision;

    public void setCustomerCreditRating(String customerCreditRating) {
        this.customerCreditRating = customerCreditRating;
    }

    public String getCustomerCreditRating() {
        return customerCreditRating;
    }

    public void setCreditAuthorizationDecisionReference(org.museframework.bian.classes.Object creditAuthorizationDecisionReference) {
        this.creditAuthorizationDecisionReference = creditAuthorizationDecisionReference;
    }

    public org.museframework.bian.classes.Object getCreditAuthorizationDecisionReference() {
        return creditAuthorizationDecisionReference;
    }

    public void setCreditAuthorizationDecision(String creditAuthorizationDecision) {
        this.creditAuthorizationDecision = creditAuthorizationDecision;
    }

    public String getCreditAuthorizationDecision() {
        return creditAuthorizationDecision;
    }
}