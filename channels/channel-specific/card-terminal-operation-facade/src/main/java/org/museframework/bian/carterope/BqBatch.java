package org.museframework.bian.carterope;

import org.museframework.bian.carterope.dto.InitiateBatchRequest;
import org.museframework.bian.carterope.dto.InitiateBatchResponse;
import org.museframework.bian.carterope.dto.RequestBatchRequest;
import org.museframework.bian.carterope.dto.RequestBatchResponse;
import org.museframework.bian.carterope.dto.RetrieveBatchRequest;
import org.museframework.bian.carterope.dto.RetrieveBatchResponse;
import org.museframework.bian.carterope.dto.UpdateBatchRequest;
import org.museframework.bian.carterope.dto.UpdateBatchResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardTerminalOperation", group="Batch")
public interface BqBatch {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a batch transaction POS capture")
    InitiateBatchResponse initiateBatch(InitiateBatchRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a transaction batch")
    UpdateBatchResponse updateBatch(UpdateBatchRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for a batch (e.g. adjust scheduling)")
    RequestBatchResponse requestBatch(RequestBatchRequest req);

    @Description("ReBQ Retrieve details about a card capture batch")
    RetrieveBatchResponse retrieveBatch(RetrieveBatchRequest req);
}