package org.museframework.bian.termdeposit.dto;

public class ExecuteDepositsandWithdrawalsRequest {
    private String termdepositid;

    private String depositsandwithdrawalsid;

    private org.museframework.bian.termdeposit.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setDepositsandwithdrawalsid(String depositsandwithdrawalsid) {
        this.depositsandwithdrawalsid = depositsandwithdrawalsid;
    }

    public String getDepositsandwithdrawalsid() {
        return depositsandwithdrawalsid;
    }

    public void setDepositsandWithdrawals(org.museframework.bian.termdeposit.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.termdeposit.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}