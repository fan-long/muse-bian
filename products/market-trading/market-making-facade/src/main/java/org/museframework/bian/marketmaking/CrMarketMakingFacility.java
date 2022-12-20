package org.museframework.bian.marketmaking;

import org.museframework.bian.marketmaking.dto.ControlMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.ControlMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.ExchangeMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.ExchangeMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.ExecuteMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.ExecuteMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.InitiateMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.InitiateMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.NotifyMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.NotifyMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.RequestMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.RequestMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.RetrieveMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.RetrieveMarketMakingFacilityResponse;
import org.museframework.bian.marketmaking.dto.UpdateMarketMakingFacilityRequest;
import org.museframework.bian.marketmaking.dto.UpdateMarketMakingFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Market Making. ")
@GenericDomain(name="MarketMaking", group="MarketMakingFacility")
public interface CrMarketMakingFacility {
    @GenericDtxEndpoint
    @Description("Control Market Making Facility")
    ControlMarketMakingFacilityResponse controlMarketMakingFacility(ControlMarketMakingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Market Making Facility")
    ExchangeMarketMakingFacilityResponse exchangeMarketMakingFacility(ExchangeMarketMakingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Making Facility")
    ExecuteMarketMakingFacilityResponse executeMarketMakingFacility(ExecuteMarketMakingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Making Facility")
    InitiateMarketMakingFacilityResponse initiateMarketMakingFacility(InitiateMarketMakingFacilityRequest req);

    @Description("Notify Market Making Facility")
    NotifyMarketMakingFacilityResponse notifyMarketMakingFacility(NotifyMarketMakingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Making Facility")
    RequestMarketMakingFacilityResponse requestMarketMakingFacility(RequestMarketMakingFacilityRequest req);

    @Description("Retrieve Market Making Facility")
    RetrieveMarketMakingFacilityResponse retrieveMarketMakingFacility(RetrieveMarketMakingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Making Facility")
    UpdateMarketMakingFacilityResponse updateMarketMakingFacility(UpdateMarketMakingFacilityRequest req);
}