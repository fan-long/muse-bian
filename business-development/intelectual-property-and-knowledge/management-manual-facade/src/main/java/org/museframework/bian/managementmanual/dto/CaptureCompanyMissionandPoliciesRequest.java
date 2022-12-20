package org.museframework.bian.managementmanual.dto;

public class CaptureCompanyMissionandPoliciesRequest {
    private String managementmanualid;

    private String companymissionandpoliciesid;

    private org.museframework.bian.managementmanual.dto.bq.CompanyMissionandPolicies companyMissionandPolicies;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setCompanymissionandpoliciesid(String companymissionandpoliciesid) {
        this.companymissionandpoliciesid = companymissionandpoliciesid;
    }

    public String getCompanymissionandpoliciesid() {
        return companymissionandpoliciesid;
    }

    public void setCompanyMissionandPolicies(org.museframework.bian.managementmanual.dto.bq.CompanyMissionandPolicies companyMissionandPolicies) {
        this.companyMissionandPolicies = companyMissionandPolicies;
    }

    public org.museframework.bian.managementmanual.dto.bq.CompanyMissionandPolicies getCompanyMissionandPolicies() {
        return companyMissionandPolicies;
    }
}