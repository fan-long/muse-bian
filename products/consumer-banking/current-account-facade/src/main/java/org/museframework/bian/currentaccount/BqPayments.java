package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.ExecutePaymentsRequest;
import org.museframework.bian.currentaccount.dto.ExecutePaymentsResponse;
import org.museframework.bian.currentaccount.dto.InitiatePaymentsRequest;
import org.museframework.bian.currentaccount.dto.InitiatePaymentsResponse;
import org.museframework.bian.currentaccount.dto.RetrievePaymentsRequest;
import org.museframework.bian.currentaccount.dto.RetrievePaymentsResponse;
import org.museframework.bian.currentaccount.dto.UpdatePaymentsRequest;
import org.museframework.bian.currentaccount.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CurrentAccount", group="Payments")
public interface BqPayments {
    @GenericDtxEndpoint
    @Description("InBQ Initialize a payment transaction")
    InitiatePaymentsResponse initiatePayments(InitiatePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update a payment transaction configuration or specific transaction")
    UpdatePaymentsResponse updatePayments(UpdatePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Trigger a payment for a repeating payment set up")
    ExecutePaymentsResponse executePayments(ExecutePaymentsRequest req);

    @Description("ReBQ Retrieve details about a payment transaction or arrangement")
    RetrievePaymentsResponse retrievePayments(RetrievePaymentsRequest req);
}