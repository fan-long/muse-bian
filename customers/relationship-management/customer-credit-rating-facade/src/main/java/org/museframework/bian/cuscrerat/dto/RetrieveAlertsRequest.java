package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAlertsRequest {
    @MetaField
    private String customercreditratingid;

    @MetaField
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