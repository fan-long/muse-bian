package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifySecuritySpin_OffActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String securityspin_offactionworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecurityspin_offactionworkstepid(String securityspin_offactionworkstepid) {
        this.securityspin_offactionworkstepid = securityspin_offactionworkstepid;
    }

    public String getSecurityspin_offactionworkstepid() {
        return securityspin_offactionworkstepid;
    }
}