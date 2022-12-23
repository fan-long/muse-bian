package org.museframework.bian.creditfacility.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCreditLineFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility;

    public void setCreditLineFacility(org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility) {
        this.creditLineFacility = creditLineFacility;
    }

    public org.museframework.bian.creditfacility.dto.cr.CreditLineFacility getCreditLineFacility() {
        return creditLineFacility;
    }
}