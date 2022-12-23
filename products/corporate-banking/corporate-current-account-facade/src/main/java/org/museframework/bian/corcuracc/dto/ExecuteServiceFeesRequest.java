package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteServiceFeesRequest {
    @MetaField
    private String corporatecurrentaccountid;

    @MetaField
    private String servicefeesid;

    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.ServiceFees serviceFees;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.corcuracc.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.corcuracc.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}