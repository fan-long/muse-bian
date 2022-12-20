package org.museframework.bian.mutfunadm.dto;

public class RetrieveFundEnrolmentRoutineResponse {
    private org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine;

    public void setFundEnrolmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine) {
        this.fundEnrolmentRoutine = fundEnrolmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine getFundEnrolmentRoutine() {
        return fundEnrolmentRoutine;
    }
}