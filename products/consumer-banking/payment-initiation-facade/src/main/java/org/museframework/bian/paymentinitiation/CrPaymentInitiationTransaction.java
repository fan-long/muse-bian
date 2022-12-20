package org.museframework.bian.paymentinitiation;

import org.museframework.bian.paymentinitiation.dto.InitiatePaymentInitiationTransactionRequest;
import org.museframework.bian.paymentinitiation.dto.InitiatePaymentInitiationTransactionResponse;
import org.museframework.bian.paymentinitiation.dto.RetrievePaymentInitiationTransactionRequest;
import org.museframework.bian.paymentinitiation.dto.RetrievePaymentInitiationTransactionResponse;
import org.museframework.bian.paymentinitiation.dto.UpdatePaymentInitiationTransactionRequest;
import org.museframework.bian.paymentinitiation.dto.UpdatePaymentInitiationTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Payment Initiation. ")
@GenericDomain(name="PaymentInitiation", group="PaymentInitiationTransaction")
public interface CrPaymentInitiationTransaction {
    @GenericDtxEndpoint
    @Description("InCR Initiate a payment transaction")
    InitiatePaymentInitiationTransactionResponse initiatePaymentInitiationTransaction(InitiatePaymentInitiationTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a payment transaction instruction")
    UpdatePaymentInitiationTransactionResponse updatePaymentInitiationTransaction(UpdatePaymentInitiationTransactionRequest req);

    @Description("ReCR Retrieve details about a payment transaction")
    RetrievePaymentInitiationTransactionResponse retrievePaymentInitiationTransaction(RetrievePaymentInitiationTransactionRequest req);
}