package org.museframework.bian.cusproandsereli;

import org.museframework.bian.cusproandsereli.dto.RetrieveNextBestRequest;
import org.museframework.bian.cusproandsereli.dto.RetrieveNextBestResponse;
import org.museframework.bian.cusproandsereli.dto.UpdateNextBestRequest;
import org.museframework.bian.cusproandsereli.dto.UpdateNextBestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CustomerProductAndServiceEligibility", group="NextBest")
public interface BqNextBest {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a next best eligibility test")
    UpdateNextBestResponse updateNextBest(UpdateNextBestRequest req);

    @Description("ReBQ Retrieve details about a next best test")
    RetrieveNextBestResponse retrieveNextBest(RetrieveNextBestRequest req);
}