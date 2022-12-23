package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureAlertsRequest {
    @MetaField
    private String customercreditratingid;

    @MetaField
    private String alertsid;

    @MetaField(ref=true)
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