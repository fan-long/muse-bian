package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateContextCriteriaRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String contextcriteriaid;

    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setContextcriteriaid(String contextcriteriaid) {
        this.contextcriteriaid = contextcriteriaid;
    }

    public String getContextcriteriaid() {
        return contextcriteriaid;
    }

    public void setContextCriteria(org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria) {
        this.contextCriteria = contextCriteria;
    }

    public org.museframework.bian.productmatching.dto.bq.ContextCriteria getContextCriteria() {
        return contextCriteria;
    }
}