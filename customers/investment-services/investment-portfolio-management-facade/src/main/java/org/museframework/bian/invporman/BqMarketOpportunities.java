package org.museframework.bian.invporman;

import org.museframework.bian.invporman.dto.RetrieveMarketOpportunitiesRequest;
import org.museframework.bian.invporman.dto.RetrieveMarketOpportunitiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="InvestmentPortfolioManagement", group="MarketOpportunities")
public interface BqMarketOpportunities {
    @Description("ReBQ Retrieve details about a related market opportunity")
    RetrieveMarketOpportunitiesResponse retrieveMarketOpportunities(RetrieveMarketOpportunitiesRequest req);
}