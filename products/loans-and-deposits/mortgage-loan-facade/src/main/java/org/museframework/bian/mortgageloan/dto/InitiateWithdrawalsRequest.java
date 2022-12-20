package org.museframework.bian.mortgageloan.dto;

public class InitiateWithdrawalsRequest {
    private String mortgageloanid;

    private String withdrawalsid;

    private org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setWithdrawalsid(String withdrawalsid) {
        this.withdrawalsid = withdrawalsid;
    }

    public String getWithdrawalsid() {
        return withdrawalsid;
    }

    public void setWithdrawals(org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}