package org.museframework.bian.paymentinitiation;

import org.museframework.bian.paymentinitiation.dto.RetrieveOrderInitiationRequest;
import org.museframework.bian.paymentinitiation.dto.RetrieveOrderInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="PaymentInitiation", group="OrderInitiation")
public interface BqOrderInitiation {
    @Description("ReBQ Retrieve details about the payment order initiation")
    RetrieveOrderInitiationResponse retrieveOrderInitiation(RetrieveOrderInitiationRequest req);
}