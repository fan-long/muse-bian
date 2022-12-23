package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCustomerEventLogRequest {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.cr.CustomerEventLog customerEventLog;

    public void setCustomerEventLog(org.museframework.bian.cusevehis.dto.cr.CustomerEventLog customerEventLog) {
        this.customerEventLog = customerEventLog;
    }

    public org.museframework.bian.cusevehis.dto.cr.CustomerEventLog getCustomerEventLog() {
        return customerEventLog;
    }
}