package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestFinancialStatementAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment;

    public void setFinancialStatementAssessment(org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment) {
        this.financialStatementAssessment = financialStatementAssessment;
    }

    public org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment getFinancialStatementAssessment() {
        return financialStatementAssessment;
    }
}