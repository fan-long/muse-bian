package org.museframework.bian.bankguarantee.dto;

public class NotifyCustomerCollateralAllocationTaskRequest {
    private String bankguaranteeid;

    private String customercollateralallocationtaskid;

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
}