package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveServicingFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility;

    public void setServicingFacility(org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility) {
        this.servicingFacility = servicingFacility;
    }

    public org.museframework.bian.serevehis.dto.bq.ServicingFacility getServicingFacility() {
        return servicingFacility;
    }
}