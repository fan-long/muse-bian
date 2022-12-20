/**/
package org.museframework.bian.classes;

public class DirectDebitTransaction {
    /**/
    private org.museframework.bian.enumerations.Transactiontypevalues transactionType;

    public void setTransactionType(org.museframework.bian.enumerations.Transactiontypevalues transactionType) {
        this.transactionType = transactionType;
    }

    public org.museframework.bian.enumerations.Transactiontypevalues getTransactionType() {
        return transactionType;
    }
}