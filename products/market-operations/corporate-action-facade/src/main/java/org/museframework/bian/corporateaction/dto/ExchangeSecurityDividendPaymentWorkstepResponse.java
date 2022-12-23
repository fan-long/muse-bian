package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeSecurityDividendPaymentWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.SecurityDividendPaymentWorkstep securityDividendPaymentWorkstep;

    public void setSecurityDividendPaymentWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityDividendPaymentWorkstep securityDividendPaymentWorkstep) {
        this.securityDividendPaymentWorkstep = securityDividendPaymentWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityDividendPaymentWorkstep getSecurityDividendPaymentWorkstep() {
        return securityDividendPaymentWorkstep;
    }
}