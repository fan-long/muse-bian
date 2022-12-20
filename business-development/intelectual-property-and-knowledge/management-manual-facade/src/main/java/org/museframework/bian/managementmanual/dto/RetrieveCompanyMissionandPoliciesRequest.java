package org.museframework.bian.managementmanual.dto;

public class RetrieveCompanyMissionandPoliciesRequest {
    private String managementmanualid;

    private String companymissionandpoliciesid;

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
}