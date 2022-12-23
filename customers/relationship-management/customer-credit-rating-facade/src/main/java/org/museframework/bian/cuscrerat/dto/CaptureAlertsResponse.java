package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureAlertsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscrerat.dto.bq.Alerts alerts;

    public void setAlerts(org.museframework.bian.cuscrerat.dto.bq.Alerts alerts) {
        this.alerts = alerts;
    }

    public org.museframework.bian.cuscrerat.dto.bq.Alerts getAlerts() {
        return alerts;
    }
}