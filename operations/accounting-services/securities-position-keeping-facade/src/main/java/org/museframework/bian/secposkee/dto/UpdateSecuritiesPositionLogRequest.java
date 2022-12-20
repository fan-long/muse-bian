package org.museframework.bian.secposkee.dto;

public class UpdateSecuritiesPositionLogRequest {
    private String securitiespositionkeepingid;

    private org.museframework.bian.secposkee.dto.cr.SecuritiesPositionLog securitiesPositionLog;

    public void setSecuritiespositionkeepingid(String securitiespositionkeepingid) {
        this.securitiespositionkeepingid = securitiespositionkeepingid;
    }

    public String getSecuritiespositionkeepingid() {
        return securitiespositionkeepingid;
    }

    public void setSecuritiesPositionLog(org.museframework.bian.secposkee.dto.cr.SecuritiesPositionLog securitiesPositionLog) {
        this.securitiesPositionLog = securitiesPositionLog;
    }

    public org.museframework.bian.secposkee.dto.cr.SecuritiesPositionLog getSecuritiesPositionLog() {
        return securitiesPositionLog;
    }
}