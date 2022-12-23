package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCaseDeterminationRequest {
    @MetaField
    private String fraudresolutionid;

    @MetaField
    private String casedeterminationid;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setCasedeterminationid(String casedeterminationid) {
        this.casedeterminationid = casedeterminationid;
    }

    public String getCasedeterminationid() {
        return casedeterminationid;
    }
}