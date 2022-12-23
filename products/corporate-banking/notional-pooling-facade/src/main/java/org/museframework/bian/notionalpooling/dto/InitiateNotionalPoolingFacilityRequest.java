package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateNotionalPoolingFacilityRequest {
    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility;

    public void setNotionalPoolingFacility(org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility) {
        this.notionalPoolingFacility = notionalPoolingFacility;
    }

    public org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility getNotionalPoolingFacility() {
        return notionalPoolingFacility;
    }
}