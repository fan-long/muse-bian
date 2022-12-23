package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteRiskTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String risktestid;

    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.RiskTest riskTest;

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

    public void setRiskTest(org.museframework.bian.finstaass.dto.bq.RiskTest riskTest) {
        this.riskTest = riskTest;
    }

    public org.museframework.bian.finstaass.dto.bq.RiskTest getRiskTest() {
        return riskTest;
    }
}