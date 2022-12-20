package org.museframework.bian.parroupro.dto;

public class RetrieveAlertRequest {
    private String partyroutingprofileid;

    private String alertid;

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
}