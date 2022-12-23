package org.museframework.bian.transactionauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInteractiveTransactionAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment;

    public void setInteractiveTransactionAssessment(org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment) {
        this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    }

    public org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment getInteractiveTransactionAssessment() {
        return interactiveTransactionAssessment;
    }
}