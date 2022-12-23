package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCreditCardFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.cr.CreditCardFacility creditCardFacility;

    public void setCreditCardFacility(org.museframework.bian.creditcard.dto.cr.CreditCardFacility creditCardFacility) {
        this.creditCardFacility = creditCardFacility;
    }

    public org.museframework.bian.creditcard.dto.cr.CreditCardFacility getCreditCardFacility() {
        return creditCardFacility;
    }
}