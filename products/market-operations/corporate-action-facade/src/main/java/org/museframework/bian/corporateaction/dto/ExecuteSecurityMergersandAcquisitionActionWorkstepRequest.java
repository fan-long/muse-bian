package org.museframework.bian.corporateaction.dto;

public class ExecuteSecurityMergersandAcquisitionActionWorkstepRequest {
    private String corporateactionid;

    private String securitymergersandacquisitionactionworkstepid;

    private org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep securityMergersandAcquisitionActionWorkstep;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecuritymergersandacquisitionactionworkstepid(String securitymergersandacquisitionactionworkstepid) {
        this.securitymergersandacquisitionactionworkstepid = securitymergersandacquisitionactionworkstepid;
    }

    public String getSecuritymergersandacquisitionactionworkstepid() {
        return securitymergersandacquisitionactionworkstepid;
    }

    public void setSecurityMergersandAcquisitionActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep securityMergersandAcquisitionActionWorkstep) {
        this.securityMergersandAcquisitionActionWorkstep = securityMergersandAcquisitionActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep getSecurityMergersandAcquisitionActionWorkstep() {
        return securityMergersandAcquisitionActionWorkstep;
    }
}