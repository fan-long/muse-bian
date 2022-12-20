package org.museframework.bian.promotionalevents;

import org.museframework.bian.promotionalevents.dto.CreatePromotionalEventManagementPlanRequest;
import org.museframework.bian.promotionalevents.dto.CreatePromotionalEventManagementPlanResponse;
import org.museframework.bian.promotionalevents.dto.RequestPromotionalEventManagementPlanRequest;
import org.museframework.bian.promotionalevents.dto.RequestPromotionalEventManagementPlanResponse;
import org.museframework.bian.promotionalevents.dto.RetrievePromotionalEventManagementPlanRequest;
import org.museframework.bian.promotionalevents.dto.RetrievePromotionalEventManagementPlanResponse;
import org.museframework.bian.promotionalevents.dto.UpdatePromotionalEventManagementPlanRequest;
import org.museframework.bian.promotionalevents.dto.UpdatePromotionalEventManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Promotional Events.")
@GenericDomain(name="PromotionalEvents", group="PromotionalEventManagementPlan")
public interface CrPromotionalEventManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create and invoke the promotional event management plan")
    CreatePromotionalEventManagementPlanResponse createPromotionalEventManagementPlan(CreatePromotionalEventManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the promotional event management plan")
    UpdatePromotionalEventManagementPlanResponse updatePromotionalEventManagementPlan(UpdatePromotionalEventManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the event plan")
    RequestPromotionalEventManagementPlanResponse requestPromotionalEventManagementPlan(RequestPromotionalEventManagementPlanRequest req);

    @Description("ReCR Retrieve details about the promotional event management plan")
    RetrievePromotionalEventManagementPlanResponse retrievePromotionalEventManagementPlan(RetrievePromotionalEventManagementPlanRequest req);
}