package org.museframework.bian.corporatetreasury.dto;

public class RetrieveTacticalFundingRequest {
    private String corporatetreasuryid;

    private String tacticalfundingid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setTacticalfundingid(String tacticalfundingid) {
        this.tacticalfundingid = tacticalfundingid;
    }

    public String getTacticalfundingid() {
        return tacticalfundingid;
    }
}