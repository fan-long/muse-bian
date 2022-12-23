package org.museframework.bian.orderallocation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateApplyOrderAllocationRulesWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep applyOrderAllocationRulesWorkstep;

    public void setApplyOrderAllocationRulesWorkstep(org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep applyOrderAllocationRulesWorkstep) {
        this.applyOrderAllocationRulesWorkstep = applyOrderAllocationRulesWorkstep;
    }

    public org.museframework.bian.orderallocation.dto.bq.ApplyOrderAllocationRulesWorkstep getApplyOrderAllocationRulesWorkstep() {
        return applyOrderAllocationRulesWorkstep;
    }
}