package org.museframework.bian.cusbehmod;

import org.museframework.bian.cusbehmod.dto.RetrieveTestingRequest;
import org.museframework.bian.cusbehmod.dto.RetrieveTestingResponse;
import org.museframework.bian.cusbehmod.dto.UpdateTestingRequest;
import org.museframework.bian.cusbehmod.dto.UpdateTestingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="CustomerBehaviorModels", group="Testing")
public interface BqTesting {
    @GenericDtxEndpoint
    @Description("UpBQ Update user testing content")
    UpdateTestingResponse updateTesting(UpdateTestingRequest req);

    @Description("ReBQ Retrieve details and testing results")
    RetrieveTestingResponse retrieveTesting(RetrieveTestingRequest req);
}