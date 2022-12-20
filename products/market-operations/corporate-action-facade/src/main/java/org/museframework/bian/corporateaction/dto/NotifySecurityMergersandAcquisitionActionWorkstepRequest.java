package org.museframework.bian.corporateaction.dto;

public class NotifySecurityMergersandAcquisitionActionWorkstepRequest {
    private String corporateactionid;

    private String securitymergersandacquisitionactionworkstepid;

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
}