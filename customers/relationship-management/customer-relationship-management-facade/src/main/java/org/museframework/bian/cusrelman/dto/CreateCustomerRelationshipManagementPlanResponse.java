package org.museframework.bian.cusrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateCustomerRelationshipManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusrelman.dto.cr.CustomerRelationshipManagementPlan customerRelationshipManagementPlan;

    public void setCustomerRelationshipManagementPlan(org.museframework.bian.cusrelman.dto.cr.CustomerRelationshipManagementPlan customerRelationshipManagementPlan) {
        this.customerRelationshipManagementPlan = customerRelationshipManagementPlan;
    }

    public org.museframework.bian.cusrelman.dto.cr.CustomerRelationshipManagementPlan getCustomerRelationshipManagementPlan() {
        return customerRelationshipManagementPlan;
    }
}