package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRiskTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String risktestid;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setRisktestid(String risktestid) {
        this.risktestid = risktestid;
    }

    public String getRisktestid() {
        return risktestid;
    }
}