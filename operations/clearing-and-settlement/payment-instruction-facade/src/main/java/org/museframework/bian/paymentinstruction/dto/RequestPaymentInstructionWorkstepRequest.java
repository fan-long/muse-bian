package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestPaymentInstructionWorkstepRequest {
    @MetaField
    private String paymentinstructionid;

    @MetaField
    private String paymentinstructionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setPaymentinstructionworkstepid(String paymentinstructionworkstepid) {
        this.paymentinstructionworkstepid = paymentinstructionworkstepid;
    }

    public String getPaymentinstructionworkstepid() {
        return paymentinstructionworkstepid;
    }

    public void setPaymentInstructionWorkstep(org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep paymentInstructionWorkstep) {
        this.paymentInstructionWorkstep = paymentInstructionWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.PaymentInstructionWorkstep getPaymentInstructionWorkstep() {
        return paymentInstructionWorkstep;
    }
}