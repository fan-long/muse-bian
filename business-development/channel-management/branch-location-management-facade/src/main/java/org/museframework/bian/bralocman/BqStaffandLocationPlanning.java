package org.museframework.bian.bralocman;

import org.museframework.bian.bralocman.dto.CaptureStaffandLocationPlanningRequest;
import org.museframework.bian.bralocman.dto.CaptureStaffandLocationPlanningResponse;
import org.museframework.bian.bralocman.dto.RequestStaffandLocationPlanningRequest;
import org.museframework.bian.bralocman.dto.RequestStaffandLocationPlanningResponse;
import org.museframework.bian.bralocman.dto.RetrieveStaffandLocationPlanningRequest;
import org.museframework.bian.bralocman.dto.RetrieveStaffandLocationPlanningResponse;
import org.museframework.bian.bralocman.dto.UpdateStaffandLocationPlanningRequest;
import org.museframework.bian.bralocman.dto.UpdateStaffandLocationPlanningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="BranchLocationManagement", group="StaffandLocationPlanning")
public interface BqStaffandLocationPlanning {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Staff and Location Planning activity or event related information")
    CaptureStaffandLocationPlanningResponse captureStaffandLocationPlanning(CaptureStaffandLocationPlanningRequest req);

    @Description("ReBQ Retrieve details about any aspect of Staff and Location Planning")
    RetrieveStaffandLocationPlanningResponse retrieveStaffandLocationPlanning(RetrieveStaffandLocationPlanningRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Staff and Location Planning")
    RequestStaffandLocationPlanningResponse requestStaffandLocationPlanning(RequestStaffandLocationPlanningRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Staff and Location Planning")
    UpdateStaffandLocationPlanningResponse updateStaffandLocationPlanning(UpdateStaffandLocationPlanningRequest req);
}