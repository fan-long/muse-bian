package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveContextCriteriaRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String contextcriteriaid;

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
}