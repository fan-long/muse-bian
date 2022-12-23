package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifySecurityRightsIssueActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String securityrightsissueactionworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecurityrightsissueactionworkstepid(String securityrightsissueactionworkstepid) {
        this.securityrightsissueactionworkstepid = securityrightsissueactionworkstepid;
    }

    public String getSecurityrightsissueactionworkstepid() {
        return securityrightsissueactionworkstepid;
    }
}