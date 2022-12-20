package org.museframework.bian.projectfinance;

import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceSPVFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceSPVFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceSPVFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceSPVFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceSPVFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceSPVFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceSPVFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceSPVFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment")
@GenericDomain(name="ProjectFinance", group="ProjectFinanceSPVFulfillment")
public interface BqProjectFinanceSPVFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Project Finance SPV Fulfillment")
    ExchangeProjectFinanceSPVFulfillmentResponse exchangeProjectFinanceSPVFulfillment(ExchangeProjectFinanceSPVFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Project Finance SPV Fulfillment")
    ExecuteProjectFinanceSPVFulfillmentResponse executeProjectFinanceSPVFulfillment(ExecuteProjectFinanceSPVFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Project Finance SPV Fulfillment")
    InitiateProjectFinanceSPVFulfillmentResponse initiateProjectFinanceSPVFulfillment(InitiateProjectFinanceSPVFulfillmentRequest req);

    @Description("Notify Project Finance SPV Fulfillment")
    NotifyProjectFinanceSPVFulfillmentResponse notifyProjectFinanceSPVFulfillment(NotifyProjectFinanceSPVFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Project Finance SPV Fulfillment")
    RequestProjectFinanceSPVFulfillmentResponse requestProjectFinanceSPVFulfillment(RequestProjectFinanceSPVFulfillmentRequest req);

    @Description("Retrieve Project Finance SPV Fulfillment")
    RetrieveProjectFinanceSPVFulfillmentResponse retrieveProjectFinanceSPVFulfillment(RetrieveProjectFinanceSPVFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Project Finance SPV Fulfillment")
    UpdateProjectFinanceSPVFulfillmentResponse updateProjectFinanceSPVFulfillment(UpdateProjectFinanceSPVFulfillmentRequest req);
}