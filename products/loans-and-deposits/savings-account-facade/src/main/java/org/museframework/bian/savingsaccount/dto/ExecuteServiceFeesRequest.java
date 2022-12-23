package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteServiceFeesRequest {
    @MetaField
    private String savingsaccountid;

    @MetaField
    private String servicefeesid;

    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.ServiceFees serviceFees;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.savingsaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.savingsaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}