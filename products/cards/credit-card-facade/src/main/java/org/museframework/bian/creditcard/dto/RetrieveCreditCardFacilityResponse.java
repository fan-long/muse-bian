package org.museframework.bian.creditcard.dto;

public class RetrieveCreditCardFacilityResponse {
    private org.museframework.bian.creditcard.dto.cr.CreditCardFacility creditCardFacility;

    public void setCreditCardFacility(org.museframework.bian.creditcard.dto.cr.CreditCardFacility creditCardFacility) {
        this.creditCardFacility = creditCardFacility;
    }

    public org.museframework.bian.creditcard.dto.cr.CreditCardFacility getCreditCardFacility() {
        return creditCardFacility;
    }
}