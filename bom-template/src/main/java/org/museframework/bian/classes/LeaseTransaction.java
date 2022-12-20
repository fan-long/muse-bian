/*A transaction that is the result of a Leasing Arrangement fulfillment*/
package org.museframework.bian.classes;

public class LeaseTransaction {
    /**/
    private String leasingTransactionType;

    public void setLeasingTransactionType(String leasingTransactionType) {
        this.leasingTransactionType = leasingTransactionType;
    }

    public String getLeasingTransactionType() {
        return leasingTransactionType;
    }
}