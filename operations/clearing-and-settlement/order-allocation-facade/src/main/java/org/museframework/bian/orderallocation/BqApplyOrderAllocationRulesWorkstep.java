package org.museframework.bian.orderallocation;

import org.museframework.bian.orderallocation.dto.ExchangeApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.ExchangeApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.bian.orderallocation.dto.ExecuteApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.ExecuteApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.bian.orderallocation.dto.InitiateApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.InitiateApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.bian.orderallocation.dto.NotifyApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.NotifyApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.bian.orderallocation.dto.RequestApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.RequestApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.bian.orderallocation.dto.RetrieveApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.RetrieveApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.bian.orderallocation.dto.UpdateApplyOrderAllocationRulesWorkstepRequest;
import org.museframework.bian.orderallocation.dto.UpdateApplyOrderAllocationRulesWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Apply Order Allocation Rules Workstep in the context of executing the Apply Order Allocation Rules Workstep")
@GenericDomain(name="OrderAllocation", group="ApplyOrderAllocationRulesWorkstep")
public interface BqApplyOrderAllocationRulesWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Apply Order Allocation Rules Workstep")
    ExchangeApplyOrderAllocationRulesWorkstepResponse exchangeApplyOrderAllocationRulesWorkstep(ExchangeApplyOrderAllocationRulesWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Apply Order Allocation Rules Workstep")
    ExecuteApplyOrderAllocationRulesWorkstepResponse executeApplyOrderAllocationRulesWorkstep(ExecuteApplyOrderAllocationRulesWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Apply Order Allocation Rules Workstep")
    InitiateApplyOrderAllocationRulesWorkstepResponse initiateApplyOrderAllocationRulesWorkstep(InitiateApplyOrderAllocationRulesWorkstepRequest req);

    @Description("Notify Apply Order Allocation Rules Workstep")
    NotifyApplyOrderAllocationRulesWorkstepResponse notifyApplyOrderAllocationRulesWorkstep(NotifyApplyOrderAllocationRulesWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Apply Order Allocation Rules Workstep")
    RequestApplyOrderAllocationRulesWorkstepResponse requestApplyOrderAllocationRulesWorkstep(RequestApplyOrderAllocationRulesWorkstepRequest req);

    @Description("Retrieve Apply Order Allocation Rules Workstep")
    RetrieveApplyOrderAllocationRulesWorkstepResponse retrieveApplyOrderAllocationRulesWorkstep(RetrieveApplyOrderAllocationRulesWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Apply Order Allocation Rules Workstep")
    UpdateApplyOrderAllocationRulesWorkstepResponse updateApplyOrderAllocationRulesWorkstep(UpdateApplyOrderAllocationRulesWorkstepRequest req);
}