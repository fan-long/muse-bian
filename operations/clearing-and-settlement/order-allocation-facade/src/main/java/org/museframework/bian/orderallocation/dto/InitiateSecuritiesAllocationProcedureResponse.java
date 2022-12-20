package org.museframework.bian.orderallocation.dto;

public class InitiateSecuritiesAllocationProcedureResponse {
    private org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure securitiesAllocationProcedure;

    public void setSecuritiesAllocationProcedure(org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure securitiesAllocationProcedure) {
        this.securitiesAllocationProcedure = securitiesAllocationProcedure;
    }

    public org.museframework.bian.orderallocation.dto.cr.SecuritiesAllocationProcedure getSecuritiesAllocationProcedure() {
        return securitiesAllocationProcedure;
    }
}