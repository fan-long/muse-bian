package org.museframework.bian.merchandisingloan.dto;

public class RetrieveWithdrawalsResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals;

    public void setWithdrawals(org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}