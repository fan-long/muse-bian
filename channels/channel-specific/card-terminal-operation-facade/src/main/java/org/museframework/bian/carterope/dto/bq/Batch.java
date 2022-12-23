/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carterope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Batch {
    /*Reference to the batch of transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionBatchReference;

    public void setCardTransactionBatchReference(org.museframework.bian.classes.Object cardTransactionBatchReference) {
        this.cardTransactionBatchReference = cardTransactionBatchReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionBatchReference() {
        return cardTransactionBatchReference;
    }
}