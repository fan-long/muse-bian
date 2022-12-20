package org.museframework.bian.disbursement;

import org.museframework.bian.disbursement.dto.ExecuteDisbursementTransactionRequest;
import org.museframework.bian.disbursement.dto.ExecuteDisbursementTransactionResponse;
import org.museframework.bian.disbursement.dto.InitiateDisbursementTransactionRequest;
import org.museframework.bian.disbursement.dto.InitiateDisbursementTransactionResponse;
import org.museframework.bian.disbursement.dto.RequestDisbursementTransactionRequest;
import org.museframework.bian.disbursement.dto.RequestDisbursementTransactionResponse;
import org.museframework.bian.disbursement.dto.RetrieveDisbursementTransactionRequest;
import org.museframework.bian.disbursement.dto.RetrieveDisbursementTransactionResponse;
import org.museframework.bian.disbursement.dto.UpdateDisbursementTransactionRequest;
import org.museframework.bian.disbursement.dto.UpdateDisbursementTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Disbursement. ")
@GenericDomain(name="Disbursement", group="DisbursementTransaction")
public interface CrDisbursementTransaction {
    @GenericDtxEndpoint
    @Description("InCR Initiate a disbursement")
    InitiateDisbursementTransactionResponse initiateDisbursementTransaction(InitiateDisbursementTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a disbursement")
    UpdateDisbursementTransactionResponse updateDisbursementTransaction(UpdateDisbursementTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task against an active disbursement")
    ExecuteDisbursementTransactionResponse executeDisbursementTransaction(ExecuteDisbursementTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with a disbursement transaction")
    RequestDisbursementTransactionResponse requestDisbursementTransaction(RequestDisbursementTransactionRequest req);

    @Description("ReCR Retrieve details about a disbursement transaction")
    RetrieveDisbursementTransactionResponse retrieveDisbursementTransaction(RetrieveDisbursementTransactionRequest req);
}