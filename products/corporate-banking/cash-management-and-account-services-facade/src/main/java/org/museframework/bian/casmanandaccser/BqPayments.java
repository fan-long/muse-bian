package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.ExecutePaymentsRequest;
import org.museframework.bian.casmanandaccser.dto.ExecutePaymentsResponse;
import org.museframework.bian.casmanandaccser.dto.InitiatePaymentsRequest;
import org.museframework.bian.casmanandaccser.dto.InitiatePaymentsResponse;
import org.museframework.bian.casmanandaccser.dto.RetrievePaymentsRequest;
import org.museframework.bian.casmanandaccser.dto.RetrievePaymentsResponse;
import org.museframework.bian.casmanandaccser.dto.UpdatePaymentsRequest;
import org.museframework.bian.casmanandaccser.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="Payments")
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