package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateDistributionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Distribution distribution;

    public void setDistribution(org.museframework.bian.proinvdis.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.proinvdis.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}