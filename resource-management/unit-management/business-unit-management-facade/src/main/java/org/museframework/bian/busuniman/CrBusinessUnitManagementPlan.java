package org.museframework.bian.busuniman;

import org.museframework.bian.busuniman.dto.CreateBusinessUnitManagementPlanRequest;
import org.museframework.bian.busuniman.dto.CreateBusinessUnitManagementPlanResponse;
import org.museframework.bian.busuniman.dto.RequestBusinessUnitManagementPlanRequest;
import org.museframework.bian.busuniman.dto.RequestBusinessUnitManagementPlanResponse;
import org.museframework.bian.busuniman.dto.RetrieveBusinessUnitManagementPlanRequest;
import org.museframework.bian.busuniman.dto.RetrieveBusinessUnitManagementPlanResponse;
import org.museframework.bian.busuniman.dto.UpdateBusinessUnitManagementPlanRequest;
import org.museframework.bian.busuniman.dto.UpdateBusinessUnitManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Business Unit Management.")
@GenericDomain(name="BusinessUnitManagement", group="BusinessUnitManagementPlan")
public interface CrBusinessUnitManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create the management plan for the business unit")
    CreateBusinessUnitManagementPlanResponse createBusinessUnitManagementPlan(CreateBusinessUnitManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update aspects of the business unit management plan")
    UpdateBusinessUnitManagementPlanResponse updateBusinessUnitManagementPlan(UpdateBusinessUnitManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with the plan (e.g. reprioritize activities)")
    RequestBusinessUnitManagementPlanResponse requestBusinessUnitManagementPlan(RequestBusinessUnitManagementPlanRequest req);

    @Description("ReCR Retrieve details about the business unit management plan")
    RetrieveBusinessUnitManagementPlanResponse retrieveBusinessUnitManagementPlan(RetrieveBusinessUnitManagementPlanRequest req);
}