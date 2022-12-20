package org.museframework.bian.orderallocation;

import org.museframework.bian.orderallocation.dto.ExchangeUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.ExchangeUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.bian.orderallocation.dto.ExecuteUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.ExecuteUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.bian.orderallocation.dto.InitiateUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.InitiateUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.bian.orderallocation.dto.NotifyUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.NotifyUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.bian.orderallocation.dto.RequestUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.RequestUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.bian.orderallocation.dto.RetrieveUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.RetrieveUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.bian.orderallocation.dto.UpdateUpdate_PartiallyCompleted_MarketOrderWorkstepRequest;
import org.museframework.bian.orderallocation.dto.UpdateUpdate_PartiallyCompleted_MarketOrderWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Apply Order Allocation Rules Workstep in the context of executing the Apply Order Allocation Rules Workstep")
@GenericDomain(name="OrderAllocation", group="Update_PartiallyCompleted_MarketOrderWorkstep")
public interface BqUpdate_PartiallyCompleted_MarketOrderWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Update (Partially Completed) Market Order Workstep")
    ExchangeUpdate_PartiallyCompleted_MarketOrderWorkstepResponse exchangeUpdate_PartiallyCompleted_MarketOrderWorkstep(ExchangeUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Update (Partially Completed) Market Order Workstep")
    ExecuteUpdate_PartiallyCompleted_MarketOrderWorkstepResponse executeUpdate_PartiallyCompleted_MarketOrderWorkstep(ExecuteUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Update (Partially Completed) Market Order Workstep")
    InitiateUpdate_PartiallyCompleted_MarketOrderWorkstepResponse initiateUpdate_PartiallyCompleted_MarketOrderWorkstep(InitiateUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);

    @Description("Notify Update (Partially Completed) Market Order Workstep")
    NotifyUpdate_PartiallyCompleted_MarketOrderWorkstepResponse notifyUpdate_PartiallyCompleted_MarketOrderWorkstep(NotifyUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Update (Partially Completed) Market Order Workstep")
    RequestUpdate_PartiallyCompleted_MarketOrderWorkstepResponse requestUpdate_PartiallyCompleted_MarketOrderWorkstep(RequestUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);

    @Description("Retrieve Update (Partially Completed) Market Order Workstep")
    RetrieveUpdate_PartiallyCompleted_MarketOrderWorkstepResponse retrieveUpdate_PartiallyCompleted_MarketOrderWorkstep(RetrieveUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Update (Partially Completed) Market Order Workstep")
    UpdateUpdate_PartiallyCompleted_MarketOrderWorkstepResponse updateUpdate_PartiallyCompleted_MarketOrderWorkstep(UpdateUpdate_PartiallyCompleted_MarketOrderWorkstepRequest req);
}