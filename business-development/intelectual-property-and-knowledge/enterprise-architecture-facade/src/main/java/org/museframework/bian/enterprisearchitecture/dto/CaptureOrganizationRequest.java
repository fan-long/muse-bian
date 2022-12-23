package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureOrganizationRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField
    private String organizationid;

    @MetaField(ref=true)
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