/*A Deposit Agreement originated by a deposit within the arrangements and conditions specified in a Corporate Deposit Agreement.*/
package org.museframework.bian.classes;

public class TermDepositTransaction {
    /**/
    private String termDepositTransactionType;

    public void setTermDepositTransactionType(String termDepositTransactionType) {
        this.termDepositTransactionType = termDepositTransactionType;
    }

    public String getTermDepositTransactionType() {
        return termDepositTransactionType;
    }
}