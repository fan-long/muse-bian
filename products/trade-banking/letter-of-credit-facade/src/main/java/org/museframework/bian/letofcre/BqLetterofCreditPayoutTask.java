package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ExchangeLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.ExchangeLetterofCreditPayoutTaskResponse;
import org.museframework.bian.letofcre.dto.ExecuteLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.ExecuteLetterofCreditPayoutTaskResponse;
import org.museframework.bian.letofcre.dto.InitiateLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.InitiateLetterofCreditPayoutTaskResponse;
import org.museframework.bian.letofcre.dto.NotifyLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.NotifyLetterofCreditPayoutTaskResponse;
import org.museframework.bian.letofcre.dto.RequestLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.RequestLetterofCreditPayoutTaskResponse;
import org.museframework.bian.letofcre.dto.RetrieveLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.RetrieveLetterofCreditPayoutTaskResponse;
import org.museframework.bian.letofcre.dto.UpdateLetterofCreditPayoutTaskRequest;
import org.museframework.bian.letofcre.dto.UpdateLetterofCreditPayoutTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task")
@GenericDomain(name="LetterofCredit", group="LetterofCreditPayoutTask")
public interface BqLetterofCreditPayoutTask {
    @GenericDtxEndpoint
    @Description("Exchange Letter of Credit Payout Task")
    ExchangeLetterofCreditPayoutTaskResponse exchangeLetterofCreditPayoutTask(ExchangeLetterofCreditPayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Letter of Credit Payout Task")
    ExecuteLetterofCreditPayoutTaskResponse executeLetterofCreditPayoutTask(ExecuteLetterofCreditPayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Letter of Credit Payout Task")
    InitiateLetterofCreditPayoutTaskResponse initiateLetterofCreditPayoutTask(InitiateLetterofCreditPayoutTaskRequest req);

    @Description("Notify Letter of Credit Payout Task")
    NotifyLetterofCreditPayoutTaskResponse notifyLetterofCreditPayoutTask(NotifyLetterofCreditPayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Letter of Credit Payout Task")
    RequestLetterofCreditPayoutTaskResponse requestLetterofCreditPayoutTask(RequestLetterofCreditPayoutTaskRequest req);

    @Description("Retrieve Letter of Credit Payout Task")
    RetrieveLetterofCreditPayoutTaskResponse retrieveLetterofCreditPayoutTask(RetrieveLetterofCreditPayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Letter of Credit Payout Task")
    UpdateLetterofCreditPayoutTaskResponse updateLetterofCreditPayoutTask(UpdateLetterofCreditPayoutTaskRequest req);
}