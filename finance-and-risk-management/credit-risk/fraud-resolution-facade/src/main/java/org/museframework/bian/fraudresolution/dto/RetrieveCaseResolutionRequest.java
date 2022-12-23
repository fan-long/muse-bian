package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCaseResolutionRequest {
    @MetaField
    private String fraudresolutionid;

    @MetaField
    private String caseresolutionid;

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
}