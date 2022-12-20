package org.museframework.bian.fraudmodel;

import org.museframework.bian.fraudmodel.dto.RetrieveTestingRequest;
import org.museframework.bian.fraudmodel.dto.RetrieveTestingResponse;
import org.museframework.bian.fraudmodel.dto.UpdateTestingRequest;
import org.museframework.bian.fraudmodel.dto.UpdateTestingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="FraudModel", group="Testing")
public interface BqTesting {
    @GenericDtxEndpoint
    @Description("UpBQ Update user testing content")
    UpdateTestingResponse updateTesting(UpdateTestingRequest req);

    @Description("ReBQ Retrieve details and testing results")
    RetrieveTestingResponse retrieveTesting(RetrieveTestingRequest req);
}