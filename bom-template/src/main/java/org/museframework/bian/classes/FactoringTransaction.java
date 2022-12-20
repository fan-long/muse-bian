/*A transaction that is the result of fulfillment of the Factoring Arrangement*/
package org.museframework.bian.classes;

public class FactoringTransaction {
    /**/
    private org.museframework.bian.enumerations.Factoringtransactiontypevalues factoringTransactionType;

    public void setFactoringTransactionType(org.museframework.bian.enumerations.Factoringtransactiontypevalues factoringTransactionType) {
        this.factoringTransactionType = factoringTransactionType;
    }

    public org.museframework.bian.enumerations.Factoringtransactiontypevalues getFactoringTransactionType() {
        return factoringTransactionType;
    }
}