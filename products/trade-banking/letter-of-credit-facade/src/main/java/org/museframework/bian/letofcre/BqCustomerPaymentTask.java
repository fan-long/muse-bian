package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ExchangeCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.ExchangeCustomerPaymentTaskResponse;
import org.museframework.bian.letofcre.dto.ExecuteCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.ExecuteCustomerPaymentTaskResponse;
import org.museframework.bian.letofcre.dto.InitiateCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.InitiateCustomerPaymentTaskResponse;
import org.museframework.bian.letofcre.dto.NotifyCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.NotifyCustomerPaymentTaskResponse;
import org.museframework.bian.letofcre.dto.RequestCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.RequestCustomerPaymentTaskResponse;
import org.museframework.bian.letofcre.dto.RetrieveCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.RetrieveCustomerPaymentTaskResponse;
import org.museframework.bian.letofcre.dto.UpdateCustomerPaymentTaskRequest;
import org.museframework.bian.letofcre.dto.UpdateCustomerPaymentTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task")
@GenericDomain(name="LetterofCredit", group="CustomerPaymentTask")
public interface BqCustomerPaymentTask {
    @GenericDtxEndpoint
    @Description("Exchange Customer Payment Task")
    ExchangeCustomerPaymentTaskResponse exchangeCustomerPaymentTask(ExchangeCustomerPaymentTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Customer Payment Task")
    ExecuteCustomerPaymentTaskResponse executeCustomerPaymentTask(ExecuteCustomerPaymentTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Customer Payment Task")
    InitiateCustomerPaymentTaskResponse initiateCustomerPaymentTask(InitiateCustomerPaymentTaskRequest req);

    @Description("Notify Customer Payment Task")
    NotifyCustomerPaymentTaskResponse notifyCustomerPaymentTask(NotifyCustomerPaymentTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Customer Payment Task")
    RequestCustomerPaymentTaskResponse requestCustomerPaymentTask(RequestCustomerPaymentTaskRequest req);

    @Description("Retrieve Customer Payment Task")
    RetrieveCustomerPaymentTaskResponse retrieveCustomerPaymentTask(RetrieveCustomerPaymentTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Customer Payment Task")
    UpdateCustomerPaymentTaskResponse updateCustomerPaymentTask(UpdateCustomerPaymentTaskRequest req);
}