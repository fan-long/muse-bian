package org.museframework.bian.savingsaccount;

import org.museframework.bian.savingsaccount.dto.ExecutePaymentsRequest;
import org.museframework.bian.savingsaccount.dto.ExecutePaymentsResponse;
import org.museframework.bian.savingsaccount.dto.InitiatePaymentsRequest;
import org.museframework.bian.savingsaccount.dto.InitiatePaymentsResponse;
import org.museframework.bian.savingsaccount.dto.RetrievePaymentsRequest;
import org.museframework.bian.savingsaccount.dto.RetrievePaymentsResponse;
import org.museframework.bian.savingsaccount.dto.UpdatePaymentsRequest;
import org.museframework.bian.savingsaccount.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="SavingsAccount", group="Payments")
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