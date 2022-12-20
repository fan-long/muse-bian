package org.museframework.bian.bralocman;

import org.museframework.bian.bralocman.dto.CaptureProductandServicePlanningRequest;
import org.museframework.bian.bralocman.dto.CaptureProductandServicePlanningResponse;
import org.museframework.bian.bralocman.dto.ControlProductandServicePlanningRequest;
import org.museframework.bian.bralocman.dto.ControlProductandServicePlanningResponse;
import org.museframework.bian.bralocman.dto.RequestProductandServicePlanningRequest;
import org.museframework.bian.bralocman.dto.RequestProductandServicePlanningResponse;
import org.museframework.bian.bralocman.dto.RetrieveProductandServicePlanningRequest;
import org.museframework.bian.bralocman.dto.RetrieveProductandServicePlanningResponse;
import org.museframework.bian.bralocman.dto.UpdateProductandServicePlanningRequest;
import org.museframework.bian.bralocman.dto.UpdateProductandServicePlanningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="BranchLocationManagement", group="ProductandServicePlanning")
public interface BqProductandServicePlanning {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Product and Service Planning activity or event related information")
    CaptureProductandServicePlanningResponse captureProductandServicePlanning(CaptureProductandServicePlanningRequest req);

    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Product and Service Planning")
    ControlProductandServicePlanningResponse controlProductandServicePlanning(ControlProductandServicePlanningRequest req);

    @Description("ReBQ Retrieve details about any aspect of Product and Service Planning")
    RetrieveProductandServicePlanningResponse retrieveProductandServicePlanning(RetrieveProductandServicePlanningRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Product and Service Planning")
    RequestProductandServicePlanningResponse requestProductandServicePlanning(RequestProductandServicePlanningRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Product and Service Planning")
    UpdateProductandServicePlanningResponse updateProductandServicePlanning(UpdateProductandServicePlanningRequest req);
}