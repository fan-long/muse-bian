package org.museframework.bian.atmnetope;

import org.museframework.bian.atmnetope.dto.ExchangeFinancialTransactionCaptureRequest;
import org.museframework.bian.atmnetope.dto.ExchangeFinancialTransactionCaptureResponse;
import org.museframework.bian.atmnetope.dto.ExecuteFinancialTransactionCaptureRequest;
import org.museframework.bian.atmnetope.dto.ExecuteFinancialTransactionCaptureResponse;
import org.museframework.bian.atmnetope.dto.InitiateFinancialTransactionCaptureRequest;
import org.museframework.bian.atmnetope.dto.InitiateFinancialTransactionCaptureResponse;
import org.museframework.bian.atmnetope.dto.RetrieveFinancialTransactionCaptureRequest;
import org.museframework.bian.atmnetope.dto.RetrieveFinancialTransactionCaptureResponse;
import org.museframework.bian.atmnetope.dto.UpdateFinancialTransactionCaptureRequest;
import org.museframework.bian.atmnetope.dto.UpdateFinancialTransactionCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within ATM Network Operations.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ATMNetworkOperations", group="FinancialTransactionCapture")
public interface BqFinancialTransactionCapture {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Financial Transaction Capture processing")
    ExchangeFinancialTransactionCaptureResponse exchangeFinancialTransactionCapture(ExchangeFinancialTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Financial Transaction Capture")
    ExecuteFinancialTransactionCaptureResponse executeFinancialTransactionCapture(ExecuteFinancialTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Financial Transaction Capture")
    InitiateFinancialTransactionCaptureResponse initiateFinancialTransactionCapture(InitiateFinancialTransactionCaptureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Financial Transaction Capture")
    RetrieveFinancialTransactionCaptureResponse retrieveFinancialTransactionCapture(RetrieveFinancialTransactionCaptureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Financial Transaction Capture")
    UpdateFinancialTransactionCaptureResponse updateFinancialTransactionCapture(UpdateFinancialTransactionCaptureRequest req);
}