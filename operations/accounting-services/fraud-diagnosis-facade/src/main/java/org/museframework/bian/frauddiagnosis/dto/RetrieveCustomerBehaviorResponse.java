package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerBehaviorResponse {
    @MetaField(ref=true)
    private org.museframework.bian.frauddiagnosis.dto.bq.CustomerBehavior customerBehavior;

    public void setCustomerBehavior(org.museframework.bian.frauddiagnosis.dto.bq.CustomerBehavior customerBehavior) {
        this.customerBehavior = customerBehavior;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.CustomerBehavior getCustomerBehavior() {
        return customerBehavior;
    }
}