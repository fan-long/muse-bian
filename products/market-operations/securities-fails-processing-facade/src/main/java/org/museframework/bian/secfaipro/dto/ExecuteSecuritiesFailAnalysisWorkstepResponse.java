package org.museframework.bian.secfaipro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteSecuritiesFailAnalysisWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.secfaipro.dto.bq.SecuritiesFailAnalysisWorkstep securitiesFailAnalysisWorkstep;

    public void setSecuritiesFailAnalysisWorkstep(org.museframework.bian.secfaipro.dto.bq.SecuritiesFailAnalysisWorkstep securitiesFailAnalysisWorkstep) {
        this.securitiesFailAnalysisWorkstep = securitiesFailAnalysisWorkstep;
    }

    public org.museframework.bian.secfaipro.dto.bq.SecuritiesFailAnalysisWorkstep getSecuritiesFailAnalysisWorkstep() {
        return securitiesFailAnalysisWorkstep;
    }
}