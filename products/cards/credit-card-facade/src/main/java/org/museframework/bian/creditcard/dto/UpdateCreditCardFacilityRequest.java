package org.museframework.bian.creditcard.dto;

public class UpdateCreditCardFacilityRequest {
    private String creditcardid;

    private org.museframework.bian.creditcard.dto.cr.CreditCardFacility creditCardFacility;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCreditCardFacility(org.museframework.bian.creditcard.dto.cr.CreditCardFacility creditCardFacility) {
        this.creditCardFacility = creditCardFacility;
    }

    public org.museframework.bian.creditcard.dto.cr.CreditCardFacility getCreditCardFacility() {
        return creditCardFacility;
    }
}