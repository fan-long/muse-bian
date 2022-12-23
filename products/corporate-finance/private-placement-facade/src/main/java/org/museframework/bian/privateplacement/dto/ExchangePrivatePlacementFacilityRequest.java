package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePrivatePlacementFacilityRequest {
    @MetaField
    private String privateplacementid;

    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.cr.PrivatePlacementFacility privatePlacementFacility;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivatePlacementFacility(org.museframework.bian.privateplacement.dto.cr.PrivatePlacementFacility privatePlacementFacility) {
        this.privatePlacementFacility = privatePlacementFacility;
    }

    public org.museframework.bian.privateplacement.dto.cr.PrivatePlacementFacility getPrivatePlacementFacility() {
        return privatePlacementFacility;
    }
}