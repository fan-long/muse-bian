package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveOrganizationRequest {
    private String enterprisearchitectureid;

    private String organizationid;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid;
    }

    public String getOrganizationid() {
        return organizationid;
    }
}