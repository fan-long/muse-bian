package org.museframework.bian.projectfinance;

import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceRepaymentFulfillmentRequest;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceRepaymentFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment")
@GenericDomain(name="ProjectFinance", group="ProjectFinanceRepaymentFulfillment")
public interface BqProjectFinanceRepaymentFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Project Finance Repayment Fulfillment")
    ExchangeProjectFinanceRepaymentFulfillmentResponse exchangeProjectFinanceRepaymentFulfillment(ExchangeProjectFinanceRepaymentFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Project Finance Repayment Fulfillment")
    ExecuteProjectFinanceRepaymentFulfillmentResponse executeProjectFinanceRepaymentFulfillment(ExecuteProjectFinanceRepaymentFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Project Finance Repayment Fulfillment")
    InitiateProjectFinanceRepaymentFulfillmentResponse initiateProjectFinanceRepaymentFulfillment(InitiateProjectFinanceRepaymentFulfillmentRequest req);

    @Description("Notify Project Finance Repayment Fulfillment")
    NotifyProjectFinanceRepaymentFulfillmentResponse notifyProjectFinanceRepaymentFulfillment(NotifyProjectFinanceRepaymentFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Project Finance Repayment Fulfillment")
    RequestProjectFinanceRepaymentFulfillmentResponse requestProjectFinanceRepaymentFulfillment(RequestProjectFinanceRepaymentFulfillmentRequest req);

    @Description("Retrieve Project Finance Repayment Fulfillment")
    RetrieveProjectFinanceRepaymentFulfillmentResponse retrieveProjectFinanceRepaymentFulfillment(RetrieveProjectFinanceRepaymentFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Project Finance Repayment Fulfillment")
    UpdateProjectFinanceRepaymentFulfillmentResponse updateProjectFinanceRepaymentFulfillment(UpdateProjectFinanceRepaymentFulfillmentRequest req);
}