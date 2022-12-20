package org.museframework.bian.factoring;

import org.museframework.bian.factoring.dto.ExchangeAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExchangeAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.bian.factoring.dto.ExecuteAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExecuteAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.bian.factoring.dto.InitiateAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.InitiateAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.bian.factoring.dto.NotifyAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.NotifyAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.bian.factoring.dto.RequestAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.RequestAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.bian.factoring.dto.RetrieveAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.RetrieveAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.bian.factoring.dto.UpdateAccountsReceivablePurchaseFulfillmentRequest;
import org.museframework.bian.factoring.dto.UpdateAccountsReceivablePurchaseFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment")
@GenericDomain(name="Factoring", group="AccountsReceivablePurchaseFulfillment")
public interface BqAccountsReceivablePurchaseFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Accounts Receivable Purchase Fulfillment")
    ExchangeAccountsReceivablePurchaseFulfillmentResponse exchangeAccountsReceivablePurchaseFulfillment(ExchangeAccountsReceivablePurchaseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Accounts Receivable Purchase Fulfillment")
    ExecuteAccountsReceivablePurchaseFulfillmentResponse executeAccountsReceivablePurchaseFulfillment(ExecuteAccountsReceivablePurchaseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Accounts Receivable Purchase Fulfillment")
    InitiateAccountsReceivablePurchaseFulfillmentResponse initiateAccountsReceivablePurchaseFulfillment(InitiateAccountsReceivablePurchaseFulfillmentRequest req);

    @Description("Notify Accounts Receivable Purchase Fulfillment")
    NotifyAccountsReceivablePurchaseFulfillmentResponse notifyAccountsReceivablePurchaseFulfillment(NotifyAccountsReceivablePurchaseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Accounts Receivable Purchase Fulfillment")
    RequestAccountsReceivablePurchaseFulfillmentResponse requestAccountsReceivablePurchaseFulfillment(RequestAccountsReceivablePurchaseFulfillmentRequest req);

    @Description("Retrieve Accounts Receivable Purchase Fulfillment")
    RetrieveAccountsReceivablePurchaseFulfillmentResponse retrieveAccountsReceivablePurchaseFulfillment(RetrieveAccountsReceivablePurchaseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Accounts Receivable Purchase Fulfillment")
    UpdateAccountsReceivablePurchaseFulfillmentResponse updateAccountsReceivablePurchaseFulfillment(UpdateAccountsReceivablePurchaseFulfillmentRequest req);
}