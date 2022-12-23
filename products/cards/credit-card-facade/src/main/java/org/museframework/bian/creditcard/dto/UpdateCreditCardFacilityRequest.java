package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCreditCardFacilityRequest {
    @MetaField
    private String creditcardid;

    @MetaField(ref=true)
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