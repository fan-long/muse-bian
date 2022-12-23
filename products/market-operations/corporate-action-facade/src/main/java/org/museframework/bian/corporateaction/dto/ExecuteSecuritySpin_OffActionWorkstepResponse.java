package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteSecuritySpin_OffActionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.SecuritySpin_OffActionWorkstep securitySpin_OffActionWorkstep;

    public void setSecuritySpin_OffActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecuritySpin_OffActionWorkstep securitySpin_OffActionWorkstep) {
        this.securitySpin_OffActionWorkstep = securitySpin_OffActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecuritySpin_OffActionWorkstep getSecuritySpin_OffActionWorkstep() {
        return securitySpin_OffActionWorkstep;
    }
}