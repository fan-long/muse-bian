package org.museframework.bian.projectfinance;

import org.museframework.bian.projectfinance.dto.ExchangeProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExchangeProjectFinancePlacementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinancePlacementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinancePlacementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinancePlacementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RequestProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RequestProjectFinancePlacementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinancePlacementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinancePlacementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinancePlacementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment")
@GenericDomain(name="ProjectFinance", group="ProjectFinancePlacementFulfillment")
public interface BqProjectFinancePlacementFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Project Finance Placement Fulfillment")
    ExchangeProjectFinancePlacementFulfillmentResponse exchangeProjectFinancePlacementFulfillment(ExchangeProjectFinancePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Project Finance Placement Fulfillment")
    ExecuteProjectFinancePlacementFulfillmentResponse executeProjectFinancePlacementFulfillment(ExecuteProjectFinancePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Project Finance Placement Fulfillment")
    InitiateProjectFinancePlacementFulfillmentResponse initiateProjectFinancePlacementFulfillment(InitiateProjectFinancePlacementFulfillmentRequest req);

    @Description("Notify Project Finance Placement Fulfillment")
    NotifyProjectFinancePlacementFulfillmentResponse notifyProjectFinancePlacementFulfillment(NotifyProjectFinancePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Project Finance Placement Fulfillment")
    RequestProjectFinancePlacementFulfillmentResponse requestProjectFinancePlacementFulfillment(RequestProjectFinancePlacementFulfillmentRequest req);

    @Description("Retrieve Project Finance Placement Fulfillment")
    RetrieveProjectFinancePlacementFulfillmentResponse retrieveProjectFinancePlacementFulfillment(RetrieveProjectFinancePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Project Finance Placement Fulfillment")
    UpdateProjectFinancePlacementFulfillmentResponse updateProjectFinancePlacementFulfillment(UpdateProjectFinancePlacementFulfillmentRequest req);
}