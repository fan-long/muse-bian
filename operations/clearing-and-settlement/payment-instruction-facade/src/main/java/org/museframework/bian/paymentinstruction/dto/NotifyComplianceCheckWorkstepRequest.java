package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyComplianceCheckWorkstepRequest {
    @MetaField
    private String paymentinstructionid;

    @MetaField
    private String compliancecheckworkstepid;

    public void setPaymentinstructionid(String paymentinstructionid) {
        this.paymentinstructionid = paymentinstructionid;
    }

    public String getPaymentinstructionid() {
        return paymentinstructionid;
    }

    public void setCompliancecheckworkstepid(String compliancecheckworkstepid) {
        this.compliancecheckworkstepid = compliancecheckworkstepid;
    }

    public String getCompliancecheckworkstepid() {
        return compliancecheckworkstepid;
    }
}