package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCreditCardAuthorizationAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment creditCardAuthorizationAssessment;

    public void setCreditCardAuthorizationAssessment(org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment creditCardAuthorizationAssessment) {
        this.creditCardAuthorizationAssessment = creditCardAuthorizationAssessment;
    }

    public org.museframework.bian.cardauthorization.dto.cr.CreditCardAuthorizationAssessment getCreditCardAuthorizationAssessment() {
        return creditCardAuthorizationAssessment;
    }
}