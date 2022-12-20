package org.museframework.bian.paymentexecution;

import org.museframework.bian.paymentexecution.dto.RetrievePaymentExecutionWorkstepRequest;
import org.museframework.bian.paymentexecution.dto.RetrievePaymentExecutionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="PaymentExecution", group="PaymentExecutionWorkstep")
public interface BqPaymentExecutionWorkstep {
    @Description("ReBQ Retrieve details about the gateway transaction")
    RetrievePaymentExecutionWorkstepResponse retrievePaymentExecutionWorkstep(RetrievePaymentExecutionWorkstepRequest req);
}