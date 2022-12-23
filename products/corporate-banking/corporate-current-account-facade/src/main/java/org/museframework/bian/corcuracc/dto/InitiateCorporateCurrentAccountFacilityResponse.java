package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCorporateCurrentAccountFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.cr.CorporateCurrentAccountFacility corporateCurrentAccountFacility;

    public void setCorporateCurrentAccountFacility(org.museframework.bian.corcuracc.dto.cr.CorporateCurrentAccountFacility corporateCurrentAccountFacility) {
        this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    }

    public org.museframework.bian.corcuracc.dto.cr.CorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
        return corporateCurrentAccountFacility;
    }
}