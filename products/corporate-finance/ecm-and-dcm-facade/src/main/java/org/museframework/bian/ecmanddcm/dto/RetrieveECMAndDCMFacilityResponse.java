package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveECMAndDCMFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility eCMAndDCMFacility;

    public void seteCMAndDCMFacility(org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility eCMAndDCMFacility) {
        this.eCMAndDCMFacility = eCMAndDCMFacility;
    }

    public org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility geteCMAndDCMFacility() {
        return eCMAndDCMFacility;
    }
}