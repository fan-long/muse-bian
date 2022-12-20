package org.museframework.bian.corporateaction.dto;

public class RetrieveSecurityDividendPaymentWorkstepRequest {
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