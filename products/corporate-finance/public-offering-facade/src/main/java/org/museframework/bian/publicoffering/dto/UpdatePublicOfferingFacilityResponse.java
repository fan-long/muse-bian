package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePublicOfferingFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility;

    public void setPublicOfferingFacility(org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility) {
        this.publicOfferingFacility = publicOfferingFacility;
    }

    public org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility getPublicOfferingFacility() {
        return publicOfferingFacility;
    }
}