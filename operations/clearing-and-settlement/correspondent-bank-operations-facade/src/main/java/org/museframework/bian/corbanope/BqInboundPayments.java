package org.museframework.bian.corbanope;

import org.museframework.bian.corbanope.dto.ExchangeInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.ExchangeInboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.ExecuteInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.ExecuteInboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.InitiateInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.InitiateInboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.NotifyInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.NotifyInboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.RequestInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.RequestInboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.RetrieveInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.RetrieveInboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.UpdateInboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.UpdateInboundPaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CorrespondentBankOperations", group="InboundPayments")
public interface BqInboundPayments {
    @GenericDtxEndpoint
    @Description("Update inbound payment transactions")
    UpdateInboundPaymentsResponse updateInboundPayments(UpdateInboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Execute inbound payment transactions from a correspondent")
    ExecuteInboundPaymentsResponse executeInboundPayments(ExecuteInboundPaymentsRequest req);

    @Description("Retrieve inbound payments")
    RetrieveInboundPaymentsResponse retrieveInboundPayments(RetrieveInboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Inbound Payments")
    ExchangeInboundPaymentsResponse exchangeInboundPayments(ExchangeInboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Inbound Payments")
    InitiateInboundPaymentsResponse initiateInboundPayments(InitiateInboundPaymentsRequest req);

    @Description("Notify Inbound Payments")
    NotifyInboundPaymentsResponse notifyInboundPayments(NotifyInboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Request Inbound Payments")
    RequestInboundPaymentsResponse requestInboundPayments(RequestInboundPaymentsRequest req);
}