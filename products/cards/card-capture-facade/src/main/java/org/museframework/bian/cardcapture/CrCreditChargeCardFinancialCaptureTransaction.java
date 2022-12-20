package org.museframework.bian.cardcapture;

import org.museframework.bian.cardcapture.dto.ControlCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.ControlCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.bian.cardcapture.dto.ExchangeCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.ExchangeCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.bian.cardcapture.dto.ExecuteCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.ExecuteCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.bian.cardcapture.dto.InitiateCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.InitiateCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.bian.cardcapture.dto.RequestCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.RequestCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.bian.cardcapture.dto.RetrieveCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.RetrieveCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.bian.cardcapture.dto.UpdateCreditChargeCardFinancialCaptureTransactionRequest;
import org.museframework.bian.cardcapture.dto.UpdateCreditChargeCardFinancialCaptureTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture.  Example: Execute a payment transaction.")
@GenericDomain(name="CardCapture", group="CreditChargeCardFinancialCaptureTransaction")
public interface CrCreditChargeCardFinancialCaptureTransaction {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Credit Charge Card Financial Capture Transaction")
    ControlCreditChargeCardFinancialCaptureTransactionResponse controlCreditChargeCardFinancialCaptureTransaction(ControlCreditChargeCardFinancialCaptureTransactionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Credit Charge Card Financial Capture Transaction processing")
    ExchangeCreditChargeCardFinancialCaptureTransactionResponse exchangeCreditChargeCardFinancialCaptureTransaction(ExchangeCreditChargeCardFinancialCaptureTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Credit Charge Card Financial Capture Transaction")
    ExecuteCreditChargeCardFinancialCaptureTransactionResponse executeCreditChargeCardFinancialCaptureTransaction(ExecuteCreditChargeCardFinancialCaptureTransactionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Credit Charge Card Financial Capture Transaction")
    InitiateCreditChargeCardFinancialCaptureTransactionResponse initiateCreditChargeCardFinancialCaptureTransaction(InitiateCreditChargeCardFinancialCaptureTransactionRequest req);

    @Description("ReCR Retrieve details about any aspect of Credit Charge Card Financial Capture Transaction")
    RetrieveCreditChargeCardFinancialCaptureTransactionResponse retrieveCreditChargeCardFinancialCaptureTransaction(RetrieveCreditChargeCardFinancialCaptureTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Credit Charge Card Financial Capture Transaction")
    RequestCreditChargeCardFinancialCaptureTransactionResponse requestCreditChargeCardFinancialCaptureTransaction(RequestCreditChargeCardFinancialCaptureTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Credit Charge Card Financial Capture Transaction")
    UpdateCreditChargeCardFinancialCaptureTransactionResponse updateCreditChargeCardFinancialCaptureTransaction(UpdateCreditChargeCardFinancialCaptureTransactionRequest req);
}