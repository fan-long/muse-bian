package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCompanyMissionandPoliciesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.CompanyMissionandPolicies companyMissionandPolicies;

    public void setCompanyMissionandPolicies(org.museframework.bian.managementmanual.dto.bq.CompanyMissionandPolicies companyMissionandPolicies) {
        this.companyMissionandPolicies = companyMissionandPolicies;
    }

    public org.museframework.bian.managementmanual.dto.bq.CompanyMissionandPolicies getCompanyMissionandPolicies() {
        return companyMissionandPolicies;
    }
}