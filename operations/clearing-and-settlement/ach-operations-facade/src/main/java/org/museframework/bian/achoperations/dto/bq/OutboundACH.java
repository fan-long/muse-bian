/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OutboundACH {
    /*Reference to the batch ACH record*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object outboundACHTransactionBatchReference;

    public void setOutboundACHTransactionBatchReference(org.museframework.bian.classes.Object outboundACHTransactionBatchReference) {
        this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
    }

    public org.museframework.bian.classes.Object getOutboundACHTransactionBatchReference() {
        return outboundACHTransactionBatchReference;
    }
}