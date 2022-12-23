package org.museframework.bian.investmentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateServiceFeesRequest {
    @MetaField
    private String investmentaccountid;

    @MetaField
    private String servicefeesid;

    @MetaField(ref=true)
    private org.museframework.bian.investmentaccount.dto.bq.ServiceFees serviceFees;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.investmentaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.investmentaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}