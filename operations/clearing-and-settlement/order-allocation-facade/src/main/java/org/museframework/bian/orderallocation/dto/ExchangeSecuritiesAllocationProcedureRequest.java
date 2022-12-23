package org.museframework.bian.orderallocation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeSecuritiesAllocationProcedureRequest {
    @MetaField
    private String orderallocationid;

    @MetaField(ref=true)
    private org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure securitiesAllocationProcedure;

    public void setOrderallocationid(String orderallocationid) {
        this.orderallocationid = orderallocationid;
    }

    public String getOrderallocationid() {
        return orderallocationid;
    }

    public void setSecuritiesAllocationProcedure(org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure securitiesAllocationProcedure) {
        this.securitiesAllocationProcedure = securitiesAllocationProcedure;
    }

    public org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure getSecuritiesAllocationProcedure() {
        return securitiesAllocationProcedure;
    }
}