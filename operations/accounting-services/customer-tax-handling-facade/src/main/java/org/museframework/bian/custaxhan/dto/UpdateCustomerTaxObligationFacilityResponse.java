package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCustomerTaxObligationFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility;

    public void setCustomerTaxObligationFacility(org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility) {
        this.customerTaxObligationFacility = customerTaxObligationFacility;
    }

    public org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility getCustomerTaxObligationFacility() {
        return customerTaxObligationFacility;
    }
}