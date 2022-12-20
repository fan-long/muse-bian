package org.museframework.bian.chelocbox;

import org.museframework.bian.chelocbox.dto.ExchangeCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.ExchangeCheckClearingandSettlementFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.ExecuteCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.ExecuteCheckClearingandSettlementFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.InitiateCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.InitiateCheckClearingandSettlementFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.NotifyCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.NotifyCheckClearingandSettlementFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.RequestCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.RequestCheckClearingandSettlementFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.RetrieveCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.RetrieveCheckClearingandSettlementFulfillmentResponse;
import org.museframework.bian.chelocbox.dto.UpdateCheckClearingandSettlementFulfillmentRequest;
import org.museframework.bian.chelocbox.dto.UpdateCheckClearingandSettlementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment")
@GenericDomain(name="ChequeLockBox", group="CheckClearingandSettlementFulfillment")
public interface BqCheckClearingandSettlementFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Check Clearing and Settlement Fulfillment")
    ExchangeCheckClearingandSettlementFulfillmentResponse exchangeCheckClearingandSettlementFulfillment(ExchangeCheckClearingandSettlementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Check Clearing and Settlement Fulfillment")
    ExecuteCheckClearingandSettlementFulfillmentResponse executeCheckClearingandSettlementFulfillment(ExecuteCheckClearingandSettlementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Check Clearing and Settlement Fulfillment")
    InitiateCheckClearingandSettlementFulfillmentResponse initiateCheckClearingandSettlementFulfillment(InitiateCheckClearingandSettlementFulfillmentRequest req);

    @Description("Notify Check Clearing and Settlement Fulfillment")
    NotifyCheckClearingandSettlementFulfillmentResponse notifyCheckClearingandSettlementFulfillment(NotifyCheckClearingandSettlementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Check Clearing and Settlement Fulfillment")
    RequestCheckClearingandSettlementFulfillmentResponse requestCheckClearingandSettlementFulfillment(RequestCheckClearingandSettlementFulfillmentRequest req);

    @Description("Retrieve Check Clearing and Settlement Fulfillment")
    RetrieveCheckClearingandSettlementFulfillmentResponse retrieveCheckClearingandSettlementFulfillment(RetrieveCheckClearingandSettlementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Check Clearing and Settlement Fulfillment")
    UpdateCheckClearingandSettlementFulfillmentResponse updateCheckClearingandSettlementFulfillment(UpdateCheckClearingandSettlementFulfillmentRequest req);
}