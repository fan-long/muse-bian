package org.museframework.bian.pubrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveGlobalReferenceDataResponse {
    @MetaField(ref=true)
    private org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData;

    public void setGlobalReferenceData(org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData) {
        this.globalReferenceData = globalReferenceData;
    }

    public org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData getGlobalReferenceData() {
        return globalReferenceData;
    }
}