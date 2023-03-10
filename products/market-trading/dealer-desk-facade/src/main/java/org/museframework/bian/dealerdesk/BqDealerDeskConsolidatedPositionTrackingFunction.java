package org.museframework.bian.dealerdesk;

import org.museframework.bian.dealerdesk.dto.ExchangeDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.ExchangeDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.bian.dealerdesk.dto.ExecuteDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.ExecuteDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.bian.dealerdesk.dto.InitiateDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.InitiateDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.bian.dealerdesk.dto.NotifyDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.NotifyDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.bian.dealerdesk.dto.RequestDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.RequestDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.bian.dealerdesk.dto.RetrieveDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.RetrieveDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.bian.dealerdesk.dto.UpdateDealerDeskConsolidatedPositionTrackingFunctionRequest;
import org.museframework.bian.dealerdesk.dto.UpdateDealerDeskConsolidatedPositionTrackingFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function")
@GenericDomain(name="DealerDesk", group="DealerDeskConsolidatedPositionTrackingFunction")
public interface BqDealerDeskConsolidatedPositionTrackingFunction {
    @GenericDtxEndpoint
    @Description("Exchange Dealer Desk Consolidated Position Tracking Function")
    ExchangeDealerDeskConsolidatedPositionTrackingFunctionResponse exchangeDealerDeskConsolidatedPositionTrackingFunction(ExchangeDealerDeskConsolidatedPositionTrackingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Dealer Desk Consolidated Position Tracking Function")
    ExecuteDealerDeskConsolidatedPositionTrackingFunctionResponse executeDealerDeskConsolidatedPositionTrackingFunction(ExecuteDealerDeskConsolidatedPositionTrackingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Dealer Desk Consolidated Position Tracking Function")
    InitiateDealerDeskConsolidatedPositionTrackingFunctionResponse initiateDealerDeskConsolidatedPositionTrackingFunction(InitiateDealerDeskConsolidatedPositionTrackingFunctionRequest req);

    @Description("Notify Dealer Desk Consolidated Position Tracking Function")
    NotifyDealerDeskConsolidatedPositionTrackingFunctionResponse notifyDealerDeskConsolidatedPositionTrackingFunction(NotifyDealerDeskConsolidatedPositionTrackingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Dealer Desk Consolidated Position Tracking Function")
    RequestDealerDeskConsolidatedPositionTrackingFunctionResponse requestDealerDeskConsolidatedPositionTrackingFunction(RequestDealerDeskConsolidatedPositionTrackingFunctionRequest req);

    @Description("Retrieve Dealer Desk Consolidated Position Tracking Function")
    RetrieveDealerDeskConsolidatedPositionTrackingFunctionResponse retrieveDealerDeskConsolidatedPositionTrackingFunction(RetrieveDealerDeskConsolidatedPositionTrackingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Dealer Desk Consolidated Position Tracking Function")
    UpdateDealerDeskConsolidatedPositionTrackingFunctionResponse updateDealerDeskConsolidatedPositionTrackingFunction(UpdateDealerDeskConsolidatedPositionTrackingFunctionRequest req);
}