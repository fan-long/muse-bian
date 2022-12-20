package org.museframework.bian.corporatetreasury.dto;

public class RetrieveStrategicFundingResponse {
    private org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding strategicFunding;

    public void setStrategicFunding(org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding strategicFunding) {
        this.strategicFunding = strategicFunding;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding getStrategicFunding() {
        return strategicFunding;
    }
}