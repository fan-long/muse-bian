package org.museframework.bian.investmentaccount.dto;

public class UpdateDepositsandWithdrawalsRequest {
    private String investmentaccountid;

    private String depositsandwithdrawalsid;

    private org.museframework.bian.investmentaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setDepositsandwithdrawalsid(String depositsandwithdrawalsid) {
        this.depositsandwithdrawalsid = depositsandwithdrawalsid;
    }

    public String getDepositsandwithdrawalsid() {
        return depositsandwithdrawalsid;
    }

    public void setDepositsandWithdrawals(org.museframework.bian.investmentaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.investmentaccount.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}