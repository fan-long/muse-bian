/*A transaction that changes the financial position (the status of the finances) of involved party.


- Process which includes the order, the execution, the settlement of trades in the financial domain. (ISO20022)
*/
package org.museframework.bian.classes;

public class FinancialTransaction {
    /**/
    private org.museframework.bian.enumerations.Financialtransactiontypevalues financialTransactionType;

    /**/
    private String financialTransactionCurrency;

    /**/
    private String financialTransactionAmount;

    /**/
    private Account financialTransactionFromAccount;

    /**/
    private Account financialTransactionTargetAccount;

    /**/
    private String financialTransactionDateTime;

    public void setFinancialTransactionType(org.museframework.bian.enumerations.Financialtransactiontypevalues financialTransactionType) {
        this.financialTransactionType = financialTransactionType;
    }

    public org.museframework.bian.enumerations.Financialtransactiontypevalues getFinancialTransactionType() {
        return financialTransactionType;
    }

    public void setFinancialTransactionCurrency(String financialTransactionCurrency) {
        this.financialTransactionCurrency = financialTransactionCurrency;
    }

    public String getFinancialTransactionCurrency() {
        return financialTransactionCurrency;
    }

    public void setFinancialTransactionAmount(String financialTransactionAmount) {
        this.financialTransactionAmount = financialTransactionAmount;
    }

    public String getFinancialTransactionAmount() {
        return financialTransactionAmount;
    }

    public void setFinancialTransactionFromAccount(Account financialTransactionFromAccount) {
        this.financialTransactionFromAccount = financialTransactionFromAccount;
    }

    public Account getFinancialTransactionFromAccount() {
        return financialTransactionFromAccount;
    }

    public void setFinancialTransactionTargetAccount(Account financialTransactionTargetAccount) {
        this.financialTransactionTargetAccount = financialTransactionTargetAccount;
    }

    public Account getFinancialTransactionTargetAccount() {
        return financialTransactionTargetAccount;
    }

    public void setFinancialTransactionDateTime(String financialTransactionDateTime) {
        this.financialTransactionDateTime = financialTransactionDateTime;
    }

    public String getFinancialTransactionDateTime() {
        return financialTransactionDateTime;
    }
}