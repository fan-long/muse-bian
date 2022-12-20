package org.museframework.bian.corporateaction.dto;

public class RequestSecurityDividendPaymentWorkstepRequest {
    private String corporateactionid;

    private String securitydividendpaymentworkstepid;

    private org.museframework.bian.corporateaction.dto.bq.SecurityDividendPaymentWorkstep securityDividendPaymentWorkstep;

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

    public void setSecurityDividendPaymentWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityDividendPaymentWorkstep securityDividendPaymentWorkstep) {
        this.securityDividendPaymentWorkstep = securityDividendPaymentWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityDividendPaymentWorkstep getSecurityDividendPaymentWorkstep() {
        return securityDividendPaymentWorkstep;
    }
}