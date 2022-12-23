package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTaxOptimizationRequest {
    @MetaField
    private String consumeradvisoryservicesid;

    @MetaField
    private String taxoptimizationid;

    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setTaxoptimizationid(String taxoptimizationid) {
        this.taxoptimizationid = taxoptimizationid;
    }

    public String getTaxoptimizationid() {
        return taxoptimizationid;
    }

    public void setTaxOptimization(org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.conadvser.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}