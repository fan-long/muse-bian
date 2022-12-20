package org.museframework.bian.positionkeeping;

import org.museframework.bian.positionkeeping.dto.CaptureFinancialTransactionCaptureRequest;
import org.museframework.bian.positionkeeping.dto.CaptureFinancialTransactionCaptureResponse;
import org.museframework.bian.positionkeeping.dto.RetrieveFinancialTransactionCaptureRequest;
import org.museframework.bian.positionkeeping.dto.RetrieveFinancialTransactionCaptureResponse;
import org.museframework.bian.positionkeeping.dto.UpdateFinancialTransactionCaptureRequest;
import org.museframework.bian.positionkeeping.dto.UpdateFinancialTransactionCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="PositionKeeping", group="FinancialTransactionCapture")
public interface BqFinancialTransactionCapture {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a captured financial transaction")
    UpdateFinancialTransactionCaptureResponse updateFinancialTransactionCapture(UpdateFinancialTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details of a financial transaction in the log")
    CaptureFinancialTransactionCaptureResponse captureFinancialTransactionCapture(CaptureFinancialTransactionCaptureRequest req);

    @Description("ReBQ Retrieve details of financial transactions captured in the log")
    RetrieveFinancialTransactionCaptureResponse retrieveFinancialTransactionCapture(RetrieveFinancialTransactionCaptureRequest req);
}