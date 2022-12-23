package org.museframework.bian.customerportfolio.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePerformanceAnalysisRequest {
    @MetaField
    private String customerportfolioid;

    @MetaField
    private String performanceanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setCustomerportfolioid(String customerportfolioid) {
        this.customerportfolioid = customerportfolioid;
    }

    public String getCustomerportfolioid() {
        return customerportfolioid;
    }

    public void setPerformanceanalysisid(String performanceanalysisid) {
        this.performanceanalysisid = performanceanalysisid;
    }

    public String getPerformanceanalysisid() {
        return performanceanalysisid;
    }

    public void setPerformanceAnalysis(org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}