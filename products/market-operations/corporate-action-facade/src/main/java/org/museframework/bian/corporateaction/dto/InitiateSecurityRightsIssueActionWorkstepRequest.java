package org.museframework.bian.corporateaction.dto;

public class InitiateSecurityRightsIssueActionWorkstepRequest {
    private String corporateactionid;

    private String securityrightsissueactionworkstepid;

    private org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep securityRightsIssueActionWorkstep;

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

    public void setSecurityRightsIssueActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep securityRightsIssueActionWorkstep) {
        this.securityRightsIssueActionWorkstep = securityRightsIssueActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityRightsIssueActionWorkstep getSecurityRightsIssueActionWorkstep() {
        return securityRightsIssueActionWorkstep;
    }
}