package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAgreementConfirmationWorkstepRequest {
    @MetaField
    private String paymentinstructionid;

    @MetaField
    private String agreementconfirmationworkstepid;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setAgreementconfirmationworkstepid(String agreementconfirmationworkstepid) {
        this.agreementconfirmationworkstepid = agreementconfirmationworkstepid;
    }

    public String getAgreementconfirmationworkstepid() {
        return agreementconfirmationworkstepid;
    }
}