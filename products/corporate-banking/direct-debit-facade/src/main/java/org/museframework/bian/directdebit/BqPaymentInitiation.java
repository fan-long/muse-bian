package org.museframework.bian.directdebit;

import org.museframework.bian.directdebit.dto.ExecutePaymentInitiationRequest;
import org.museframework.bian.directdebit.dto.ExecutePaymentInitiationResponse;
import org.museframework.bian.directdebit.dto.RetrievePaymentInitiationRequest;
import org.museframework.bian.directdebit.dto.RetrievePaymentInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Batch Debit arrangement within the Direct Debit Facility")
@GenericDomain(name="DirectDebit", group="PaymentInitiation")
public interface BqPaymentInitiation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Payment Initiation processing")
    ExecutePaymentInitiationResponse executePaymentInitiation(ExecutePaymentInitiationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payment Initiation")
    RetrievePaymentInitiationResponse retrievePaymentInitiation(RetrievePaymentInitiationRequest req);
}