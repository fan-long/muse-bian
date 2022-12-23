package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentInstructionProcedureRequest {
    @MetaField
    private String paymentinstructionid;

    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setPaymentInstructionProcedure(org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure paymentInstructionProcedure) {
        this.paymentInstructionProcedure = paymentInstructionProcedure;
    }

    public org.museframework.bian.paymentinstruction.dto.cr.PaymentInstructionProcedure getPaymentInstructionProcedure() {
        return paymentInstructionProcedure;
    }
}