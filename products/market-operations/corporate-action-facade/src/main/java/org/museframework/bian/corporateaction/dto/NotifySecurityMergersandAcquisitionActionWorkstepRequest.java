package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifySecurityMergersandAcquisitionActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String securitymergersandacquisitionactionworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecuritymergersandacquisitionactionworkstepid(String securitymergersandacquisitionactionworkstepid) {
        this.securitymergersandacquisitionactionworkstepid = securitymergersandacquisitionactionworkstepid;
    }

    public String getSecuritymergersandacquisitionactionworkstepid() {
        return securitymergersandacquisitionactionworkstepid;
    }
}