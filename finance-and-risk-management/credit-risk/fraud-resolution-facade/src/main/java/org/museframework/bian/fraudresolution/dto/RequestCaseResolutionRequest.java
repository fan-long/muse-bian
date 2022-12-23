package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCaseResolutionRequest {
    @MetaField
    private String fraudresolutionid;

    @MetaField
    private String caseresolutionid;

    @MetaField(ref=true)
    private org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setCaseresolutionid(String caseresolutionid) {
        this.caseresolutionid = caseresolutionid;
    }

    public String getCaseresolutionid() {
        return caseresolutionid;
    }

    public void setCaseResolution(org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution) {
        this.caseResolution = caseResolution;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseResolution getCaseResolution() {
        return caseResolution;
    }
}