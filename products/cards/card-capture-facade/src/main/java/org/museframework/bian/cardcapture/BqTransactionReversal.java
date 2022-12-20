package org.museframework.bian.cardcapture;

import org.museframework.bian.cardcapture.dto.InitiateTransactionReversalRequest;
import org.museframework.bian.cardcapture.dto.InitiateTransactionReversalResponse;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionReversalRequest;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionReversalResponse;
import org.museframework.bian.cardcapture.dto.UpdateTransactionReversalRequest;
import org.museframework.bian.cardcapture.dto.UpdateTransactionReversalResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture.  Example: Execute a payment transaction.")
@GenericDomain(name="CardCapture", group="TransactionReversal")
public interface BqTransactionReversal {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Transaction Reversal")
    InitiateTransactionReversalResponse initiateTransactionReversal(InitiateTransactionReversalRequest req);

    @Description("ReBQ Retrieve details about any aspect of Transaction Reversal")
    RetrieveTransactionReversalResponse retrieveTransactionReversal(RetrieveTransactionReversalRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Transaction Reversal")
    UpdateTransactionReversalResponse updateTransactionReversal(UpdateTransactionReversalRequest req);
}