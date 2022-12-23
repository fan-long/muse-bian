package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCorporateTrustServicesFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility;

    public void setCorporateTrustServicesFacility(org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility) {
        this.corporateTrustServicesFacility = corporateTrustServicesFacility;
    }

    public org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility getCorporateTrustServicesFacility() {
        return corporateTrustServicesFacility;
    }
}