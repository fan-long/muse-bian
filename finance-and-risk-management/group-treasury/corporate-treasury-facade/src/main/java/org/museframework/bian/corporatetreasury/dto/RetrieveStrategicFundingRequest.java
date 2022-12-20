package org.museframework.bian.corporatetreasury.dto;

public class RetrieveStrategicFundingRequest {
    private String corporatetreasuryid;

    private String strategicfundingid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setStrategicfundingid(String strategicfundingid) {
        this.strategicfundingid = strategicfundingid;
    }

    public String getStrategicfundingid() {
        return strategicfundingid;
    }
}