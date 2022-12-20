package org.museframework.bian.directdebit.dto;

public class ExecuteFundsAvailableCheckResponse {
    private org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck;

    public void setFundsAvailableCheck(org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck) {
        this.fundsAvailableCheck = fundsAvailableCheck;
    }

    public org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck getFundsAvailableCheck() {
        return fundsAvailableCheck;
    }
}