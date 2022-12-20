package org.museframework.bian.corporateaction.dto;

public class RetrieveSecuritySpin_OffActionWorkstepRequest {
    private String corporateactionid;

    private String securityspin_offactionworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecurityspin_offactionworkstepid(String securityspin_offactionworkstepid) {
        this.securityspin_offactionworkstepid = securityspin_offactionworkstepid;
    }

    public String getSecurityspin_offactionworkstepid() {
        return securityspin_offactionworkstepid;
    }
}