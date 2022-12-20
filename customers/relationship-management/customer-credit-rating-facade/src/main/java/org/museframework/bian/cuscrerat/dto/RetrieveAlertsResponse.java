package org.museframework.bian.cuscrerat.dto;

public class RetrieveAlertsResponse {
    private org.museframework.bian.cuscrerat.dto.bq.Alerts alerts;

    public void setAlerts(org.museframework.bian.cuscrerat.dto.bq.Alerts alerts) {
        this.alerts = alerts;
    }

    public org.museframework.bian.cuscrerat.dto.bq.Alerts getAlerts() {
        return alerts;
    }
}