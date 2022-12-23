package org.museframework.bian.suitabilitychecking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSuitabilityAssessmentRequest {
    @MetaField
    private String suitabilitycheckingid;

    public void setSuitabilitycheckingid(String suitabilitycheckingid) {
        this.suitabilitycheckingid = suitabilitycheckingid;
    }

    public String getSuitabilitycheckingid() {
        return suitabilitycheckingid;
    }
}