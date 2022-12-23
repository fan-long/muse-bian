package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCashDistributionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution;

    public void setCashDistribution(org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution) {
        this.cashDistribution = cashDistribution;
    }

    public org.museframework.bian.atmnetope.dto.bq.CashDistribution getCashDistribution() {
        return cashDistribution;
    }
}