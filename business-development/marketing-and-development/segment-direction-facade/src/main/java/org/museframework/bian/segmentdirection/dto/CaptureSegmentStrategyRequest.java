package org.museframework.bian.segmentdirection.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureSegmentStrategyRequest {
    @MetaField
    private String segmentdirectionid;

    @MetaField(ref=true)
    private org.museframework.bian.segmentdirection.dto.cr.SegmentStrategy segmentStrategy;

    public void setSegmentdirectionid(String segmentdirectionid) {
        this.segmentdirectionid = segmentdirectionid;
    }

    public String getSegmentdirectionid() {
        return segmentdirectionid;
    }

    public void setSegmentStrategy(org.museframework.bian.segmentdirection.dto.cr.SegmentStrategy segmentStrategy) {
        this.segmentStrategy = segmentStrategy;
    }

    public org.museframework.bian.segmentdirection.dto.cr.SegmentStrategy getSegmentStrategy() {
        return segmentStrategy;
    }
}