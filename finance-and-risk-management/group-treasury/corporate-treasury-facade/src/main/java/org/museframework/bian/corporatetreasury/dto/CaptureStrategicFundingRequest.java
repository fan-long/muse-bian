package org.museframework.bian.corporatetreasury.dto;

public class CaptureStrategicFundingRequest {
    private String corporatetreasuryid;

    private String strategicfundingid;

    private org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding strategicFunding;

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

    public void setStrategicFunding(org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding strategicFunding) {
        this.strategicFunding = strategicFunding;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding getStrategicFunding() {
        return strategicFunding;
    }
}