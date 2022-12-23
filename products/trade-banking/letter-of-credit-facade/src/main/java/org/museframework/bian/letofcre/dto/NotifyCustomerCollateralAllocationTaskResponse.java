package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyCustomerCollateralAllocationTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask;

    public void setCustomerCollateralAllocationTask(org.museframework.bian.letofcre.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask) {
        this.customerCollateralAllocationTask = customerCollateralAllocationTask;
    }

    public org.museframework.bian.letofcre.dto.bq.CustomerCollateralAllocationTask getCustomerCollateralAllocationTask() {
        return customerCollateralAllocationTask;
    }
}