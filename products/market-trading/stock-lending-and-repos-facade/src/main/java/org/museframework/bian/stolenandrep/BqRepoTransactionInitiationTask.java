package org.museframework.bian.stolenandrep;

import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionInitiationTaskResponse;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionInitiationTaskResponse;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionInitiationTaskResponse;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionInitiationTaskResponse;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionInitiationTaskResponse;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionInitiationTaskResponse;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionInitiationTaskRequest;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionInitiationTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Repo Transaction Cash Transfer Task is a discrete action or task that is required in the execution of the Repo Transaction Cash Transfer Task")
@GenericDomain(name="StockLendingandRepos", group="RepoTransactionInitiationTask")
public interface BqRepoTransactionInitiationTask {
    @GenericDtxEndpoint
    @Description("Exchange Repo Transaction Initiation Task")
    ExchangeRepoTransactionInitiationTaskResponse exchangeRepoTransactionInitiationTask(ExchangeRepoTransactionInitiationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Repo Transaction Initiation Task")
    ExecuteRepoTransactionInitiationTaskResponse executeRepoTransactionInitiationTask(ExecuteRepoTransactionInitiationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Repo Transaction Initiation Task")
    InitiateRepoTransactionInitiationTaskResponse initiateRepoTransactionInitiationTask(InitiateRepoTransactionInitiationTaskRequest req);

    @Description("Notify Repo Transaction Initiation Task")
    NotifyRepoTransactionInitiationTaskResponse notifyRepoTransactionInitiationTask(NotifyRepoTransactionInitiationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Repo Transaction Initiation Task")
    RequestRepoTransactionInitiationTaskResponse requestRepoTransactionInitiationTask(RequestRepoTransactionInitiationTaskRequest req);

    @Description("Retrieve Repo Transaction Initiation Task")
    RetrieveRepoTransactionInitiationTaskResponse retrieveRepoTransactionInitiationTask(RetrieveRepoTransactionInitiationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Repo Transaction Initiation Task")
    UpdateRepoTransactionInitiationTaskResponse updateRepoTransactionInitiationTask(UpdateRepoTransactionInitiationTaskRequest req);
}