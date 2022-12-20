package org.museframework.bian.paymentorder;

import org.museframework.bian.paymentorder.dto.RetrieveOrderConfirmationRequest;
import org.museframework.bian.paymentorder.dto.RetrieveOrderConfirmationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="PaymentOrder", group="OrderConfirmation")
public interface BqOrderConfirmation {
    @Description("ReBQ Retrieve details about a payment order confirmation process")
    RetrieveOrderConfirmationResponse retrieveOrderConfirmation(RetrieveOrderConfirmationRequest req);
}