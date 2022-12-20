/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.financialaccounting.dto.bq;

public class LedgerPosting {
    /*Defines the posting location in the account ledger according to the chart of accounts (e.g. based on customer, transaction type)*/
    private String postingDirection;

    /*The posting amount as a credit-debit pair*/
    private String postingAmount_creditdebitpair_;

    /*The date and time of the posting*/
    private String postingValueDate;

    /*Any confirmation notification*/
    private String postingResult;

    public void setPostingDirection(String postingDirection) {
        this.postingDirection = postingDirection;
    }

    public String getPostingDirection() {
        return postingDirection;
    }

    public void setPostingAmount_creditdebitpair_(String postingAmount_creditdebitpair_) {
        this.postingAmount_creditdebitpair_ = postingAmount_creditdebitpair_;
    }

    public String getPostingAmount_creditdebitpair_() {
        return postingAmount_creditdebitpair_;
    }

    public void setPostingValueDate(String postingValueDate) {
        this.postingValueDate = postingValueDate;
    }

    public String getPostingValueDate() {
        return postingValueDate;
    }

    public void setPostingResult(String postingResult) {
        this.postingResult = postingResult;
    }

    public String getPostingResult() {
        return postingResult;
    }
}