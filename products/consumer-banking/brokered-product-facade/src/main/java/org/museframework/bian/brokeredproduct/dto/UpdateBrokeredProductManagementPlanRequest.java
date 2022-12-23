package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBrokeredProductManagementPlanRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setBrokeredProductManagementPlan(org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan) {
        this.brokeredProductManagementPlan = brokeredProductManagementPlan;
    }

    public org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan getBrokeredProductManagementPlan() {
        return brokeredProductManagementPlan;
    }
}