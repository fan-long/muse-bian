package org.museframework.bian.paymentinstruction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeComplianceCheckWorkstepRequest {
    @MetaField
    private String paymentinstructionid;

    @MetaField
    private String compliancecheckworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep complianceCheckWorkstep;

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

    public void setComplianceCheckWorkstep(org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep complianceCheckWorkstep) {
        this.complianceCheckWorkstep = complianceCheckWorkstep;
    }

    public org.museframework.bian.paymentinstruction.dto.bq.ComplianceCheckWorkstep getComplianceCheckWorkstep() {
        return complianceCheckWorkstep;
    }
}