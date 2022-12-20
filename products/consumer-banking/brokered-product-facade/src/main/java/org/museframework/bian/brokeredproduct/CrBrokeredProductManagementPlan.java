package org.museframework.bian.brokeredproduct;

import org.museframework.bian.brokeredproduct.dto.ControlBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.ControlBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.CreateBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.CreateBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.ExchangeBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.ExchangeBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.GrantBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.GrantBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.NotifyBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.NotifyBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.RequestBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.RequestBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.RetrieveBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.RetrieveBrokeredProductManagementPlanResponse;
import org.museframework.bian.brokeredproduct.dto.UpdateBrokeredProductManagementPlanRequest;
import org.museframework.bian.brokeredproduct.dto.UpdateBrokeredProductManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Brokered Product.")
@GenericDomain(name="BrokeredProduct", group="BrokeredProductManagementPlan")
public interface CrBrokeredProductManagementPlan {
    @GenericDtxEndpoint
    @Description("Control Brokered Product Management Plan")
    ControlBrokeredProductManagementPlanResponse controlBrokeredProductManagementPlan(ControlBrokeredProductManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Brokered Product Management Plan")
    CreateBrokeredProductManagementPlanResponse createBrokeredProductManagementPlan(CreateBrokeredProductManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Brokered Product Management Plan")
    ExchangeBrokeredProductManagementPlanResponse exchangeBrokeredProductManagementPlan(ExchangeBrokeredProductManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Brokered Product Management Plan")
    GrantBrokeredProductManagementPlanResponse grantBrokeredProductManagementPlan(GrantBrokeredProductManagementPlanRequest req);

    @Description("Notify Brokered Product Management Plan")
    NotifyBrokeredProductManagementPlanResponse notifyBrokeredProductManagementPlan(NotifyBrokeredProductManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Brokered Product Management Plan")
    RequestBrokeredProductManagementPlanResponse requestBrokeredProductManagementPlan(RequestBrokeredProductManagementPlanRequest req);

    @Description("Retrieve Brokered Product Management Plan")
    RetrieveBrokeredProductManagementPlanResponse retrieveBrokeredProductManagementPlan(RetrieveBrokeredProductManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Brokered Product Management Plan")
    UpdateBrokeredProductManagementPlanResponse updateBrokeredProductManagementPlan(UpdateBrokeredProductManagementPlanRequest req);
}