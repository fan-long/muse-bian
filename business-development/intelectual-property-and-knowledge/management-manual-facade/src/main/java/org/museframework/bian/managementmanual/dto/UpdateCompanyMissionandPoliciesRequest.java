package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCompanyMissionandPoliciesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String companymissionandpoliciesid;

    @MetaField(ref=true)
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