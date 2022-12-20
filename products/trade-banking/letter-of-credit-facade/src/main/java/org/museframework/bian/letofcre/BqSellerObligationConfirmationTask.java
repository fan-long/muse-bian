package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ExchangeSellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.ExchangeSellerObligationConfirmationTaskResponse;
import org.museframework.bian.letofcre.dto.ExecuteSellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.ExecuteSellerObligationConfirmationTaskResponse;
import org.museframework.bian.letofcre.dto.InitiateSellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.InitiateSellerObligationConfirmationTaskResponse;
import org.museframework.bian.letofcre.dto.NotifySellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.NotifySellerObligationConfirmationTaskResponse;
import org.museframework.bian.letofcre.dto.RequestSellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.RequestSellerObligationConfirmationTaskResponse;
import org.museframework.bian.letofcre.dto.RetrieveSellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.RetrieveSellerObligationConfirmationTaskResponse;
import org.museframework.bian.letofcre.dto.UpdateSellerObligationConfirmationTaskRequest;
import org.museframework.bian.letofcre.dto.UpdateSellerObligationConfirmationTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task")
@GenericDomain(name="LetterofCredit", group="SellerObligationConfirmationTask")
public interface BqSellerObligationConfirmationTask {
    @GenericDtxEndpoint
    @Description("Exchange Seller Obligation Confirmation Task")
    ExchangeSellerObligationConfirmationTaskResponse exchangeSellerObligationConfirmationTask(ExchangeSellerObligationConfirmationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Seller Obligation Confirmation Task")
    ExecuteSellerObligationConfirmationTaskResponse executeSellerObligationConfirmationTask(ExecuteSellerObligationConfirmationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Seller Obligation Confirmation Task")
    InitiateSellerObligationConfirmationTaskResponse initiateSellerObligationConfirmationTask(InitiateSellerObligationConfirmationTaskRequest req);

    @Description("Notify Seller Obligation Confirmation Task")
    NotifySellerObligationConfirmationTaskResponse notifySellerObligationConfirmationTask(NotifySellerObligationConfirmationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Seller Obligation Confirmation Task")
    RequestSellerObligationConfirmationTaskResponse requestSellerObligationConfirmationTask(RequestSellerObligationConfirmationTaskRequest req);

    @Description("Retrieve Seller Obligation Confirmation Task")
    RetrieveSellerObligationConfirmationTaskResponse retrieveSellerObligationConfirmationTask(RetrieveSellerObligationConfirmationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Seller Obligation Confirmation Task")
    UpdateSellerObligationConfirmationTaskResponse updateSellerObligationConfirmationTask(UpdateSellerObligationConfirmationTaskRequest req);
}