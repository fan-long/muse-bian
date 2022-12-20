/*An service arrangement which specifies the acceptance of withdrawals, accompanied by the modalities to withdraw money. 
*/
package org.museframework.bian.classes;

public class WithdrawalServiceArrangement {
    /*The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement)*/
    private String withdrawalType;

    /**/
    private String withdrawalLimit;

    /**/
    private String withdrawalLimitType;

    /*Handling options in case a withdrawal results in exceeding the agreed limit*/
    private String withdrawalLimitHandling;

    public void setWithdrawalType(String withdrawalType) {
        this.withdrawalType = withdrawalType;
    }

    public String getWithdrawalType() {
        return withdrawalType;
    }

    public void setWithdrawalLimit(String withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public String getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimitType(String withdrawalLimitType) {
        this.withdrawalLimitType = withdrawalLimitType;
    }

    public String getWithdrawalLimitType() {
        return withdrawalLimitType;
    }

    public void setWithdrawalLimitHandling(String withdrawalLimitHandling) {
        this.withdrawalLimitHandling = withdrawalLimitHandling;
    }

    public String getWithdrawalLimitHandling() {
        return withdrawalLimitHandling;
    }
}