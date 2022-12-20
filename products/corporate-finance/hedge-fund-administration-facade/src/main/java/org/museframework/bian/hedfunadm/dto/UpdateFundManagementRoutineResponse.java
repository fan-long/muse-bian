package org.museframework.bian.hedfunadm.dto;

public class UpdateFundManagementRoutineResponse {
    private org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine fundManagementRoutine;

    public void setFundManagementRoutine(org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine fundManagementRoutine) {
        this.fundManagementRoutine = fundManagementRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine getFundManagementRoutine() {
        return fundManagementRoutine;
    }
}