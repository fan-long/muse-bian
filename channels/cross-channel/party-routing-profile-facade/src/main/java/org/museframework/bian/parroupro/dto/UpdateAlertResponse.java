package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAlertResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parroupro.dto.bq.Alert alert;

    public void setAlert(org.museframework.bian.parroupro.dto.bq.Alert alert) {
        this.alert = alert;
    }

    public org.museframework.bian.parroupro.dto.bq.Alert getAlert() {
        return alert;
    }
}