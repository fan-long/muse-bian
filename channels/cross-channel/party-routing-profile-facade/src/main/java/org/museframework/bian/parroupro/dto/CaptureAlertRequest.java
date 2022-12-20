package org.museframework.bian.parroupro.dto;

public class CaptureAlertRequest {
    private String partyroutingprofileid;

    private String alertid;

    private org.museframework.bian.parroupro.dto.bq.Alert alert;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setAlertid(String alertid) {
        this.alertid = alertid;
    }

    public String getAlertid() {
        return alertid;
    }

    public void setAlert(org.museframework.bian.parroupro.dto.bq.Alert alert) {
        this.alert = alert;
    }

    public org.museframework.bian.parroupro.dto.bq.Alert getAlert() {
        return alert;
    }
}