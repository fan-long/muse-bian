package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateRemediationRequest {
    @MetaField
    private String compliancereportingid;

    @MetaField
    private String remediationid;

    @MetaField(ref=true)
    private org.museframework.bian.compliancereporting.dto.bq.Remediation remediation;

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

    public void setRemediation(org.museframework.bian.compliancereporting.dto.bq.Remediation remediation) {
        this.remediation = remediation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Remediation getRemediation() {
        return remediation;
    }
}