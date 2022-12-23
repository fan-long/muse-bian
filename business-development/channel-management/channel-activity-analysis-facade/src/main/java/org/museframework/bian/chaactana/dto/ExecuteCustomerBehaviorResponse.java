package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCustomerBehaviorResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.CustomerBehavior customerBehavior;

    public void setCustomerBehavior(org.museframework.bian.chaactana.dto.bq.CustomerBehavior customerBehavior) {
        this.customerBehavior = customerBehavior;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerBehavior getCustomerBehavior() {
        return customerBehavior;
    }
}