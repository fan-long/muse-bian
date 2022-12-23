package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeServiceFeesRequest {
    @MetaField
    private String virtualaccountid;

    @MetaField
    private String servicefeesid;

    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.virtualaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}