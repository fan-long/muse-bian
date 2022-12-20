package org.museframework.bian.enterprisearchitecture.dto;

public class UpdateOrganizationResponse {
    private org.museframework.bian.enterprisearchitecture.dto.bq.Organization organization;

    public void setOrganization(org.museframework.bian.enterprisearchitecture.dto.bq.Organization organization) {
        this.organization = organization;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.Organization getOrganization() {
        return organization;
    }
}