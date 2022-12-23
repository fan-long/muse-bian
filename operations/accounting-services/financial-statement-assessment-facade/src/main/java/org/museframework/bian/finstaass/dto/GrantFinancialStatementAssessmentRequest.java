package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantFinancialStatementAssessmentRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setFinancialStatementAssessment(org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment) {
        this.financialStatementAssessment = financialStatementAssessment;
    }

    public org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment getFinancialStatementAssessment() {
        return financialStatementAssessment;
    }
}