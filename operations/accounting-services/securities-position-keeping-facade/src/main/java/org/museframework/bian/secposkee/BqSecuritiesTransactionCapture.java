package org.museframework.bian.secposkee;

import org.museframework.bian.secposkee.dto.CaptureSecuritiesTransactionCaptureRequest;
import org.museframework.bian.secposkee.dto.CaptureSecuritiesTransactionCaptureResponse;
import org.museframework.bian.secposkee.dto.RetrieveSecuritiesTransactionCaptureRequest;
import org.museframework.bian.secposkee.dto.RetrieveSecuritiesTransactionCaptureResponse;
import org.museframework.bian.secposkee.dto.UpdateSecuritiesTransactionCaptureRequest;
import org.museframework.bian.secposkee.dto.UpdateSecuritiesTransactionCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="SecuritiesPositionKeeping", group="SecuritiesTransactionCapture")
public interface BqSecuritiesTransactionCapture {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a captured securities transaction")
    UpdateSecuritiesTransactionCaptureResponse updateSecuritiesTransactionCapture(UpdateSecuritiesTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details of a securities transaction in the log")
    CaptureSecuritiesTransactionCaptureResponse captureSecuritiesTransactionCapture(CaptureSecuritiesTransactionCaptureRequest req);

    @Description("ReBQ Retrieve details of securities transactions captured in the log")
    RetrieveSecuritiesTransactionCaptureResponse retrieveSecuritiesTransactionCapture(RetrieveSecuritiesTransactionCaptureRequest req);
}