package org.museframework.bian.orderallocation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteApplyOrderAllocationRulesWorkstepRequest {
    @MetaField
    private String orderallocationid;

    @MetaField
    private String applyorderallocationrulesworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep applyOrderAllocationRulesWorkstep;

    public void setOrderallocationid(String orderallocationid) {
        this.orderallocationid = orderallocationid;
    }

    public String getOrderallocationid() {
        return orderallocationid;
    }

    public void setApplyorderallocationrulesworkstepid(String applyorderallocationrulesworkstepid) {
        this.applyorderallocationrulesworkstepid = applyorderallocationrulesworkstepid;
    }

    public String getApplyorderallocationrulesworkstepid() {
        return applyorderallocationrulesworkstepid;
    }

    public void setApplyOrderAllocationRulesWorkstep(org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep applyOrderAllocationRulesWorkstep) {
        this.applyOrderAllocationRulesWorkstep = applyOrderAllocationRulesWorkstep;
    }

    public org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep getApplyOrderAllocationRulesWorkstep() {
        return applyOrderAllocationRulesWorkstep;
    }
}