package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTaxOptimizationTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String taxoptimizationtopicid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setTaxoptimizationtopicid(String taxoptimizationtopicid) {
        this.taxoptimizationtopicid = taxoptimizationtopicid;
    }

    public String getTaxoptimizationtopicid() {
        return taxoptimizationtopicid;
    }

    public void setTaxOptimizationTopic(org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic) {
        this.taxOptimizationTopic = taxOptimizationTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic getTaxOptimizationTopic() {
        return taxOptimizationTopic;
    }
}