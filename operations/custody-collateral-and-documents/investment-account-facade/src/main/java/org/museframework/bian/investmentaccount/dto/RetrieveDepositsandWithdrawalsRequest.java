package org.museframework.bian.investmentaccount.dto;

public class RetrieveDepositsandWithdrawalsRequest {
    private String investmentaccountid;

    private String depositsandwithdrawalsid;

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
}