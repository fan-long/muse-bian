package org.museframework.bian.orderallocation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSecuritiesAllocationProcedureRequest {
    @MetaField(ref=true)
    private org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure securitiesAllocationProcedure;

    public void setSecuritiesAllocationProcedure(org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure securitiesAllocationProcedure) {
        this.securitiesAllocationProcedure = securitiesAllocationProcedure;
    }

    public org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure getSecuritiesAllocationProcedure() {
        return securitiesAllocationProcedure;
    }
}