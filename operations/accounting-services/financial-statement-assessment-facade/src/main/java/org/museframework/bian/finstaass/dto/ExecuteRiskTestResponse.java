package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteRiskTestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.RiskTest riskTest;

    public void setRiskTest(org.museframework.bian.finstaass.dto.bq.RiskTest riskTest) {
        this.riskTest = riskTest;
    }

    public org.museframework.bian.finstaass.dto.bq.RiskTest getRiskTest() {
        return riskTest;
    }
}