package org.museframework.bian.cardauthorization;

import org.museframework.bian.cardauthorization.dto.RetrieveStandInRequest;
import org.museframework.bian.cardauthorization.dto.RetrieveStandInResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="CardAuthorization", group="StandIn")
public interface BqStandIn {
    @Description("ReBQ Retrieve details about the stand in check")
    RetrieveStandInResponse retrieveStandIn(RetrieveStandInRequest req);
}