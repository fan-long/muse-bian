package org.museframework.bian.creditmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCreditPricingAssessmentRequest {
    @MetaField
    private String creditmanagementid;

    public void setCreditmanagementid(String creditmanagementid) {
        this.creditmanagementid = creditmanagementid;
    }

    public String getCreditmanagementid() {
        return creditmanagementid;
    }
}