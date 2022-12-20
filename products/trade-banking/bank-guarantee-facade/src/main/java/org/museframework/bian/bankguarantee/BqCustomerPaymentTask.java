package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ExchangeCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeCustomerPaymentTaskResponse;
import org.museframework.bian.bankguarantee.dto.ExecuteCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExecuteCustomerPaymentTaskResponse;
import org.museframework.bian.bankguarantee.dto.InitiateCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.InitiateCustomerPaymentTaskResponse;
import org.museframework.bian.bankguarantee.dto.NotifyCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.NotifyCustomerPaymentTaskResponse;
import org.museframework.bian.bankguarantee.dto.RequestCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.RequestCustomerPaymentTaskResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveCustomerPaymentTaskResponse;
import org.museframework.bian.bankguarantee.dto.UpdateCustomerPaymentTaskRequest;
import org.museframework.bian.bankguarantee.dto.UpdateCustomerPaymentTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankGuarantee", group="CustomerPaymentTask")
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