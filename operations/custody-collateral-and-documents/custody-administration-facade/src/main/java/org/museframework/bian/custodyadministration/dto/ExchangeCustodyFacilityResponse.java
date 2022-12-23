package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeCustodyFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.cr.CustodyFacility custodyFacility;

    public void setCustodyFacility(org.museframework.bian.custodyadministration.dto.cr.CustodyFacility custodyFacility) {
        this.custodyFacility = custodyFacility;
    }

    public org.museframework.bian.custodyadministration.dto.cr.CustodyFacility getCustodyFacility() {
        return custodyFacility;
    }
}