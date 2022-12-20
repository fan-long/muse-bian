package org.museframework.bian.corporatetreasury.dto;

public class RetrieveTacticalFundingResponse {
    private org.museframework.bian.corporatetreasury.dto.bq.TacticalFunding tacticalFunding;

    public void setTacticalFunding(org.museframework.bian.corporatetreasury.dto.bq.TacticalFunding tacticalFunding) {
        this.tacticalFunding = tacticalFunding;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.TacticalFunding getTacticalFunding() {
        return tacticalFunding;
    }
}