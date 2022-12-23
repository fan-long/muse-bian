package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFacilityApplicationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication;

    public void setFacilityApplication(org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication) {
        this.facilityApplication = facilityApplication;
    }

    public org.museframework.bian.customeroffer.dto.bq.FacilityApplication getFacilityApplication() {
        return facilityApplication;
    }
}