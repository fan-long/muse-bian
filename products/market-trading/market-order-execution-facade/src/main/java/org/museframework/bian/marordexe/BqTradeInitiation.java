package org.museframework.bian.marordexe;

import org.museframework.bian.marordexe.dto.InitiateTradeInitiationRequest;
import org.museframework.bian.marordexe.dto.InitiateTradeInitiationResponse;
import org.museframework.bian.marordexe.dto.RetrieveTradeInitiationRequest;
import org.museframework.bian.marordexe.dto.RetrieveTradeInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrderExecution", group="TradeInitiation")
public interface BqTradeInitiation {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a market trade")
    InitiateTradeInitiationResponse initiateTradeInitiation(InitiateTradeInitiationRequest req);

    @Description("ReBQ Retrieve details about a market trade")
    RetrieveTradeInitiationResponse retrieveTradeInitiation(RetrieveTradeInitiationRequest req);
}