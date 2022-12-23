package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSecurityRightsIssueActionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep securityRightsIssueActionWorkstep;

    public void setSecurityRightsIssueActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep securityRightsIssueActionWorkstep) {
        this.securityRightsIssueActionWorkstep = securityRightsIssueActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep getSecurityRightsIssueActionWorkstep() {
        return securityRightsIssueActionWorkstep;
    }
}