package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCustomerWorkbenchOperatingSessionRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setCustomerWorkbenchOperatingSession(org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
        this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    }

    public org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
        return customerWorkbenchOperatingSession;
    }
}