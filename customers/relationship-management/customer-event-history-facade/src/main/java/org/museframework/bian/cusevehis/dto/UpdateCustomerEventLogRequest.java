package org.museframework.bian.cusevehis.dto;

public class UpdateCustomerEventLogRequest {
    private String customereventhistoryid;

    private org.museframework.bian.cusevehis.dto.cr.CustomerEventLog customerEventLog;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setCustomerEventLog(org.museframework.bian.cusevehis.dto.cr.CustomerEventLog customerEventLog) {
        this.customerEventLog = customerEventLog;
    }

    public org.museframework.bian.cusevehis.dto.cr.CustomerEventLog getCustomerEventLog() {
        return customerEventLog;
    }
}