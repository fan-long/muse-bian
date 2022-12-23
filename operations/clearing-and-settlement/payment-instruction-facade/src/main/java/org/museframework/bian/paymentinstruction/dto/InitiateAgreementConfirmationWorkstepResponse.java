package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateAgreementConfirmationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep agreementConfirmationWorkstep;

    public void setAgreementConfirmationWorkstep(org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep agreementConfirmationWorkstep) {
        this.agreementConfirmationWorkstep = agreementConfirmationWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.AgreementConfirmationWorkstep getAgreementConfirmationWorkstep() {
        return agreementConfirmationWorkstep;
    }
}