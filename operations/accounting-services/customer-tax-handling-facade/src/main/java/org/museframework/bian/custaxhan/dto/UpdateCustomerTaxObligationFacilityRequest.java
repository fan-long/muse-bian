package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCustomerTaxObligationFacilityRequest {
    @MetaField
    private String customertaxhandlingid;

    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setCustomerTaxObligationFacility(org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility) {
        this.customerTaxObligationFacility = customerTaxObligationFacility;
    }

    public org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility getCustomerTaxObligationFacility() {
        return customerTaxObligationFacility;
    }
}