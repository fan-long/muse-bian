package org.museframework.bian.creditmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCreditPricingAssessmentRequest {
    @MetaField
    private String creditmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.creditmanagement.dto.cr.CreditPricingAssessment creditPricingAssessment;

    public void setCreditmanagementid(String creditmanagementid) {
        this.creditmanagementid = creditmanagementid;
    }

    public String getCreditmanagementid() {
        return creditmanagementid;
    }

    public void setCreditPricingAssessment(org.museframework.bian.creditmanagement.dto.cr.CreditPricingAssessment creditPricingAssessment) {
        this.creditPricingAssessment = creditPricingAssessment;
    }

    public org.museframework.bian.creditmanagement.dto.cr.CreditPricingAssessment getCreditPricingAssessment() {
        return creditPricingAssessment;
    }
}