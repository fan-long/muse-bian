package org.museframework.bian.corporateaction.dto;

public class RetrieveSecurityRightsIssueActionWorkstepRequest {
    private String corporateactionid;

    private String securityrightsissueactionworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecurityrightsissueactionworkstepid(String securityrightsissueactionworkstepid) {
        this.securityrightsissueactionworkstepid = securityrightsissueactionworkstepid;
    }

    public String getSecurityrightsissueactionworkstepid() {
        return securityrightsissueactionworkstepid;
    }
}