package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateComplianceCheckWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep complianceCheckWorkstep;

    public void setComplianceCheckWorkstep(org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep complianceCheckWorkstep) {
        this.complianceCheckWorkstep = complianceCheckWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep getComplianceCheckWorkstep() {
        return complianceCheckWorkstep;
    }
}