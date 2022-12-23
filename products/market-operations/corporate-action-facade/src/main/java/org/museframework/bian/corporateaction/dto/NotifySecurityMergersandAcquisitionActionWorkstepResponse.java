package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifySecurityMergersandAcquisitionActionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep securityMergersandAcquisitionActionWorkstep;

    public void setSecurityMergersandAcquisitionActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep securityMergersandAcquisitionActionWorkstep) {
        this.securityMergersandAcquisitionActionWorkstep = securityMergersandAcquisitionActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep getSecurityMergersandAcquisitionActionWorkstep() {
        return securityMergersandAcquisitionActionWorkstep;
    }
}