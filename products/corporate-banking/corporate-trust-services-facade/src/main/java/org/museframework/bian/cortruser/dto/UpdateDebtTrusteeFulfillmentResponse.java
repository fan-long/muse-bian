package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateDebtTrusteeFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment debtTrusteeFulfillment;

    public void setDebtTrusteeFulfillment(org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment debtTrusteeFulfillment) {
        this.debtTrusteeFulfillment = debtTrusteeFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment getDebtTrusteeFulfillment() {
        return debtTrusteeFulfillment;
    }
}