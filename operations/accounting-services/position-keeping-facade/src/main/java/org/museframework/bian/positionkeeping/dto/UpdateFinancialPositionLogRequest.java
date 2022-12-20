package org.museframework.bian.positionkeeping.dto;

public class UpdateFinancialPositionLogRequest {
    private String positionkeepingid;

    private org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog;

    public void setPositionkeepingid(String positionkeepingid) {
        this.positionkeepingid = positionkeepingid;
    }

    public String getPositionkeepingid() {
        return positionkeepingid;
    }

    public void setFinancialPositionLog(org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog) {
        this.financialPositionLog = financialPositionLog;
    }

    public org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog getFinancialPositionLog() {
        return financialPositionLog;
    }
}