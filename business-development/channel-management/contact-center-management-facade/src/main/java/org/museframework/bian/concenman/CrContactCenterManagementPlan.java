package org.museframework.bian.concenman;

import org.museframework.bian.concenman.dto.CreateContactCenterManagementPlanRequest;
import org.museframework.bian.concenman.dto.CreateContactCenterManagementPlanResponse;
import org.museframework.bian.concenman.dto.RequestContactCenterManagementPlanRequest;
import org.museframework.bian.concenman.dto.RequestContactCenterManagementPlanResponse;
import org.museframework.bian.concenman.dto.RetrieveContactCenterManagementPlanRequest;
import org.museframework.bian.concenman.dto.RetrieveContactCenterManagementPlanResponse;
import org.museframework.bian.concenman.dto.UpdateContactCenterManagementPlanRequest;
import org.museframework.bian.concenman.dto.UpdateContactCenterManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Contact Center Management.")
@GenericDomain(name="ContactCenterManagement", group="ContactCenterManagementPlan")
public interface CrContactCenterManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create the management plan for the contact center")
    CreateContactCenterManagementPlanResponse createContactCenterManagementPlan(CreateContactCenterManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update aspects of the contact center management plan")
    UpdateContactCenterManagementPlanResponse updateContactCenterManagementPlan(UpdateContactCenterManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with the plan (e.g. reprioritize activities)")
    RequestContactCenterManagementPlanResponse requestContactCenterManagementPlan(RequestContactCenterManagementPlanRequest req);

    @Description("ReCR Retrieve details about the contact center management plan")
    RetrieveContactCenterManagementPlanResponse retrieveContactCenterManagementPlan(RetrieveContactCenterManagementPlanRequest req);
}