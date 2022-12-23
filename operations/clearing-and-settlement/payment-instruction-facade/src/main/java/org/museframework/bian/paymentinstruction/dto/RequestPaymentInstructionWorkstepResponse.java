package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestPaymentInstructionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep;

    public void setPaymentInstructionWorkstep(org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep) {
        this.paymentInstructionWorkstep = paymentInstructionWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep getPaymentInstructionWorkstep() {
        return paymentInstructionWorkstep;
    }
}