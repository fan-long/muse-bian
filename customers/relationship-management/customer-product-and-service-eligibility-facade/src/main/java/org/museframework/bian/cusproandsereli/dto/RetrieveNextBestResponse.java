package org.museframework.bian.cusproandsereli.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveNextBestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusproandsereli.dto.bq.NextBest nextBest;

    public void setNextBest(org.museframework.bian.cusproandsereli.dto.bq.NextBest nextBest) {
        this.nextBest = nextBest;
    }

    public org.museframework.bian.cusproandsereli.dto.bq.NextBest getNextBest() {
        return nextBest;
    }
}