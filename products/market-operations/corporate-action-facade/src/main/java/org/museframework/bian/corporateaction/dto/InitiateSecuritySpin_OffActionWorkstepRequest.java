package org.museframework.bian.corporateaction.dto;

public class InitiateSecuritySpin_OffActionWorkstepRequest {
    private String corporateactionid;

    private String securityspin_offactionworkstepid;

    private org.museframework.bian.corporateaction.dto.bq.SecuritySpin_OffActionWorkstep securitySpin_OffActionWorkstep;

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

    public void setSecuritySpin_OffActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecuritySpin_OffActionWorkstep securitySpin_OffActionWorkstep) {
        this.securitySpin_OffActionWorkstep = securitySpin_OffActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecuritySpin_OffActionWorkstep getSecuritySpin_OffActionWorkstep() {
        return securitySpin_OffActionWorkstep;
    }
}