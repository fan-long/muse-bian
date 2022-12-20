package org.museframework.bian.poiofser.dto;

public class InitiatePointofServiceOperatingSessionRequest {
    private org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession;

    public void setPointofServiceOperatingSession(org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession) {
        this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    }

    public org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession getPointofServiceOperatingSession() {
        return pointofServiceOperatingSession;
    }
}