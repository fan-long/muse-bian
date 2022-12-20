package org.museframework.bian.cuscrerat.dto;

public class CaptureAlertsRequest {
    private String customercreditratingid;

    private String alertsid;

    private org.museframework.bian.cuscrerat.dto.bq.Alerts alerts;

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

    public void setAlerts(org.museframework.bian.cuscrerat.dto.bq.Alerts alerts) {
        this.alerts = alerts;
    }

    public org.museframework.bian.cuscrerat.dto.bq.Alerts getAlerts() {
        return alerts;
    }
}