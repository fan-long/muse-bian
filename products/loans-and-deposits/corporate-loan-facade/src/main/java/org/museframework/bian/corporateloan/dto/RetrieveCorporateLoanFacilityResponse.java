package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCorporateLoanFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility corporateLoanFacility;

    public void setCorporateLoanFacility(org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility corporateLoanFacility) {
        this.corporateLoanFacility = corporateLoanFacility;
    }

    public org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility getCorporateLoanFacility() {
        return corporateLoanFacility;
    }
}