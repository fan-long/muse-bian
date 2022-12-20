package org.museframework.bian.commissions;

import org.museframework.bian.commissions.dto.ExchangePaymentRequest;
import org.museframework.bian.commissions.dto.ExchangePaymentResponse;
import org.museframework.bian.commissions.dto.RetrievePaymentRequest;
import org.museframework.bian.commissions.dto.RetrievePaymentResponse;
import org.museframework.bian.commissions.dto.UpdatePaymentRequest;
import org.museframework.bian.commissions.dto.UpdatePaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions.  Example: Execute a payment transaction.")
@GenericDomain(name="Commissions", group="Payment")
public interface BqPayment {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Payment processing")
    ExchangePaymentResponse exchangePayment(ExchangePaymentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payment")
    RetrievePaymentResponse retrievePayment(RetrievePaymentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Payment")
    UpdatePaymentResponse updatePayment(UpdatePaymentRequest req);
}