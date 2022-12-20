package org.museframework.bian.bankguarantee.dto;

public class UpdateCustomerCollateralAllocationTaskRequest {
    private String bankguaranteeid;

    private String customercollateralallocationtaskid;

    private org.museframework.bian.bankguarantee.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setCustomercollateralallocationtaskid(String customercollateralallocationtaskid) {
        this.customercollateralallocationtaskid = customercollateralallocationtaskid;
    }

    public String getCustomercollateralallocationtaskid() {
        return customercollateralallocationtaskid;
    }

    public void setCustomerCollateralAllocationTask(org.museframework.bian.bankguarantee.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask) {
        this.customerCollateralAllocationTask = customerCollateralAllocationTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.CustomerCollateralAllocationTask getCustomerCollateralAllocationTask() {
        return customerCollateralAllocationTask;
    }
}