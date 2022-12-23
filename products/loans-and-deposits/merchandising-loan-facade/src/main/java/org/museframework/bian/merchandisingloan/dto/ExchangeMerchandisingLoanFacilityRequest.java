package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeMerchandisingLoanFacilityRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility merchandisingLoanFacility;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setMerchandisingLoanFacility(org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility merchandisingLoanFacility) {
        this.merchandisingLoanFacility = merchandisingLoanFacility;
    }

    public org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility getMerchandisingLoanFacility() {
        return merchandisingLoanFacility;
    }
}