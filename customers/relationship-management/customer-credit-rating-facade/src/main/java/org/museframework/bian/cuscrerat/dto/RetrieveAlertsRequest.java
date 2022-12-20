package org.museframework.bian.cuscrerat.dto;

public class RetrieveAlertsRequest {
    private String customercreditratingid;

    private String alertsid;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setAlertsid(String alertsid) {
        this.alertsid = alertsid;
    }

    public String getAlertsid() {
        return alertsid;
    }
}