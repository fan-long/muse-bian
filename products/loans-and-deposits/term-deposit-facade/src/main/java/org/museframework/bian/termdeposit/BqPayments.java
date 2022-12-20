package org.museframework.bian.termdeposit;

import org.museframework.bian.termdeposit.dto.ExecutePaymentsRequest;
import org.museframework.bian.termdeposit.dto.ExecutePaymentsResponse;
import org.museframework.bian.termdeposit.dto.InitiatePaymentsRequest;
import org.museframework.bian.termdeposit.dto.InitiatePaymentsResponse;
import org.museframework.bian.termdeposit.dto.RetrievePaymentsRequest;
import org.museframework.bian.termdeposit.dto.RetrievePaymentsResponse;
import org.museframework.bian.termdeposit.dto.UpdatePaymentsRequest;
import org.museframework.bian.termdeposit.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="TermDeposit", group="Payments")
public interface BqPayments {
    @GenericDtxEndpoint
    @Description("InBQ Initialize a payment transaction (can be single or repeating)")
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