package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateNotionalPoolingFacilityRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalPoolingFacility(org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility notionalPoolingFacility) {
        this.notionalPoolingFacility = notionalPoolingFacility;
    }

    public org.museframework.bian.notionalpooling.dto.cr.NotionalPoolingFacility getNotionalPoolingFacility() {
        return notionalPoolingFacility;
    }
}