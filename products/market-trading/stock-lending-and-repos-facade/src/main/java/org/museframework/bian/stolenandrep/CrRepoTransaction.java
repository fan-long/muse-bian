package org.museframework.bian.stolenandrep;

import org.museframework.bian.stolenandrep.dto.ControlRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.ControlRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionResponse;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionRequest;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Stock Lending and Repos. ")
@GenericDomain(name="StockLendingandRepos", group="RepoTransaction")
public interface CrRepoTransaction {
    @GenericDtxEndpoint
    @Description("Control Repo Transaction")
    ControlRepoTransactionResponse controlRepoTransaction(ControlRepoTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Repo Transaction")
    ExchangeRepoTransactionResponse exchangeRepoTransaction(ExchangeRepoTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Repo Transaction")
    ExecuteRepoTransactionResponse executeRepoTransaction(ExecuteRepoTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Repo Transaction")
    InitiateRepoTransactionResponse initiateRepoTransaction(InitiateRepoTransactionRequest req);

    @Description("Notify Repo Transaction")
    NotifyRepoTransactionResponse notifyRepoTransaction(NotifyRepoTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Request Repo Transaction")
    RequestRepoTransactionResponse requestRepoTransaction(RequestRepoTransactionRequest req);

    @Description("Retrieve Repo Transaction")
    RetrieveRepoTransactionResponse retrieveRepoTransaction(RetrieveRepoTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Update Repo Transaction")
    UpdateRepoTransactionResponse updateRepoTransaction(UpdateRepoTransactionRequest req);
}