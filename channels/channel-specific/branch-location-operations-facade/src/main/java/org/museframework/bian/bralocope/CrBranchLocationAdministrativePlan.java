package org.museframework.bian.bralocope;

import org.museframework.bian.bralocope.dto.ControlBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.ControlBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.CreateBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.CreateBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.ExchangeBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.ExchangeBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.GrantBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.GrantBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.NotifyBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.NotifyBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.RequestBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.RequestBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.RetrieveBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.RetrieveBranchLocationAdministrativePlanResponse;
import org.museframework.bian.bralocope.dto.UpdateBranchLocationAdministrativePlanRequest;
import org.museframework.bian.bralocope.dto.UpdateBranchLocationAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Branch Location Operations. ")
@GenericDomain(name="BranchLocationOperations", group="BranchLocationAdministrativePlan")
public interface CrBranchLocationAdministrativePlan {
    @GenericDtxEndpoint
    @Description("Control Branch Location Administrative Plan")
    ControlBranchLocationAdministrativePlanResponse controlBranchLocationAdministrativePlan(ControlBranchLocationAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Branch Location Administrative Plan")
    CreateBranchLocationAdministrativePlanResponse createBranchLocationAdministrativePlan(CreateBranchLocationAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Branch Location Administrative Plan")
    ExchangeBranchLocationAdministrativePlanResponse exchangeBranchLocationAdministrativePlan(ExchangeBranchLocationAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Branch Location Administrative Plan")
    GrantBranchLocationAdministrativePlanResponse grantBranchLocationAdministrativePlan(GrantBranchLocationAdministrativePlanRequest req);

    @Description("Notify Branch Location Administrative Plan")
    NotifyBranchLocationAdministrativePlanResponse notifyBranchLocationAdministrativePlan(NotifyBranchLocationAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Branch Location Administrative Plan")
    RequestBranchLocationAdministrativePlanResponse requestBranchLocationAdministrativePlan(RequestBranchLocationAdministrativePlanRequest req);

    @Description("Retrieve Branch Location Administrative Plan")
    RetrieveBranchLocationAdministrativePlanResponse retrieveBranchLocationAdministrativePlan(RetrieveBranchLocationAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Branch Location Administrative Plan")
    UpdateBranchLocationAdministrativePlanResponse updateBranchLocationAdministrativePlan(UpdateBranchLocationAdministrativePlanRequest req);
}