package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCustomerContactOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession;

    public void setCustomerContactOperatingSession(org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession) {
        this.customerContactOperatingSession = customerContactOperatingSession;
    }

    public org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession getCustomerContactOperatingSession() {
        return customerContactOperatingSession;
    }
}