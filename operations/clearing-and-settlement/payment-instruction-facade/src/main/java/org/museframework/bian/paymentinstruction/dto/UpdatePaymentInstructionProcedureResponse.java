package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePaymentInstructionProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure;

    public void setPaymentInstructionProcedure(org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure) {
        this.paymentInstructionProcedure = paymentInstructionProcedure;
    }

    public org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure getPaymentInstructionProcedure() {
        return paymentInstructionProcedure;
    }
}