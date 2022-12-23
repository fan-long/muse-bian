package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateFiduciaryRelationshipFacilityRequest {
    @MetaField(ref=true)
    private org.museframework.bian.fiduciaryagreement.dto.cr.FiduciaryRelationshipFacility fiduciaryRelationshipFacility;

    public void setFiduciaryRelationshipFacility(org.museframework.bian.fiduciaryagreement.dto.cr.FiduciaryRelationshipFacility fiduciaryRelationshipFacility) {
        this.fiduciaryRelationshipFacility = fiduciaryRelationshipFacility;
    }

    public org.museframework.bian.fiduciaryagreement.dto.cr.FiduciaryRelationshipFacility getFiduciaryRelationshipFacility() {
        return fiduciaryRelationshipFacility;
    }
}