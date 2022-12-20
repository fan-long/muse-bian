package org.museframework.bian.ebranchmanagement;

import org.museframework.bian.ebranchmanagement.dto.RequestCapacityPlanningRequest;
import org.museframework.bian.ebranchmanagement.dto.RequestCapacityPlanningResponse;
import org.museframework.bian.ebranchmanagement.dto.RetrieveCapacityPlanningRequest;
import org.museframework.bian.ebranchmanagement.dto.RetrieveCapacityPlanningResponse;
import org.museframework.bian.ebranchmanagement.dto.UpdateCapacityPlanningRequest;
import org.museframework.bian.ebranchmanagement.dto.UpdateCapacityPlanningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="eBranchManagement", group="CapacityPlanning")
public interface BqCapacityPlanning {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the capacity management plan for the channel")
    UpdateCapacityPlanningResponse updateCapacityPlanning(UpdateCapacityPlanningRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the capacity plan")
    RequestCapacityPlanningResponse requestCapacityPlanning(RequestCapacityPlanningRequest req);

    @Description("ReBQ Retrieve details about the channel capacity plan")
    RetrieveCapacityPlanningResponse retrieveCapacityPlanning(RetrieveCapacityPlanningRequest req);
}