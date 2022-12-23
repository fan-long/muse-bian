package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestPeakLoadResponse {
    @MetaField(ref=true)
    private org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad;

    public void setPeakLoad(org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad) {
        this.peakLoad = peakLoad;
    }

    public org.museframework.bian.concenope.dto.bq.PeakLoad getPeakLoad() {
        return peakLoad;
    }
}