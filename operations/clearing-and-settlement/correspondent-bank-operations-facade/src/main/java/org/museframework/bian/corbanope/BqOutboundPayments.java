package org.museframework.bian.corbanope;

import org.museframework.bian.corbanope.dto.ExchangeOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.ExchangeOutboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.ExecuteOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.ExecuteOutboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.InitiateOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.InitiateOutboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.NotifyOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.NotifyOutboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.RequestOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.RequestOutboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.RetrieveOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.RetrieveOutboundPaymentsResponse;
import org.museframework.bian.corbanope.dto.UpdateOutboundPaymentsRequest;
import org.museframework.bian.corbanope.dto.UpdateOutboundPaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CorrespondentBankOperations", group="OutboundPayments")
public interface BqOutboundPayments {
    @GenericDtxEndpoint
    @Description("Update outbound payment transactions")
    UpdateOutboundPaymentsResponse updateOutboundPayments(UpdateOutboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Execute outbound payment transactions to a correspondent")
    ExecuteOutboundPaymentsResponse executeOutboundPayments(ExecuteOutboundPaymentsRequest req);

    @Description("Retrieve outbound payments")
    RetrieveOutboundPaymentsResponse retrieveOutboundPayments(RetrieveOutboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Outbound Payments")
    ExchangeOutboundPaymentsResponse exchangeOutboundPayments(ExchangeOutboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Outbound Payments")
    InitiateOutboundPaymentsResponse initiateOutboundPayments(InitiateOutboundPaymentsRequest req);

    @Description("Notify Outbound Payments")
    NotifyOutboundPaymentsResponse notifyOutboundPayments(NotifyOutboundPaymentsRequest req);

    @GenericDtxEndpoint
    @Description("Request Outbound Payments")
    RequestOutboundPaymentsResponse requestOutboundPayments(RequestOutboundPaymentsRequest req);
}