package org.museframework.bian.stolenandrep;

import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionCashTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionCashTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionCashTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionCashTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionCashTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionCashTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionCashTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionCashTransferTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Repo Transaction Cash Transfer Task is a discrete action or task that is required in the execution of the Repo Transaction Cash Transfer Task")
@GenericDomain(name="StockLendingandRepos", group="RepoTransactionCashTransferTask")
public interface BqRepoTransactionCashTransferTask {
    @GenericDtxEndpoint
    @Description("Exchange Repo Transaction Cash Transfer Task")
    ExchangeRepoTransactionCashTransferTaskResponse exchangeRepoTransactionCashTransferTask(ExchangeRepoTransactionCashTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Repo Transaction Cash Transfer Task")
    ExecuteRepoTransactionCashTransferTaskResponse executeRepoTransactionCashTransferTask(ExecuteRepoTransactionCashTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Repo Transaction Cash Transfer Task")
    InitiateRepoTransactionCashTransferTaskResponse initiateRepoTransactionCashTransferTask(InitiateRepoTransactionCashTransferTaskRequest req);

    @Description("Notify Repo Transaction Cash Transfer Task")
    NotifyRepoTransactionCashTransferTaskResponse notifyRepoTransactionCashTransferTask(NotifyRepoTransactionCashTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Repo Transaction Cash Transfer Task")
    RequestRepoTransactionCashTransferTaskResponse requestRepoTransactionCashTransferTask(RequestRepoTransactionCashTransferTaskRequest req);

    @Description("Retrieve Repo Transaction Cash Transfer Task")
    RetrieveRepoTransactionCashTransferTaskResponse retrieveRepoTransactionCashTransferTask(RetrieveRepoTransactionCashTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Repo Transaction Cash Transfer Task")
    UpdateRepoTransactionCashTransferTaskResponse updateRepoTransactionCashTransferTask(UpdateRepoTransactionCashTransferTaskRequest req);
}