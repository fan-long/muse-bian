package org.museframework.bian.secfaipro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeSecuritiesFailDeterminationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.secfaipro.dto.bq.SecuritiesFailDeterminationWorkstep securitiesFailDeterminationWorkstep;

    public void setSecuritiesFailDeterminationWorkstep(org.museframework.bian.secfaipro.dto.bq.SecuritiesFailDeterminationWorkstep securitiesFailDeterminationWorkstep) {
        this.securitiesFailDeterminationWorkstep = securitiesFailDeterminationWorkstep;
    }

    public org.museframework.bian.secfaipro.dto.bq.SecuritiesFailDeterminationWorkstep getSecuritiesFailDeterminationWorkstep() {
        return securitiesFailDeterminationWorkstep;
    }
}