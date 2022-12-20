package org.museframework.bian.serevehis.dto;

public class RetrieveServicingEventLogResponse {
    private org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog;

    public void setServicingEventLog(org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog) {
        this.servicingEventLog = servicingEventLog;
    }

    public org.museframework.bian.serevehis.dto.cr.ServicingEventLog getServicingEventLog() {
        return servicingEventLog;
    }
}