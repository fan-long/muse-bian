package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateMerchandisingLoanFacilityRequest {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility merchandisingLoanFacility;

    public void setMerchandisingLoanFacility(org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility merchandisingLoanFacility) {
        this.merchandisingLoanFacility = merchandisingLoanFacility;
    }

    public org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility getMerchandisingLoanFacility() {
        return merchandisingLoanFacility;
    }
}