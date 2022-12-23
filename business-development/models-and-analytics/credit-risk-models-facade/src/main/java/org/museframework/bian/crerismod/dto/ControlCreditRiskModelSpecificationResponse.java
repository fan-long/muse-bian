package org.museframework.bian.crerismod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlCreditRiskModelSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.crerismod.dto.cr.CreditRiskModelSpecification creditRiskModelSpecification;

    public void setCreditRiskModelSpecification(org.museframework.bian.crerismod.dto.cr.CreditRiskModelSpecification creditRiskModelSpecification) {
        this.creditRiskModelSpecification = creditRiskModelSpecification;
    }

    public org.museframework.bian.crerismod.dto.cr.CreditRiskModelSpecification getCreditRiskModelSpecification() {
        return creditRiskModelSpecification;
    }
}