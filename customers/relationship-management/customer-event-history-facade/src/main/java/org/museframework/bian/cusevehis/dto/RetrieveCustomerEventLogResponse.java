package org.museframework.bian.cusevehis.dto;

public class RetrieveCustomerEventLogResponse {
    private org.museframework.bian.cusevehis.dto.cr.CustomerEventLog customerEventLog;

    public void setCustomerEventLog(org.museframework.bian.cusevehis.dto.cr.CustomerEventLog customerEventLog) {
        this.customerEventLog = customerEventLog;
    }

    public org.museframework.bian.cusevehis.dto.cr.CustomerEventLog getCustomerEventLog() {
        return customerEventLog;
    }
}