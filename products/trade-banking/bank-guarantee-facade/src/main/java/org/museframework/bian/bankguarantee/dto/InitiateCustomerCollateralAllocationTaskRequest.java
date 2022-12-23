package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCustomerCollateralAllocationTaskRequest {
    @MetaField
    private String bankguaranteeid;

    @MetaField
    private String customercollateralallocationtaskid;

    @MetaField(ref=true)
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