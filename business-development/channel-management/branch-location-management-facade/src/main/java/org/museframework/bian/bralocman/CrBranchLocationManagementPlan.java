package org.museframework.bian.bralocman;

import org.museframework.bian.bralocman.dto.CaptureBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.CaptureBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.ControlBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.ControlBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.ExchangeBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.ExchangeBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.GrantBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.GrantBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.InitiateBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.InitiateBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.RequestBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.RequestBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.RetrieveBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.RetrieveBranchLocationManagementPlanResponse;
import org.museframework.bian.bralocman.dto.UpdateBranchLocationManagementPlanRequest;
import org.museframework.bian.bralocman.dto.UpdateBranchLocationManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="BranchLocationManagement", group="BranchLocationManagementPlan")
public interface CrBranchLocationManagementPlan {
    @GenericDtxEndpoint
    @Description("CaCR Capture Branch Location Management Plan activity or event related information")
    CaptureBranchLocationManagementPlanResponse captureBranchLocationManagementPlan(CaptureBranchLocationManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Branch Location Management Plan")
    ControlBranchLocationManagementPlanResponse controlBranchLocationManagementPlan(ControlBranchLocationManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Branch Location Management Plan processing")
    ExchangeBranchLocationManagementPlanResponse exchangeBranchLocationManagementPlan(ExchangeBranchLocationManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Branch Location Management Plan")
    GrantBranchLocationManagementPlanResponse grantBranchLocationManagementPlan(GrantBranchLocationManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Branch Location Management Plan")
    InitiateBranchLocationManagementPlanResponse initiateBranchLocationManagementPlan(InitiateBranchLocationManagementPlanRequest req);

    @Description("ReCR Retrieve details about any aspect of Branch Location Management Plan")
    RetrieveBranchLocationManagementPlanResponse retrieveBranchLocationManagementPlan(RetrieveBranchLocationManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Branch Location Management Plan")
    RequestBranchLocationManagementPlanResponse requestBranchLocationManagementPlan(RequestBranchLocationManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Branch Location Management Plan")
    UpdateBranchLocationManagementPlanResponse updateBranchLocationManagementPlan(UpdateBranchLocationManagementPlanRequest req);
}