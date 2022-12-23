package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFinancialPlanningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning;

    public void setFinancialPlanning(org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning) {
        this.financialPlanning = financialPlanning;
    }

    public org.museframework.bian.conadvser.dto.bq.FinancialPlanning getFinancialPlanning() {
        return financialPlanning;
    }
}