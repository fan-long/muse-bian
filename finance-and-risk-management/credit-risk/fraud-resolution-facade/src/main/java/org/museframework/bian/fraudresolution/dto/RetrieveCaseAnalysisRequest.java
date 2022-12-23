package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCaseAnalysisRequest {
    @MetaField
    private String fraudresolutionid;

    @MetaField
    private String caseanalysisid;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setCaseanalysisid(String caseanalysisid) {
        this.caseanalysisid = caseanalysisid;
    }

    public String getCaseanalysisid() {
        return caseanalysisid;
    }
}