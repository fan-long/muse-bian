package org.museframework.bian.notionalpooling;

import org.museframework.bian.notionalpooling.dto.ControlNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.ControlNotionalPoolingFacilityResponse;
import org.museframework.bian.notionalpooling.dto.ExchangeNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.ExchangeNotionalPoolingFacilityResponse;
import org.museframework.bian.notionalpooling.dto.InitiateNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.InitiateNotionalPoolingFacilityResponse;
import org.museframework.bian.notionalpooling.dto.NotifyNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.NotifyNotionalPoolingFacilityResponse;
import org.museframework.bian.notionalpooling.dto.RequestNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.RequestNotionalPoolingFacilityResponse;
import org.museframework.bian.notionalpooling.dto.RetrieveNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.RetrieveNotionalPoolingFacilityResponse;
import org.museframework.bian.notionalpooling.dto.UpdateNotionalPoolingFacilityRequest;
import org.museframework.bian.notionalpooling.dto.UpdateNotionalPoolingFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Notional Pooling. ")
@GenericDomain(name="NotionalPooling", group="NotionalPoolingFacility")
public interface CrNotionalPoolingFacility {
    @GenericDtxEndpoint
    @Description("Control Notional Pooling Facility")
    ControlNotionalPoolingFacilityResponse controlNotionalPoolingFacility(ControlNotionalPoolingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Notional Pooling Facility")
    ExchangeNotionalPoolingFacilityResponse exchangeNotionalPoolingFacility(ExchangeNotionalPoolingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Notional Pooling Facility")
    InitiateNotionalPoolingFacilityResponse initiateNotionalPoolingFacility(InitiateNotionalPoolingFacilityRequest req);

    @Description("Notify Notional Pooling Facility")
    NotifyNotionalPoolingFacilityResponse notifyNotionalPoolingFacility(NotifyNotionalPoolingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Notional Pooling Facility")
    RequestNotionalPoolingFacilityResponse requestNotionalPoolingFacility(RequestNotionalPoolingFacilityRequest req);

    @Description("Retrieve Notional Pooling Facility")
    RetrieveNotionalPoolingFacilityResponse retrieveNotionalPoolingFacility(RetrieveNotionalPoolingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Notional Pooling Facility")
    UpdateNotionalPoolingFacilityResponse updateNotionalPoolingFacility(UpdateNotionalPoolingFacilityRequest req);
}