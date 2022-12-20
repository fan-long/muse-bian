package org.museframework.bian.paymentexecution;

import org.museframework.bian.paymentexecution.dto.RetrievePaymentMechanismRequest;
import org.museframework.bian.paymentexecution.dto.RetrievePaymentMechanismResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="PaymentExecution", group="PaymentMechanism")
public interface BqPaymentMechanism {
    @Description("ReBQ Retrieve details about the payment mechanism selection")
    RetrievePaymentMechanismResponse retrievePaymentMechanism(RetrievePaymentMechanismRequest req);
}