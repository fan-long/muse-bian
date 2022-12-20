package org.museframework.bian.intbanacc.dto;

public class ControlInternalBankAccountLogRequest {
    private String internalbankaccountid;

    private org.museframework.bian.intbanacc.dto.cr.InternalBankAccountLog internalBankAccountLog;

    public void setInternalbankaccountid(String internalbankaccountid) {
        this.internalbankaccountid = internalbankaccountid;
    }

    public String getInternalbankaccountid() {
        return internalbankaccountid;
    }

    public void setInternalBankAccountLog(org.museframework.bian.intbanacc.dto.cr.InternalBankAccountLog internalBankAccountLog) {
        this.internalBankAccountLog = internalBankAccountLog;
    }

    public org.museframework.bian.intbanacc.dto.cr.InternalBankAccountLog getInternalBankAccountLog() {
        return internalBankAccountLog;
    }
}