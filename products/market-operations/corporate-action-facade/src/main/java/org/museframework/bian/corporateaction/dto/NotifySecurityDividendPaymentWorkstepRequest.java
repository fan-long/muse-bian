package org.museframework.bian.corporateaction.dto;

public class NotifySecurityDividendPaymentWorkstepRequest {
    private String corporateactionid;

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