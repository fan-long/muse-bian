/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

public class OutboundACH {
    /*Reference to the batch ACH record*/
    private org.museframework.bian.classes.Object outboundACHTransactionBatchReference;

    public void setOutboundACHTransactionBatchReference(org.museframework.bian.classes.Object outboundACHTransactionBatchReference) {
        this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
    }

    public org.museframework.bian.classes.Object getOutboundACHTransactionBatchReference() {
        return outboundACHTransactionBatchReference;
    }
}