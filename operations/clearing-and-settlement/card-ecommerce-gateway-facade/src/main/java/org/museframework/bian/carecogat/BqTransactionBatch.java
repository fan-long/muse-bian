package org.museframework.bian.carecogat;

import org.museframework.bian.carecogat.dto.InitiateTransactionBatchRequest;
import org.museframework.bian.carecogat.dto.InitiateTransactionBatchResponse;
import org.museframework.bian.carecogat.dto.RetrieveTransactionBatchRequest;
import org.museframework.bian.carecogat.dto.RetrieveTransactionBatchResponse;
import org.museframework.bian.carecogat.dto.UpdateTransactionBatchRequest;
import org.museframework.bian.carecogat.dto.UpdateTransactionBatchResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardeCommerceGateway", group="TransactionBatch")
public interface BqTransactionBatch {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a batch of card transactions")
    UpdateTransactionBatchResponse updateTransactionBatch(UpdateTransactionBatchRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Initiate a batch of card transaction (initiated at merchant location)")
    InitiateTransactionBatchResponse initiateTransactionBatch(InitiateTransactionBatchRequest req);

    @Description("ReBQ Retrieve details about a batch of card transactions")
    RetrieveTransactionBatchResponse retrieveTransactionBatch(RetrieveTransactionBatchRequest req);
}