package org.museframework.bian.corporatetreasury.dto;

public class RetrieveSecuritizationRequest {
    private String corporatetreasuryid;

    private String securitizationid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setSecuritizationid(String securitizationid) {
        this.securitizationid = securitizationid;
    }

    public String getSecuritizationid() {
        return securitizationid;
    }
}