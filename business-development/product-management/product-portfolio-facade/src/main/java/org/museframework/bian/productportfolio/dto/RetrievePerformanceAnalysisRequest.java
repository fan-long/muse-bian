package org.museframework.bian.productportfolio.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePerformanceAnalysisRequest {
    @MetaField
    private String productportfolioid;

    @MetaField
    private String performanceanalysisid;

    public void setProductportfolioid(String productportfolioid) {
        this.productportfolioid = productportfolioid;
    }

    public String getProductportfolioid() {
        return productportfolioid;
    }

    public void setPerformanceanalysisid(String performanceanalysisid) {
        this.performanceanalysisid = performanceanalysisid;
    }

    public String getPerformanceanalysisid() {
        return performanceanalysisid;
    }
}