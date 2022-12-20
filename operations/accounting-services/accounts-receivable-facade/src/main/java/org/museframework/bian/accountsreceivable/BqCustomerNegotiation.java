package org.museframework.bian.accountsreceivable;

import org.museframework.bian.accountsreceivable.dto.ExchangeCustomerNegotiationRequest;
import org.museframework.bian.accountsreceivable.dto.ExchangeCustomerNegotiationResponse;
import org.museframework.bian.accountsreceivable.dto.InitiateCustomerNegotiationRequest;
import org.museframework.bian.accountsreceivable.dto.InitiateCustomerNegotiationResponse;
import org.museframework.bian.accountsreceivable.dto.RequestCustomerNegotiationRequest;
import org.museframework.bian.accountsreceivable.dto.RequestCustomerNegotiationResponse;
import org.museframework.bian.accountsreceivable.dto.RetrieveCustomerNegotiationRequest;
import org.museframework.bian.accountsreceivable.dto.RetrieveCustomerNegotiationResponse;
import org.museframework.bian.accountsreceivable.dto.UpdateCustomerNegotiationRequest;
import org.museframework.bian.accountsreceivable.dto.UpdateCustomerNegotiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="AccountsReceivable", group="CustomerNegotiation")
public interface BqCustomerNegotiation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Customer Negotiation processing")
    ExchangeCustomerNegotiationResponse exchangeCustomerNegotiation(ExchangeCustomerNegotiationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Customer Negotiation")
    InitiateCustomerNegotiationResponse initiateCustomerNegotiation(InitiateCustomerNegotiationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Customer Negotiation")
    RetrieveCustomerNegotiationResponse retrieveCustomerNegotiation(RetrieveCustomerNegotiationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Customer Negotiation")
    RequestCustomerNegotiationResponse requestCustomerNegotiation(RequestCustomerNegotiationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Customer Negotiation")
    UpdateCustomerNegotiationResponse updateCustomerNegotiation(UpdateCustomerNegotiationRequest req);
}