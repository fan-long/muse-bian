package org.museframework.bian.orderallocation.dto;

public class ControlSecuritiesAllocationProcedureRequest {
    private String orderallocationid;

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