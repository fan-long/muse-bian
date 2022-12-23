package org.museframework.bian.segmentdirection.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSegmentStrategyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.segmentdirection.dto.cr.SegmentStrategy segmentStrategy;

    public void setSegmentStrategy(org.museframework.bian.segmentdirection.dto.cr.SegmentStrategy segmentStrategy) {
        this.segmentStrategy = segmentStrategy;
    }

    public org.museframework.bian.segmentdirection.dto.cr.SegmentStrategy getSegmentStrategy() {
        return segmentStrategy;
    }
}