package org.museframework.bian.cardcapture;

import org.museframework.bian.cardcapture.dto.InitiateTransactionCaptureRequest;
import org.museframework.bian.cardcapture.dto.InitiateTransactionCaptureResponse;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionCaptureRequest;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionCaptureResponse;
import org.museframework.bian.cardcapture.dto.UpdateTransactionCaptureRequest;
import org.museframework.bian.cardcapture.dto.UpdateTransactionCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture.  Example: Execute a payment transaction.")
@GenericDomain(name="CardCapture", group="TransactionCapture")
public interface BqTransactionCapture {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Transaction Capture")
    InitiateTransactionCaptureResponse initiateTransactionCapture(InitiateTransactionCaptureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Transaction Capture")
    RetrieveTransactionCaptureResponse retrieveTransactionCapture(RetrieveTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Transaction Capture")
    UpdateTransactionCaptureResponse updateTransactionCapture(UpdateTransactionCaptureRequest req);
}