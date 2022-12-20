package org.museframework.bian.factoring;

import org.museframework.bian.factoring.dto.ExchangeAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExchangeAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.bian.factoring.dto.ExecuteAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExecuteAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.bian.factoring.dto.InitiateAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.InitiateAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.bian.factoring.dto.NotifyAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.NotifyAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.bian.factoring.dto.RequestAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.RequestAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.bian.factoring.dto.RetrieveAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.RetrieveAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.bian.factoring.dto.UpdateAccountsReceivableEvaluationFulfillmentRequest;
import org.museframework.bian.factoring.dto.UpdateAccountsReceivableEvaluationFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment")
@GenericDomain(name="Factoring", group="AccountsReceivableEvaluationFulfillment")
public interface BqAccountsReceivableEvaluationFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Accounts Receivable Evaluation Fulfillment")
    ExchangeAccountsReceivableEvaluationFulfillmentResponse exchangeAccountsReceivableEvaluationFulfillment(ExchangeAccountsReceivableEvaluationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Accounts Receivable Evaluation Fulfillment")
    ExecuteAccountsReceivableEvaluationFulfillmentResponse executeAccountsReceivableEvaluationFulfillment(ExecuteAccountsReceivableEvaluationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Accounts Receivable Evaluation Fulfillment")
    InitiateAccountsReceivableEvaluationFulfillmentResponse initiateAccountsReceivableEvaluationFulfillment(InitiateAccountsReceivableEvaluationFulfillmentRequest req);

    @Description("Notify Accounts Receivable Evaluation Fulfillment")
    NotifyAccountsReceivableEvaluationFulfillmentResponse notifyAccountsReceivableEvaluationFulfillment(NotifyAccountsReceivableEvaluationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Accounts Receivable Evaluation Fulfillment")
    RequestAccountsReceivableEvaluationFulfillmentResponse requestAccountsReceivableEvaluationFulfillment(RequestAccountsReceivableEvaluationFulfillmentRequest req);

    @Description("Retrieve Accounts Receivable Evaluation Fulfillment")
    RetrieveAccountsReceivableEvaluationFulfillmentResponse retrieveAccountsReceivableEvaluationFulfillment(RetrieveAccountsReceivableEvaluationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Accounts Receivable Evaluation Fulfillment")
    UpdateAccountsReceivableEvaluationFulfillmentResponse updateAccountsReceivableEvaluationFulfillment(UpdateAccountsReceivableEvaluationFulfillmentRequest req);
}