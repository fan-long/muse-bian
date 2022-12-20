package org.museframework.bian.privateplacement;

import org.museframework.bian.privateplacement.dto.ControlPrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.ControlPrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.ExchangePrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.ExchangePrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.ExecutePrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.ExecutePrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.InitiatePrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.InitiatePrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.NotifyPrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.NotifyPrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.RequestPrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.RequestPrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.RetrievePrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.RetrievePrivatePlacementFacilityResponse;
import org.museframework.bian.privateplacement.dto.UpdatePrivatePlacementFacilityRequest;
import org.museframework.bian.privateplacement.dto.UpdatePrivatePlacementFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Private Placement. ")
@GenericDomain(name="PrivatePlacement", group="PrivatePlacementFacility")
public interface CrPrivatePlacementFacility {
    @GenericDtxEndpoint
    @Description("Control Private Placement Facility")
    ControlPrivatePlacementFacilityResponse controlPrivatePlacementFacility(ControlPrivatePlacementFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Private Placement Facility")
    ExchangePrivatePlacementFacilityResponse exchangePrivatePlacementFacility(ExchangePrivatePlacementFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Private Placement Facility")
    ExecutePrivatePlacementFacilityResponse executePrivatePlacementFacility(ExecutePrivatePlacementFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Private Placement Facility")
    InitiatePrivatePlacementFacilityResponse initiatePrivatePlacementFacility(InitiatePrivatePlacementFacilityRequest req);

    @Description("Notify Private Placement Facility")
    NotifyPrivatePlacementFacilityResponse notifyPrivatePlacementFacility(NotifyPrivatePlacementFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Private Placement Facility")
    RequestPrivatePlacementFacilityResponse requestPrivatePlacementFacility(RequestPrivatePlacementFacilityRequest req);

    @Description("Retrieve Private Placement Facility")
    RetrievePrivatePlacementFacilityResponse retrievePrivatePlacementFacility(RetrievePrivatePlacementFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Private Placement Facility")
    UpdatePrivatePlacementFacilityResponse updatePrivatePlacementFacility(UpdatePrivatePlacementFacilityRequest req);
}