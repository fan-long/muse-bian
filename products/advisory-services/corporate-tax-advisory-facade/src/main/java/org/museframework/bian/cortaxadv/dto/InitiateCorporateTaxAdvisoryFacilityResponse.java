package org.museframework.bian.cortaxadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCorporateTaxAdvisoryFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortaxadv.dto.cr.CorporateTaxAdvisoryFacility corporateTaxAdvisoryFacility;

    public void setCorporateTaxAdvisoryFacility(org.museframework.bian.cortaxadv.dto.cr.CorporateTaxAdvisoryFacility corporateTaxAdvisoryFacility) {
        this.corporateTaxAdvisoryFacility = corporateTaxAdvisoryFacility;
    }

    public org.museframework.bian.cortaxadv.dto.cr.CorporateTaxAdvisoryFacility getCorporateTaxAdvisoryFacility() {
        return corporateTaxAdvisoryFacility;
    }
}