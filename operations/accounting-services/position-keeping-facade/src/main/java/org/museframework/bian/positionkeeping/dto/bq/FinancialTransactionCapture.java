/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.positionkeeping.dto.bq;

public class FinancialTransactionCapture {
    /*The description of purpose of the financial transaction*/
    private String postingDescription;

    /*The logged financial transaction. Note the log can be structured with double entry representations (i.e. capture credit/debit pair)*/
    private String postingTransaction;

    /*The date of the transaction*/
    private String postingValueDate;

    public void setPostingDescription(String postingDescription) {
        this.postingDescription = postingDescription;
    }

    public String getPostingDescription() {
        return postingDescription;
    }

    public void setPostingTransaction(String postingTransaction) {
        this.postingTransaction = postingTransaction;
    }

    public String getPostingTransaction() {
        return postingTransaction;
    }

    public void setPostingValueDate(String postingValueDate) {
        this.postingValueDate = postingValueDate;
    }

    public String getPostingValueDate() {
        return postingValueDate;
    }
}