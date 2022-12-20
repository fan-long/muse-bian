package org.museframework.bian.secposkee.dto;

public class UpdateSecuritiesTransactionCaptureRequest {
    private String securitiespositionkeepingid;

    private String securitiestransactioncaptureid;

    private org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture securitiesTransactionCapture;

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

    public void setSecuritiesTransactionCapture(org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture securitiesTransactionCapture) {
        this.securitiesTransactionCapture = securitiesTransactionCapture;
    }

    public org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture getSecuritiesTransactionCapture() {
        return securitiesTransactionCapture;
    }
}