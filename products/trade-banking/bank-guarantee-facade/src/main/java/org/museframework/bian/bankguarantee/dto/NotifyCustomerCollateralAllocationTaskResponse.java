package org.museframework.bian.bankguarantee.dto;

public class NotifyCustomerCollateralAllocationTaskResponse {
    private org.museframework.bian.bankguarantee.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask;

    public void setCustomerCollateralAllocationTask(org.museframework.bian.bankguarantee.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask) {
        this.customerCollateralAllocationTask = customerCollateralAllocationTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.CustomerCollateralAllocationTask getCustomerCollateralAllocationTask() {
        return customerCollateralAllocationTask;
    }
}