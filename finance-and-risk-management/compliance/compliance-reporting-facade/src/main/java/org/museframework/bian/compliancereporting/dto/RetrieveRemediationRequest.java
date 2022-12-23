package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRemediationRequest {
    @MetaField
    private String compliancereportingid;

    @MetaField
    private String remediationid;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setRemediationid(String remediationid) {
        this.remediationid = remediationid;
    }

    public String getRemediationid() {
        return remediationid;
    }
}