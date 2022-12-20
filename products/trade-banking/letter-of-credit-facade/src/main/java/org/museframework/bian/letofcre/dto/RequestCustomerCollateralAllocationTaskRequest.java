package org.museframework.bian.letofcre.dto;

public class RequestCustomerCollateralAllocationTaskRequest {
    private String letterofcreditid;

    private String customercollateralallocationtaskid;

    private org.museframework.bian.letofcre.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setCustomercollateralallocationtaskid(String customercollateralallocationtaskid) {
        this.customercollateralallocationtaskid = customercollateralallocationtaskid;
    }

    public String getCustomercollateralallocationtaskid() {
        return customercollateralallocationtaskid;
    }

    public void setCustomerCollateralAllocationTask(org.museframework.bian.letofcre.dto.bq.CustomerCollateralAllocationTask customerCollateralAllocationTask) {
        this.customerCollateralAllocationTask = customerCollateralAllocationTask;
    }

    public org.museframework.bian.letofcre.dto.bq.CustomerCollateralAllocationTask getCustomerCollateralAllocationTask() {
        return customerCollateralAllocationTask;
    }
}