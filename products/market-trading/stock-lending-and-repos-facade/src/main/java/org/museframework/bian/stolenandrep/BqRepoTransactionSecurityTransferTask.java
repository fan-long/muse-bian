package org.museframework.bian.stolenandrep;

import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.ExchangeRepoTransactionSecurityTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.ExecuteRepoTransactionSecurityTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.InitiateRepoTransactionSecurityTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.NotifyRepoTransactionSecurityTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.RequestRepoTransactionSecurityTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.RetrieveRepoTransactionSecurityTransferTaskResponse;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionSecurityTransferTaskRequest;
import org.museframework.bian.stolenandrep.dto.UpdateRepoTransactionSecurityTransferTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Repo Transaction Cash Transfer Task is a discrete action or task that is required in the execution of the Repo Transaction Cash Transfer Task")
@GenericDomain(name="StockLendingandRepos", group="RepoTransactionSecurityTransferTask")
public interface BqRepoTransactionSecurityTransferTask {
    @GenericDtxEndpoint
    @Description("Exchange Repo Transaction Security Transfer Task")
    ExchangeRepoTransactionSecurityTransferTaskResponse exchangeRepoTransactionSecurityTransferTask(ExchangeRepoTransactionSecurityTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Repo Transaction Security Transfer Task")
    ExecuteRepoTransactionSecurityTransferTaskResponse executeRepoTransactionSecurityTransferTask(ExecuteRepoTransactionSecurityTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Repo Transaction Security Transfer Task")
    InitiateRepoTransactionSecurityTransferTaskResponse initiateRepoTransactionSecurityTransferTask(InitiateRepoTransactionSecurityTransferTaskRequest req);

    @Description("Notify Repo Transaction Security Transfer Task")
    NotifyRepoTransactionSecurityTransferTaskResponse notifyRepoTransactionSecurityTransferTask(NotifyRepoTransactionSecurityTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Repo Transaction Security Transfer Task")
    RequestRepoTransactionSecurityTransferTaskResponse requestRepoTransactionSecurityTransferTask(RequestRepoTransactionSecurityTransferTaskRequest req);

    @Description("Retrieve Repo Transaction Security Transfer Task")
    RetrieveRepoTransactionSecurityTransferTaskResponse retrieveRepoTransactionSecurityTransferTask(RetrieveRepoTransactionSecurityTransferTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Repo Transaction Security Transfer Task")
    UpdateRepoTransactionSecurityTransferTaskResponse updateRepoTransactionSecurityTransferTask(UpdateRepoTransactionSecurityTransferTaskRequest req);
}