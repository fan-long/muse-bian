package org.museframework.bian.corporatetreasury.dto;

public class UpdateSecuritizationRequest {
    private String corporatetreasuryid;

    private String securitizationid;

    private org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization;

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

    public void setSecuritization(org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}