package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAnalysisRequest {
    @MetaField
    private String customertaxhandlingid;

    @MetaField
    private String analysisid;

    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.bq.Analysis analysis;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setAnalysisid(String analysisid) {
        this.analysisid = analysisid;
    }

    public String getAnalysisid() {
        return analysisid;
    }

    public void setAnalysis(org.museframework.bian.custaxhan.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.custaxhan.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}