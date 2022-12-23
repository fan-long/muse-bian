package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureAlertRequest {
    @MetaField
    private String partyroutingprofileid;

    @MetaField
    private String alertid;

    @MetaField(ref=true)
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