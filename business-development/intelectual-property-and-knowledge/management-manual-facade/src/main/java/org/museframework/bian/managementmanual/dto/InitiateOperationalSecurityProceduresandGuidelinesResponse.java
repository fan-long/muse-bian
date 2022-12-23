package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateOperationalSecurityProceduresandGuidelinesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.OperationalSecurityProceduresandGuidelines operationalSecurityProceduresandGuidelines;

    public void setOperationalSecurityProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.OperationalSecurityProceduresandGuidelines operationalSecurityProceduresandGuidelines) {
        this.operationalSecurityProceduresandGuidelines = operationalSecurityProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.OperationalSecurityProceduresandGuidelines getOperationalSecurityProceduresandGuidelines() {
        return operationalSecurityProceduresandGuidelines;
    }
}