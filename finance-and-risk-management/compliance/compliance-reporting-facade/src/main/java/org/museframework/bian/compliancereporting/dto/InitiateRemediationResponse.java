package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateRemediationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.compliancereporting.dto.bq.Remediation remediation;

    public void setRemediation(org.museframework.bian.compliancereporting.dto.bq.Remediation remediation) {
        this.remediation = remediation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Remediation getRemediation() {
        return remediation;
    }
}