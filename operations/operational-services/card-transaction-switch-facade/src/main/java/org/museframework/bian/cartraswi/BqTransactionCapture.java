package org.museframework.bian.cartraswi;

import org.museframework.bian.cartraswi.dto.InitiateTransactionCaptureRequest;
import org.museframework.bian.cartraswi.dto.InitiateTransactionCaptureResponse;
import org.museframework.bian.cartraswi.dto.RetrieveTransactionCaptureRequest;
import org.museframework.bian.cartraswi.dto.RetrieveTransactionCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardTransactionSwitch", group="TransactionCapture")
public interface BqTransactionCapture {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a card transaction switch capture function")
    InitiateTransactionCaptureResponse initiateTransactionCapture(InitiateTransactionCaptureRequest req);

    @Description("ReBQ Retrieve details about a card capture transaction")
    RetrieveTransactionCaptureResponse retrieveTransactionCapture(RetrieveTransactionCaptureRequest req);
}