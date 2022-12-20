package org.museframework.bian.currencyexchange;

import org.museframework.bian.currencyexchange.dto.ExchangeFXTransactionCaptureRequest;
import org.museframework.bian.currencyexchange.dto.ExchangeFXTransactionCaptureResponse;
import org.museframework.bian.currencyexchange.dto.InitiateFXTransactionCaptureRequest;
import org.museframework.bian.currencyexchange.dto.InitiateFXTransactionCaptureResponse;
import org.museframework.bian.currencyexchange.dto.RetrieveFXTransactionCaptureRequest;
import org.museframework.bian.currencyexchange.dto.RetrieveFXTransactionCaptureResponse;
import org.museframework.bian.currencyexchange.dto.UpdateFXTransactionCaptureRequest;
import org.museframework.bian.currencyexchange.dto.UpdateFXTransactionCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange.  Example: Execute a payment transaction.")
@GenericDomain(name="CurrencyExchange", group="FXTransactionCapture")
public interface BqFXTransactionCapture {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of FX Transaction Capture processing")
    ExchangeFXTransactionCaptureResponse exchangeFXTransactionCapture(ExchangeFXTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new FX Transaction Capture")
    InitiateFXTransactionCaptureResponse initiateFXTransactionCapture(InitiateFXTransactionCaptureRequest req);

    @Description("ReBQ Retrieve details about any aspect of FX Transaction Capture")
    RetrieveFXTransactionCaptureResponse retrieveFXTransactionCapture(RetrieveFXTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to FX Transaction Capture")
    UpdateFXTransactionCaptureResponse updateFXTransactionCapture(UpdateFXTransactionCaptureRequest req);
}