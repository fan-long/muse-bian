package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePublicOfferingFacilityRequest {
    @MetaField
    private String publicofferingid;

    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicOfferingFacility(org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility) {
        this.publicOfferingFacility = publicOfferingFacility;
    }

    public org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility getPublicOfferingFacility() {
        return publicOfferingFacility;
    }
}