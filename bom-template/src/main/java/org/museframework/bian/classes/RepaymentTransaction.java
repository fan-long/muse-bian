/*Money Transfer Transaction realizing the repayment of a loan

is the additional information to the money transfer transaction, referring to the information contained in the instruction to repay, given by the customer.*/
package org.museframework.bian.classes;

public class RepaymentTransaction {
    /**/
    private String repaymentTransactionIdentification;

    /**/
    private String repaymentTransactionPayerReference;

    /**/
    private String repaymentTransactionPayerAccountReference;

    /**/
    private String repaymentTransactionPayerBankReference;

    /**/
    private String repaymentTransactionAmount;

    /**/
    private String repaymentTransactionCurrency;

    /**/
    private String repaymentTransactionValueDate;

    public void setRepaymentTransactionIdentification(String repaymentTransactionIdentification) {
        this.repaymentTransactionIdentification = repaymentTransactionIdentification;
    }

    public String getRepaymentTransactionIdentification() {
        return repaymentTransactionIdentification;
    }

    public void setRepaymentTransactionPayerReference(String repaymentTransactionPayerReference) {
        this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
    }

    public String getRepaymentTransactionPayerReference() {
        return repaymentTransactionPayerReference;
    }

    public void setRepaymentTransactionPayerAccountReference(String repaymentTransactionPayerAccountReference) {
        this.repaymentTransactionPayerAccountReference = repaymentTransactionPayerAccountReference;
    }

    public String getRepaymentTransactionPayerAccountReference() {
        return repaymentTransactionPayerAccountReference;
    }

    public void setRepaymentTransactionPayerBankReference(String repaymentTransactionPayerBankReference) {
        this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
    }

    public String getRepaymentTransactionPayerBankReference() {
        return repaymentTransactionPayerBankReference;
    }

    public void setRepaymentTransactionAmount(String repaymentTransactionAmount) {
        this.repaymentTransactionAmount = repaymentTransactionAmount;
    }

    public String getRepaymentTransactionAmount() {
        return repaymentTransactionAmount;
    }

    public void setRepaymentTransactionCurrency(String repaymentTransactionCurrency) {
        this.repaymentTransactionCurrency = repaymentTransactionCurrency;
    }

    public String getRepaymentTransactionCurrency() {
        return repaymentTransactionCurrency;
    }

    public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
        this.repaymentTransactionValueDate = repaymentTransactionValueDate;
    }

    public String getRepaymentTransactionValueDate() {
        return repaymentTransactionValueDate;
    }
}