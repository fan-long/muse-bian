package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ExchangeLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.ExchangeLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.bian.letofcre.dto.ExecuteLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.ExecuteLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.bian.letofcre.dto.InitiateLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.InitiateLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.bian.letofcre.dto.NotifyLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.NotifyLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.bian.letofcre.dto.RequestLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.RequestLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.bian.letofcre.dto.RetrieveLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.RetrieveLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.bian.letofcre.dto.UpdateLetterofCreditIssuanceandBookingTaskRequest;
import org.museframework.bian.letofcre.dto.UpdateLetterofCreditIssuanceandBookingTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task")
@GenericDomain(name="LetterofCredit", group="LetterofCreditIssuanceandBookingTask")
public interface BqLetterofCreditIssuanceandBookingTask {
    @GenericDtxEndpoint
    @Description("Exchange Letter of Credit Issuance and Booking Task")
    ExchangeLetterofCreditIssuanceandBookingTaskResponse exchangeLetterofCreditIssuanceandBookingTask(ExchangeLetterofCreditIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Letter of Credit Issuance and Booking Task")
    ExecuteLetterofCreditIssuanceandBookingTaskResponse executeLetterofCreditIssuanceandBookingTask(ExecuteLetterofCreditIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Letter of Credit Issuance and Booking Task")
    InitiateLetterofCreditIssuanceandBookingTaskResponse initiateLetterofCreditIssuanceandBookingTask(InitiateLetterofCreditIssuanceandBookingTaskRequest req);

    @Description("Notify Letter of Credit Issuance and Booking Task")
    NotifyLetterofCreditIssuanceandBookingTaskResponse notifyLetterofCreditIssuanceandBookingTask(NotifyLetterofCreditIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Letter of Credit Issuance and Booking Task")
    RequestLetterofCreditIssuanceandBookingTaskResponse requestLetterofCreditIssuanceandBookingTask(RequestLetterofCreditIssuanceandBookingTaskRequest req);

    @Description("Retrieve Letter of Credit Issuance and Booking Task")
    RetrieveLetterofCreditIssuanceandBookingTaskResponse retrieveLetterofCreditIssuanceandBookingTask(RetrieveLetterofCreditIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Letter of Credit Issuance and Booking Task")
    UpdateLetterofCreditIssuanceandBookingTaskResponse updateLetterofCreditIssuanceandBookingTask(UpdateLetterofCreditIssuanceandBookingTaskRequest req);
}