package org.museframework.bian.enterprisearchitecture.dto;

public class UpdateOrganizationRequest {
    private String enterprisearchitectureid;

    private String organizationid;

    private org.museframework.bian.enterprisearchitecture.dto.bq.Organization organization;

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

    public void setOrganization(org.museframework.bian.enterprisearchitecture.dto.bq.Organization organization) {
        this.organization = organization;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.Organization getOrganization() {
        return organization;
    }
}