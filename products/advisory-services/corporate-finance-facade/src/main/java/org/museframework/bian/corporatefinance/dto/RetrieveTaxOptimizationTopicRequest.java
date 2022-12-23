package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTaxOptimizationTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String taxoptimizationtopicid;

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
}