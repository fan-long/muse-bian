package org.museframework.bian.invporman;

import org.museframework.bian.invporman.dto.ExchangeTradeInitiationRequest;
import org.museframework.bian.invporman.dto.ExchangeTradeInitiationResponse;
import org.museframework.bian.invporman.dto.InitiateTradeInitiationRequest;
import org.museframework.bian.invporman.dto.InitiateTradeInitiationResponse;
import org.museframework.bian.invporman.dto.RequestTradeInitiationRequest;
import org.museframework.bian.invporman.dto.RequestTradeInitiationResponse;
import org.museframework.bian.invporman.dto.RetrieveTradeInitiationRequest;
import org.museframework.bian.invporman.dto.RetrieveTradeInitiationResponse;
import org.museframework.bian.invporman.dto.UpdateTradeInitiationRequest;
import org.museframework.bian.invporman.dto.UpdateTradeInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="InvestmentPortfolioManagement", group="TradeInitiation")
public interface BqTradeInitiation {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a trade against the investment portfolio holdings")
    InitiateTradeInitiationResponse initiateTradeInitiation(InitiateTradeInitiationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update a market trade request")
    UpdateTradeInitiationResponse updateTradeInitiation(UpdateTradeInitiationRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, reject etc. a market trade proposed for the portfolio")
    ExchangeTradeInitiationResponse exchangeTradeInitiation(ExchangeTradeInitiationRequest req);

    @GenericDtxEndpoint
    @Description("ReBQ Request manual intervention to a related market trade")
    RequestTradeInitiationResponse requestTradeInitiation(RequestTradeInitiationRequest req);

    @Description("ReBQ Retrieve details about a related market trade request")
    RetrieveTradeInitiationResponse retrieveTradeInitiation(RetrieveTradeInitiationRequest req);
}