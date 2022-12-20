package org.museframework.bian.cardcapture;

import org.museframework.bian.cardcapture.dto.InitiateTransactionAuthorizationRequest;
import org.museframework.bian.cardcapture.dto.InitiateTransactionAuthorizationResponse;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionAuthorizationRequest;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionAuthorizationResponse;
import org.museframework.bian.cardcapture.dto.UpdateTransactionAuthorizationRequest;
import org.museframework.bian.cardcapture.dto.UpdateTransactionAuthorizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture.  Example: Execute a payment transaction.")
@GenericDomain(name="CardCapture", group="TransactionAuthorization")
public interface BqTransactionAuthorization {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Transaction Authorization")
    InitiateTransactionAuthorizationResponse initiateTransactionAuthorization(InitiateTransactionAuthorizationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Transaction Authorization")
    RetrieveTransactionAuthorizationResponse retrieveTransactionAuthorization(RetrieveTransactionAuthorizationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Transaction Authorization")
    UpdateTransactionAuthorizationResponse updateTransactionAuthorization(UpdateTransactionAuthorizationRequest req);
}