package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCreditPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan;

    public void setCreditPlan(org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan) {
        this.creditPlan = creditPlan;
    }

    public org.museframework.bian.creditcard.dto.bq.CreditPlan getCreditPlan() {
        return creditPlan;
    }
}