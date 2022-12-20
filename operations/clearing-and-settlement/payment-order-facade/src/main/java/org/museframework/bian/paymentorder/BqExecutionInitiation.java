package org.museframework.bian.paymentorder;

import org.museframework.bian.paymentorder.dto.RetrieveExecutionInitiationRequest;
import org.museframework.bian.paymentorder.dto.RetrieveExecutionInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="PaymentOrder", group="ExecutionInitiation")
public interface BqExecutionInitiation {
    @Description("ReBQ Retrieve details about the payment execution processing")
    RetrieveExecutionInitiationResponse retrieveExecutionInitiation(RetrieveExecutionInitiationRequest req);
}