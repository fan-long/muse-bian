package org.museframework.bian.cusbehmod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateCustomerBehaviorModelSpecificationRequest {
    @MetaField(ref=true)
    private org.museframework.bian.cusbehmod.dto.cr.CustomerBehaviorModelSpecification customerBehaviorModelSpecification;

    public void setCustomerBehaviorModelSpecification(org.museframework.bian.cusbehmod.dto.cr.CustomerBehaviorModelSpecification customerBehaviorModelSpecification) {
        this.customerBehaviorModelSpecification = customerBehaviorModelSpecification;
    }

    public org.museframework.bian.cusbehmod.dto.cr.CustomerBehaviorModelSpecification getCustomerBehaviorModelSpecification() {
        return customerBehaviorModelSpecification;
    }
}