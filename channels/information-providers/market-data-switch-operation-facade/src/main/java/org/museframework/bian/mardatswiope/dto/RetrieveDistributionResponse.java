package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDistributionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mardatswiope.dto.bq.Distribution distribution;

    public void setDistribution(org.museframework.bian.mardatswiope.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.mardatswiope.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}