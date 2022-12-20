package org.museframework.bian.accountrecovery;

import org.museframework.bian.accountrecovery.dto.RetrievePlanningRequest;
import org.museframework.bian.accountrecovery.dto.RetrievePlanningResponse;
import org.museframework.bian.accountrecovery.dto.UpdatePlanningRequest;
import org.museframework.bian.accountrecovery.dto.UpdatePlanningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="AccountRecovery", group="Planning")
public interface BqPlanning {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of an active case recovery plan")
    UpdatePlanningResponse updatePlanning(UpdatePlanningRequest req);

    @Description("ReBQ Retrieve details of an active case recovery plan")
    RetrievePlanningResponse retrievePlanning(RetrievePlanningRequest req);
}