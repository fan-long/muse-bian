package org.museframework.bian.segmentdirection.dto;

public class RequestSegmentStrategyRequest {
    private String segmentdirectionid;

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