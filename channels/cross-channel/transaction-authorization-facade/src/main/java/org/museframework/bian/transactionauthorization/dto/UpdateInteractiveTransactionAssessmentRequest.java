package org.museframework.bian.transactionauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInteractiveTransactionAssessmentRequest {
    @MetaField
    private String transactionauthorizationid;

    @MetaField(ref=true)
    private org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment;

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }

    public void setInteractiveTransactionAssessment(org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment) {
        this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    }

    public org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment getInteractiveTransactionAssessment() {
        return interactiveTransactionAssessment;
    }
}