package org.museframework.bian.cardcapture;

import org.museframework.bian.cardcapture.dto.ControlTransactionConsolidationRequest;
import org.museframework.bian.cardcapture.dto.ControlTransactionConsolidationResponse;
import org.museframework.bian.cardcapture.dto.ExchangeTransactionConsolidationRequest;
import org.museframework.bian.cardcapture.dto.ExchangeTransactionConsolidationResponse;
import org.museframework.bian.cardcapture.dto.ExecuteTransactionConsolidationRequest;
import org.museframework.bian.cardcapture.dto.ExecuteTransactionConsolidationResponse;
import org.museframework.bian.cardcapture.dto.InitiateTransactionConsolidationRequest;
import org.museframework.bian.cardcapture.dto.InitiateTransactionConsolidationResponse;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionConsolidationRequest;
import org.museframework.bian.cardcapture.dto.RetrieveTransactionConsolidationResponse;
import org.museframework.bian.cardcapture.dto.UpdateTransactionConsolidationRequest;
import org.museframework.bian.cardcapture.dto.UpdateTransactionConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture.  Example: Execute a payment transaction.")
@GenericDomain(name="CardCapture", group="TransactionConsolidation")
public interface BqTransactionConsolidation {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Transaction Consolidation")
    ControlTransactionConsolidationResponse controlTransactionConsolidation(ControlTransactionConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Transaction Consolidation processing")
    ExchangeTransactionConsolidationResponse exchangeTransactionConsolidation(ExchangeTransactionConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Transaction Consolidation")
    ExecuteTransactionConsolidationResponse executeTransactionConsolidation(ExecuteTransactionConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Transaction Consolidation")
    InitiateTransactionConsolidationResponse initiateTransactionConsolidation(InitiateTransactionConsolidationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Transaction Consolidation")
    RetrieveTransactionConsolidationResponse retrieveTransactionConsolidation(RetrieveTransactionConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Transaction Consolidation")
    UpdateTransactionConsolidationResponse updateTransactionConsolidation(UpdateTransactionConsolidationRequest req);
}