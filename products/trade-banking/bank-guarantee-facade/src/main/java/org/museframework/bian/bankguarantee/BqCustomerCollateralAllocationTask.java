package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ExchangeCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.bankguarantee.dto.ExecuteCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExecuteCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.bankguarantee.dto.InitiateCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.InitiateCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.bankguarantee.dto.NotifyCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.NotifyCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.bankguarantee.dto.RequestCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.RequestCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveCustomerCollateralAllocationTaskResponse;
import org.museframework.bian.bankguarantee.dto.UpdateCustomerCollateralAllocationTaskRequest;
import org.museframework.bian.bankguarantee.dto.UpdateCustomerCollateralAllocationTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankGuarantee", group="CustomerCollateralAllocationTask")
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