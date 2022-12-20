package org.museframework.bian.dealerdesk;

import org.museframework.bian.dealerdesk.dto.ExchangeDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.ExchangeDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.bian.dealerdesk.dto.ExecuteDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.ExecuteDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.bian.dealerdesk.dto.InitiateDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.InitiateDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.bian.dealerdesk.dto.NotifyDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.NotifyDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.bian.dealerdesk.dto.RequestDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.RequestDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.bian.dealerdesk.dto.RetrieveDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.RetrieveDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.bian.dealerdesk.dto.UpdateDealerDeskTradingAssignmentandLimitsFunctionRequest;
import org.museframework.bian.dealerdesk.dto.UpdateDealerDeskTradingAssignmentandLimitsFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function")
@GenericDomain(name="DealerDesk", group="DealerDeskTradingAssignmentandLimitsFunction")
public interface BqDealerDeskTradingAssignmentandLimitsFunction {
    @GenericDtxEndpoint
    @Description("Exchange Dealer Desk Trading Assignment and Limits Function")
    ExchangeDealerDeskTradingAssignmentandLimitsFunctionResponse exchangeDealerDeskTradingAssignmentandLimitsFunction(ExchangeDealerDeskTradingAssignmentandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Dealer Desk Trading Assignment and Limits Function")
    ExecuteDealerDeskTradingAssignmentandLimitsFunctionResponse executeDealerDeskTradingAssignmentandLimitsFunction(ExecuteDealerDeskTradingAssignmentandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Dealer Desk Trading Assignment and Limits Function")
    InitiateDealerDeskTradingAssignmentandLimitsFunctionResponse initiateDealerDeskTradingAssignmentandLimitsFunction(InitiateDealerDeskTradingAssignmentandLimitsFunctionRequest req);

    @Description("Notify Dealer Desk Trading Assignment and Limits Function")
    NotifyDealerDeskTradingAssignmentandLimitsFunctionResponse notifyDealerDeskTradingAssignmentandLimitsFunction(NotifyDealerDeskTradingAssignmentandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Dealer Desk Trading Assignment and Limits Function")
    RequestDealerDeskTradingAssignmentandLimitsFunctionResponse requestDealerDeskTradingAssignmentandLimitsFunction(RequestDealerDeskTradingAssignmentandLimitsFunctionRequest req);

    @Description("Retrieve Dealer Desk Trading Assignment and Limits Function")
    RetrieveDealerDeskTradingAssignmentandLimitsFunctionResponse retrieveDealerDeskTradingAssignmentandLimitsFunction(RetrieveDealerDeskTradingAssignmentandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Dealer Desk Trading Assignment and Limits Function")
    UpdateDealerDeskTradingAssignmentandLimitsFunctionResponse updateDealerDeskTradingAssignmentandLimitsFunction(UpdateDealerDeskTradingAssignmentandLimitsFunctionRequest req);
}