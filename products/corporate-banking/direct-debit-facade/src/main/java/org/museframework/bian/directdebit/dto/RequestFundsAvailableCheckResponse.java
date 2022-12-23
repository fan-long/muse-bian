package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestFundsAvailableCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck;

    public void setFundsAvailableCheck(org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck) {
        this.fundsAvailableCheck = fundsAvailableCheck;
    }

    public org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck getFundsAvailableCheck() {
        return fundsAvailableCheck;
    }
}