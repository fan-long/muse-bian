package org.museframework.bian.cuscasman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateCustomerCaseManagementPlanRequest {
    @MetaField(ref=true)
    private org.museframework.bian.cuscasman.dto.cr.CustomerCaseManagementPlan customerCaseManagementPlan;

    public void setCustomerCaseManagementPlan(org.museframework.bian.cuscasman.dto.cr.CustomerCaseManagementPlan customerCaseManagementPlan) {
        this.customerCaseManagementPlan = customerCaseManagementPlan;
    }

    public org.museframework.bian.cuscasman.dto.cr.CustomerCaseManagementPlan getCustomerCaseManagementPlan() {
        return customerCaseManagementPlan;
    }
}