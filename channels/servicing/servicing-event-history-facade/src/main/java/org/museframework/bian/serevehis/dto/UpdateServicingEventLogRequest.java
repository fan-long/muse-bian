package org.museframework.bian.serevehis.dto;

public class UpdateServicingEventLogRequest {
    private String servicingeventhistoryid;

    private org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setServicingEventLog(org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog) {
        this.servicingEventLog = servicingEventLog;
    }

    public org.museframework.bian.serevehis.dto.cr.ServicingEventLog getServicingEventLog() {
        return servicingEventLog;
    }
}