package org.museframework.bian.orderallocation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveApplyOrderAllocationRulesWorkstepRequest {
    @MetaField
    private String orderallocationid;

    @MetaField
    private String applyorderallocationrulesworkstepid;

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
}