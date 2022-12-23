package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifySecurityDividendPaymentWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String securitydividendpaymentworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecuritydividendpaymentworkstepid(String securitydividendpaymentworkstepid) {
        this.securitydividendpaymentworkstepid = securitydividendpaymentworkstepid;
    }

    public String getSecuritydividendpaymentworkstepid() {
        return securitydividendpaymentworkstepid;
    }
}