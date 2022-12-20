package org.museframework.bian.chelocbox;

import org.museframework.bian.chelocbox.dto.ExchangePaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.ExchangePaperCheckProcessingFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.ExecutePaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.ExecutePaperCheckProcessingFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.InitiatePaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.InitiatePaperCheckProcessingFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.NotifyPaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.NotifyPaperCheckProcessingFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.RequestPaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.RequestPaperCheckProcessingFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.RetrievePaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.RetrievePaperCheckProcessingFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.UpdatePaperCheckProcessingFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.UpdatePaperCheckProcessingFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment")
@GenericDomain(name="ChequeLockBox", group="PaperCheckProcessingFulfillment")
public interface BqPaperCheckProcessingFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Paper Check Processing Fulfillment")
    ExchangePaperCheckProcessingFulfillmentResponse exchangePaperCheckProcessingFulfillment(ExchangePaperCheckProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Paper Check Processing Fulfillment")
    ExecutePaperCheckProcessingFulfillmentResponse executePaperCheckProcessingFulfillment(ExecutePaperCheckProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Paper Check Processing Fulfillment")
    InitiatePaperCheckProcessingFulfillmentResponse initiatePaperCheckProcessingFulfillment(InitiatePaperCheckProcessingFulfillmentRequest req);

    @Description("Notify Paper Check Processing Fulfillment")
    NotifyPaperCheckProcessingFulfillmentResponse notifyPaperCheckProcessingFulfillment(NotifyPaperCheckProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Paper Check Processing Fulfillment")
    RequestPaperCheckProcessingFulfillmentResponse requestPaperCheckProcessingFulfillment(RequestPaperCheckProcessingFulfillmentRequest req);

    @Description("Retrieve Paper Check Processing Fulfillment")
    RetrievePaperCheckProcessingFulfillmentResponse retrievePaperCheckProcessingFulfillment(RetrievePaperCheckProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Paper Check Processing Fulfillment")
    UpdatePaperCheckProcessingFulfillmentResponse updatePaperCheckProcessingFulfillment(UpdatePaperCheckProcessingFulfillmentRequest req);
}