/**/
package org.museframework.bian.corcuracc.dto.bq;

public class DepositsandWithdrawals {
    /*The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit)*/
    private String depositType;

    /*The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement)*/
    private String withdrawalType;

    /*The handling options if a withdrawal results in a breach of an account limit*/
    private String accountLimitBreachResponse;

    /*Details of the deposit transaction*/
    private String depositTransaction;

    /*Identifies the source of the deposit*/
    private org.museframework.bian.classes.Object depositTransactionSourceReference;

    /*The type of deposit made with the transaction*/
    private String depositTransactionDepositType;

    /*Any necessary details describing the purpose or reference properties of the deposit*/
    private String depositTransactionDescription;

    /*The deposited amount*/
    private String depositTransactionAmount;

    /*The date and time the deposit was initiated*/
    private String depositTransactionDate;

    /*Details of the withdrawal transaction*/
    private String withdrawalTransaction;

    /*Identifies the target for the withdrawal*/
    private org.museframework.bian.classes.Object withdrawalTransactionSourceReference;

    /*The type of withdrawal made with the transaction*/
    private String withdrawalTransactionWithdrawalType;

    /*Any necessary details describing the purpose or reference properties of the withdrawal*/
    private String withdrawalTransactionDescription;

    /*The withdrawn amount*/
    private String withdrawalTransactionAmount;

    /*The date and time the withdrawal was initiated*/
    private String withdrawalTransactionDate;

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setWithdrawalType(String withdrawalType) {
        this.withdrawalType = withdrawalType;
    }

    public String getWithdrawalType() {
        return withdrawalType;
    }

    public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
        this.accountLimitBreachResponse = accountLimitBreachResponse;
    }

    public String getAccountLimitBreachResponse() {
        return accountLimitBreachResponse;
    }

    public void setDepositTransaction(String depositTransaction) {
        this.depositTransaction = depositTransaction;
    }

    public String getDepositTransaction() {
        return depositTransaction;
    }

    public void setDepositTransactionSourceReference(org.museframework.bian.classes.Object depositTransactionSourceReference) {
        this.depositTransactionSourceReference = depositTransactionSourceReference;
    }

    public org.museframework.bian.classes.Object getDepositTransactionSourceReference() {
        return depositTransactionSourceReference;
    }

    public void setDepositTransactionDepositType(String depositTransactionDepositType) {
        this.depositTransactionDepositType = depositTransactionDepositType;
    }

    public String getDepositTransactionDepositType() {
        return depositTransactionDepositType;
    }

    public void setDepositTransactionDescription(String depositTransactionDescription) {
        this.depositTransactionDescription = depositTransactionDescription;
    }

    public String getDepositTransactionDescription() {
        return depositTransactionDescription;
    }

    public void setDepositTransactionAmount(String depositTransactionAmount) {
        this.depositTransactionAmount = depositTransactionAmount;
    }

    public String getDepositTransactionAmount() {
        return depositTransactionAmount;
    }

    public void setDepositTransactionDate(String depositTransactionDate) {
        this.depositTransactionDate = depositTransactionDate;
    }

    public String getDepositTransactionDate() {
        return depositTransactionDate;
    }

    public void setWithdrawalTransaction(String withdrawalTransaction) {
        this.withdrawalTransaction = withdrawalTransaction;
    }

    public String getWithdrawalTransaction() {
        return withdrawalTransaction;
    }

    public void setWithdrawalTransactionSourceReference(org.museframework.bian.classes.Object withdrawalTransactionSourceReference) {
        this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
    }

    public org.museframework.bian.classes.Object getWithdrawalTransactionSourceReference() {
        return withdrawalTransactionSourceReference;
    }

    public void setWithdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
        this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
    }

    public String getWithdrawalTransactionWithdrawalType() {
        return withdrawalTransactionWithdrawalType;
    }

    public void setWithdrawalTransactionDescription(String withdrawalTransactionDescription) {
        this.withdrawalTransactionDescription = withdrawalTransactionDescription;
    }

    public String getWithdrawalTransactionDescription() {
        return withdrawalTransactionDescription;
    }

    public void setWithdrawalTransactionAmount(String withdrawalTransactionAmount) {
        this.withdrawalTransactionAmount = withdrawalTransactionAmount;
    }

    public String getWithdrawalTransactionAmount() {
        return withdrawalTransactionAmount;
    }

    public void setWithdrawalTransactionDate(String withdrawalTransactionDate) {
        this.withdrawalTransactionDate = withdrawalTransactionDate;
    }

    public String getWithdrawalTransactionDate() {
        return withdrawalTransactionDate;
    }
}