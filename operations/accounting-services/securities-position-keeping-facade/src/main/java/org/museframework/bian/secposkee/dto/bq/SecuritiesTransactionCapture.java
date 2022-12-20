/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.secposkee.dto.bq;

public class SecuritiesTransactionCapture {
    /*The type of securities transaction (e.g. bought amount, sold amount, dividend payment)*/
    private String securitiesPostingType;

    /*The logged securities transaction. Note the log can handle a range of transactions covering bought and sold amounts and securities instrument related transactions such as dividend payments*/
    private String securitiesPostingTransaction;

    /*The date of the securities transaction*/
    private String securitiesPostingValueDate;

    public void setSecuritiesPostingType(String securitiesPostingType) {
        this.securitiesPostingType = securitiesPostingType;
    }

    public String getSecuritiesPostingType() {
        return securitiesPostingType;
    }

    public void setSecuritiesPostingTransaction(String securitiesPostingTransaction) {
        this.securitiesPostingTransaction = securitiesPostingTransaction;
    }

    public String getSecuritiesPostingTransaction() {
        return securitiesPostingTransaction;
    }

    public void setSecuritiesPostingValueDate(String securitiesPostingValueDate) {
        this.securitiesPostingValueDate = securitiesPostingValueDate;
    }

    public String getSecuritiesPostingValueDate() {
        return securitiesPostingValueDate;
    }
}