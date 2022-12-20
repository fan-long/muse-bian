package org.museframework.bian.projectfinance;

import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceArrangementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceArrangementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceArrangementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceArrangementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceArrangementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceArrangementFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceArrangementFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceArrangementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment")
@GenericDomain(name="ProjectFinance", group="ProjectFinanceArrangementFulfillment")
public interface BqProjectFinanceArrangementFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Project Finance Arrangement Fulfillment")
    ExchangeProjectFinanceArrangementFulfillmentResponse exchangeProjectFinanceArrangementFulfillment(ExchangeProjectFinanceArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Project Finance Arrangement Fulfillment")
    ExecuteProjectFinanceArrangementFulfillmentResponse executeProjectFinanceArrangementFulfillment(ExecuteProjectFinanceArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Project Finance Arrangement Fulfillment")
    InitiateProjectFinanceArrangementFulfillmentResponse initiateProjectFinanceArrangementFulfillment(InitiateProjectFinanceArrangementFulfillmentRequest req);

    @Description("Notify Project Finance Arrangement Fulfillment")
    NotifyProjectFinanceArrangementFulfillmentResponse notifyProjectFinanceArrangementFulfillment(NotifyProjectFinanceArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Project Finance Arrangement Fulfillment")
    RequestProjectFinanceArrangementFulfillmentResponse requestProjectFinanceArrangementFulfillment(RequestProjectFinanceArrangementFulfillmentRequest req);

    @Description("Retrieve Project Finance Arrangement Fulfillment")
    RetrieveProjectFinanceArrangementFulfillmentResponse retrieveProjectFinanceArrangementFulfillment(RetrieveProjectFinanceArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Project Finance Arrangement Fulfillment")
    UpdateProjectFinanceArrangementFulfillmentResponse updateProjectFinanceArrangementFulfillment(UpdateProjectFinanceArrangementFulfillmentRequest req);
}