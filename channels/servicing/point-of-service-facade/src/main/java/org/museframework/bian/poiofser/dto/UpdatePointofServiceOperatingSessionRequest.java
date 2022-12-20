package org.museframework.bian.poiofser.dto;

public class UpdatePointofServiceOperatingSessionRequest {
    private String pointofserviceid;

    private org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setPointofServiceOperatingSession(org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession pointofServiceOperatingSession) {
        this.pointofServiceOperatingSession = pointofServiceOperatingSession;
    }

    public org.museframework.bian.poiofser.dto.cr.PointofServiceOperatingSession getPointofServiceOperatingSession() {
        return pointofServiceOperatingSession;
    }
}