/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carterope.dto.bq;

public class Batch {
    /*Reference to the batch of transactions*/
    private org.museframework.bian.classes.Object cardTransactionBatchReference;

    public void setCardTransactionBatchReference(org.museframework.bian.classes.Object cardTransactionBatchReference) {
        this.cardTransactionBatchReference = cardTransactionBatchReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionBatchReference() {
        return cardTransactionBatchReference;
    }
}