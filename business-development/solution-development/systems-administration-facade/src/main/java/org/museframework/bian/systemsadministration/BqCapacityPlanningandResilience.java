package org.museframework.bian.systemsadministration;

import org.museframework.bian.systemsadministration.dto.CaptureCapacityPlanningandResilienceRequest;
import org.museframework.bian.systemsadministration.dto.CaptureCapacityPlanningandResilienceResponse;
import org.museframework.bian.systemsadministration.dto.RequestCapacityPlanningandResilienceRequest;
import org.museframework.bian.systemsadministration.dto.RequestCapacityPlanningandResilienceResponse;
import org.museframework.bian.systemsadministration.dto.RetrieveCapacityPlanningandResilienceRequest;
import org.museframework.bian.systemsadministration.dto.RetrieveCapacityPlanningandResilienceResponse;
import org.museframework.bian.systemsadministration.dto.UpdateCapacityPlanningandResilienceRequest;
import org.museframework.bian.systemsadministration.dto.UpdateCapacityPlanningandResilienceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="SystemsAdministration", group="CapacityPlanningandResilience")
public interface BqCapacityPlanningandResilience {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Capacity Planning and Resilience activity or event related information")
    CaptureCapacityPlanningandResilienceResponse captureCapacityPlanningandResilience(CaptureCapacityPlanningandResilienceRequest req);

    @Description("ReBQ Retrieve details about any aspect of Capacity Planning and Resilience")
    RetrieveCapacityPlanningandResilienceResponse retrieveCapacityPlanningandResilience(RetrieveCapacityPlanningandResilienceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Capacity Planning and Resilience")
    RequestCapacityPlanningandResilienceResponse requestCapacityPlanningandResilience(RequestCapacityPlanningandResilienceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Capacity Planning and Resilience")
    UpdateCapacityPlanningandResilienceResponse updateCapacityPlanningandResilience(UpdateCapacityPlanningandResilienceRequest req);
}