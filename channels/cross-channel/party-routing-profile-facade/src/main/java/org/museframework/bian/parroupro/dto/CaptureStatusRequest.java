package org.museframework.bian.parroupro.dto;

public class CaptureStatusRequest {
    private String partyroutingprofileid;

    private String statusid;

    private org.museframework.bian.parroupro.dto.bq.Status status;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatus(org.museframework.bian.parroupro.dto.bq.Status status) {
        this.status = status;
    }

    public org.museframework.bian.parroupro.dto.bq.Status getStatus() {
        return status;
    }
}