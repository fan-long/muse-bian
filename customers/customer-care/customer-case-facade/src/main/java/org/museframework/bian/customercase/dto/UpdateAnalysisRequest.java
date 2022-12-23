package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAnalysisRequest {
    @MetaField
    private String customercaseid;

    @MetaField
    private String analysisid;

    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.bq.Analysis analysis;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setAnalysisid(String analysisid) {
        this.analysisid = analysisid;
    }

    public String getAnalysisid() {
        return analysisid;
    }

    public void setAnalysis(org.museframework.bian.customercase.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.customercase.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}