package org.museframework.bian.secposkee.dto;

public class RetrieveSecuritiesTransactionCaptureRequest {
    private String securitiespositionkeepingid;

    private String securitiestransactioncaptureid;

    public void setSecuritiespositionkeepingid(String securitiespositionkeepingid) {
        this.securitiespositionkeepingid = securitiespositionkeepingid;
    }

    public String getSecuritiespositionkeepingid() {
        return securitiespositionkeepingid;
    }

    public void setSecuritiestransactioncaptureid(String securitiestransactioncaptureid) {
        this.securitiestransactioncaptureid = securitiestransactioncaptureid;
    }

    public String getSecuritiestransactioncaptureid() {
        return securitiestransactioncaptureid;
    }
}