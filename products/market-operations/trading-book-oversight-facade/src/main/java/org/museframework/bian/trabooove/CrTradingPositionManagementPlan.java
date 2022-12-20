package org.museframework.bian.trabooove;

import org.museframework.bian.trabooove.dto.ControlTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.ControlTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.CreateTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.CreateTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.ExchangeTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.ExchangeTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.GrantTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.GrantTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.NotifyTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.NotifyTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.RequestTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.RequestTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.RetrieveTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.RetrieveTradingPositionManagementPlanResponse;
import org.museframework.bian.trabooove.dto.UpdateTradingPositionManagementPlanRequest;
import org.museframework.bian.trabooove.dto.UpdateTradingPositionManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Trading Book Oversight.")
@GenericDomain(name="TradingBookOversight", group="TradingPositionManagementPlan")
public interface CrTradingPositionManagementPlan {
    @GenericDtxEndpoint
    @Description("Control Trading Position Management Plan")
    ControlTradingPositionManagementPlanResponse controlTradingPositionManagementPlan(ControlTradingPositionManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Trading Position Management Plan")
    CreateTradingPositionManagementPlanResponse createTradingPositionManagementPlan(CreateTradingPositionManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Trading Position Management Plan")
    ExchangeTradingPositionManagementPlanResponse exchangeTradingPositionManagementPlan(ExchangeTradingPositionManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Trading Position Management Plan")
    GrantTradingPositionManagementPlanResponse grantTradingPositionManagementPlan(GrantTradingPositionManagementPlanRequest req);

    @Description("Notify Trading Position Management Plan")
    NotifyTradingPositionManagementPlanResponse notifyTradingPositionManagementPlan(NotifyTradingPositionManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Trading Position Management Plan")
    RequestTradingPositionManagementPlanResponse requestTradingPositionManagementPlan(RequestTradingPositionManagementPlanRequest req);

    @Description("Retrieve Trading Position Management Plan")
    RetrieveTradingPositionManagementPlanResponse retrieveTradingPositionManagementPlan(RetrieveTradingPositionManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Trading Position Management Plan")
    UpdateTradingPositionManagementPlanResponse updateTradingPositionManagementPlan(UpdateTradingPositionManagementPlanRequest req);
}