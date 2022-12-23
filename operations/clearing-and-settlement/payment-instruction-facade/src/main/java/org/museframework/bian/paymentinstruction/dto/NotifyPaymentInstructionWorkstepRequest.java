package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyPaymentInstructionWorkstepRequest {
    @MetaField
    private String paymentinstructionid;

    @MetaField
    private String paymentinstructionworkstepid;

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
}