package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTaxOptimizationTopicResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic;

    public void setTaxOptimizationTopic(org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic) {
        this.taxOptimizationTopic = taxOptimizationTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic getTaxOptimizationTopic() {
        return taxOptimizationTopic;
    }
}