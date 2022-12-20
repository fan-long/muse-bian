package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ExchangeCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.ExchangeCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.letofcre.dto.ExecuteCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.ExecuteCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.letofcre.dto.InitiateCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.InitiateCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.letofcre.dto.NotifyCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.NotifyCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.letofcre.dto.RequestCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.RequestCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.letofcre.dto.RetrieveCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.RetrieveCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.letofcre.dto.UpdateCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.letofcre.dto.UpdateCustomerCollateralAllocationTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task")
@GenericDomain(name="LetterofCredit", group="CustomerCollateralAllocationTask")
public interface BqCustomerCollateralAllocationTask {
    @GenericDtxEndpoint
    @Description("Exchange Customer Collateral Allocation Task")
    ExchangeCustomerCollateralAllocationTaskResponse exchangeCustomerCollateralAllocationTask(ExchangeCustomerCollateralAllocationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Customer Collateral Allocation Task")
    ExecuteCustomerCollateralAllocationTaskResponse executeCustomerCollateralAllocationTask(ExecuteCustomerCollateralAllocationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Customer Collateral Allocation Task")
    InitiateCustomerCollateralAllocationTaskResponse initiateCustomerCollateralAllocationTask(InitiateCustomerCollateralAllocationTaskRequest req);

    @Description("Notify Customer Collateral Allocation Task")
    NotifyCustomerCollateralAllocationTaskResponse notifyCustomerCollateralAllocationTask(NotifyCustomerCollateralAllocationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Customer Collateral Allocation Task")
    RequestCustomerCollateralAllocationTaskResponse requestCustomerCollateralAllocationTask(RequestCustomerCollateralAllocationTaskRequest req);

    @Description("Retrieve Customer Collateral Allocation Task")
    RetrieveCustomerCollateralAllocationTaskResponse retrieveCustomerCollateralAllocationTask(RetrieveCustomerCollateralAllocationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Customer Collateral Allocation Task")
    UpdateCustomerCollateralAllocationTaskResponse updateCustomerCollateralAllocationTask(UpdateCustomerCollateralAllocationTaskRequest req);
}