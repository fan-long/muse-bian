package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureProvisioningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning;

    public void setProvisioning(org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning) {
        this.provisioning = provisioning;
    }

    public org.museframework.bian.proinvdis.dto.bq.Provisioning getProvisioning() {
        return provisioning;
    }
}