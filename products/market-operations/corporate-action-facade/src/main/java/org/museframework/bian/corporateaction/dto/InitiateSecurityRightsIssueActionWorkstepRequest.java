package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSecurityRightsIssueActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String securityrightsissueactionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep securityRightsIssueActionWorkstep;

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

    public void setSecurityRightsIssueActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep securityRightsIssueActionWorkstep) {
        this.securityRightsIssueActionWorkstep = securityRightsIssueActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep getSecurityRightsIssueActionWorkstep() {
        return securityRightsIssueActionWorkstep;
    }
}