package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTaxOptimizationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization;

    public void setTaxOptimization(org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.conadvser.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}