package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAutomatedResponse {
    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Automated automated;

    public void setAutomated(org.museframework.bian.poiofser.dto.bq.Automated automated) {
        this.automated = automated;
    }

    public org.museframework.bian.poiofser.dto.bq.Automated getAutomated() {
        return automated;
    }
}