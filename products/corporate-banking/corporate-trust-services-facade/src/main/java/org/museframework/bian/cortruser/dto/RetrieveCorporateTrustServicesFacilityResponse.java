package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCorporateTrustServicesFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility;

    public void setCorporateTrustServicesFacility(org.museframework.bian.cortruser.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility) {
        this.corporateTrustServicesFacility = corporateTrustServicesFacility;
    }

    public org.museframework.bian.cortruser.dto.cr.CorporateTrustServicesFacility getCorporateTrustServicesFacility() {
        return corporateTrustServicesFacility;
    }
}