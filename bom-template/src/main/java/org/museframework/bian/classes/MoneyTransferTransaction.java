/*Transfer of money between two parties and/or accounts*/
package org.museframework.bian.classes;

public class MoneyTransferTransaction {
    /*The amount of money transferred from the source to the target.*/
    private String moneyTransferTransactionAmount;

    /*The currency of the money transfer amount*/
    private String moneyTransferTransactionCurrency;

    /*The account the money is transferred from.*/
    private String moneyTransferTransactionSourceAccount;

    /*The account the money is transferred to.*/
    private String moneyTransferTransactionTargetAccount;

    /**/
    private String moneyTransferInstructionReference;

    /*The method used to transfer money; Can be a payment network but also something physical.*/
    private String moneyTransferUsedMethod;

    /*The date on which the money is considerd to have left/have arrived become active can be used /strats to starts is considerd to be */
    private String moneyTransferValueDate;

    public void setMoneyTransferTransactionAmount(String moneyTransferTransactionAmount) {
        this.moneyTransferTransactionAmount = moneyTransferTransactionAmount;
    }

    public String getMoneyTransferTransactionAmount() {
        return moneyTransferTransactionAmount;
    }

    public void setMoneyTransferTransactionCurrency(String moneyTransferTransactionCurrency) {
        this.moneyTransferTransactionCurrency = moneyTransferTransactionCurrency;
    }

    public String getMoneyTransferTransactionCurrency() {
        return moneyTransferTransactionCurrency;
    }

    public void setMoneyTransferTransactionSourceAccount(String moneyTransferTransactionSourceAccount) {
        this.moneyTransferTransactionSourceAccount = moneyTransferTransactionSourceAccount;
    }

    public String getMoneyTransferTransactionSourceAccount() {
        return moneyTransferTransactionSourceAccount;
    }

    public void setMoneyTransferTransactionTargetAccount(String moneyTransferTransactionTargetAccount) {
        this.moneyTransferTransactionTargetAccount = moneyTransferTransactionTargetAccount;
    }

    public String getMoneyTransferTransactionTargetAccount() {
        return moneyTransferTransactionTargetAccount;
    }

    public void setMoneyTransferInstructionReference(String moneyTransferInstructionReference) {
        this.moneyTransferInstructionReference = moneyTransferInstructionReference;
    }

    public String getMoneyTransferInstructionReference() {
        return moneyTransferInstructionReference;
    }

    public void setMoneyTransferUsedMethod(String moneyTransferUsedMethod) {
        this.moneyTransferUsedMethod = moneyTransferUsedMethod;
    }

    public String getMoneyTransferUsedMethod() {
        return moneyTransferUsedMethod;
    }

    public void setMoneyTransferValueDate(String moneyTransferValueDate) {
        this.moneyTransferValueDate = moneyTransferValueDate;
    }

    public String getMoneyTransferValueDate() {
        return moneyTransferValueDate;
    }
}