package org.museframework.bian.creditfacility.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCreditLineFacilityRequest {
    @MetaField
    private String creditfacilityid;

    @MetaField(ref=true)
    private org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setCreditLineFacility(org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility) {
        this.creditLineFacility = creditLineFacility;
    }

    public org.museframework.bian.creditfacility.dto.cr.CreditLineFacility getCreditLineFacility() {
        return creditLineFacility;
    }
}