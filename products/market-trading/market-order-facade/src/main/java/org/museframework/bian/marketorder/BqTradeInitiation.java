package org.museframework.bian.marketorder;

import org.museframework.bian.marketorder.dto.RetrieveTradeInitiationRequest;
import org.museframework.bian.marketorder.dto.RetrieveTradeInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrder", group="TradeInitiation")
public interface BqTradeInitiation {
    @Description("ReBQ Retrieve details about a market order's market trade")
    RetrieveTradeInitiationResponse retrieveTradeInitiation(RetrieveTradeInitiationRequest req);
}