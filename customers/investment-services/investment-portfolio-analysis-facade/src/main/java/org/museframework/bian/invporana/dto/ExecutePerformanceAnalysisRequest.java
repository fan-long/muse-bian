package org.museframework.bian.invporana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePerformanceAnalysisRequest {
    @MetaField
    private String investmentportfolioanalysisid;

    @MetaField
    private String performanceanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.invporana.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setInvestmentportfolioanalysisid(String investmentportfolioanalysisid) {
        this.investmentportfolioanalysisid = investmentportfolioanalysisid;
    }

    public String getInvestmentportfolioanalysisid() {
        return investmentportfolioanalysisid;
    }

    public void setPerformanceanalysisid(String performanceanalysisid) {
        this.performanceanalysisid = performanceanalysisid;
    }

    public String getPerformanceanalysisid() {
        return performanceanalysisid;
    }

    public void setPerformanceAnalysis(org.museframework.bian.invporana.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.invporana.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}