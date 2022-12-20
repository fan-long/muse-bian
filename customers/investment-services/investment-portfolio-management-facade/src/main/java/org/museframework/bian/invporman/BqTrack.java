package org.museframework.bian.invporman;

import org.museframework.bian.invporman.dto.RetrieveTrackRequest;
import org.museframework.bian.invporman.dto.RetrieveTrackResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="InvestmentPortfolioManagement", group="Track")
public interface BqTrack {
    @Description("ReBQ Retrieve details about tracking insights for the portfolio")
    RetrieveTrackResponse retrieveTrack(RetrieveTrackRequest req);
}