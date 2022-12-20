package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.ExchangePaymentsRequest;
import org.museframework.bian.leasing.dto.ExchangePaymentsResponse;
import org.museframework.bian.leasing.dto.InitiatePaymentsRequest;
import org.museframework.bian.leasing.dto.InitiatePaymentsResponse;
import org.museframework.bian.leasing.dto.RetrievePaymentsRequest;
import org.museframework.bian.leasing.dto.RetrievePaymentsResponse;
import org.museframework.bian.leasing.dto.UpdatePaymentsRequest;
import org.museframework.bian.leasing.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Payments")
public interface BqPayments {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Payments processing")
    ExchangePaymentsResponse exchangePayments(ExchangePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Payments")
    InitiatePaymentsResponse initiatePayments(InitiatePaymentsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payments")
    RetrievePaymentsResponse retrievePayments(RetrievePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Payments")
    UpdatePaymentsResponse updatePayments(UpdatePaymentsRequest req);
}