package org.museframework.bian.publicoffering;

import org.museframework.bian.publicoffering.dto.ControlPublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.ControlPublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.ExchangePublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.ExchangePublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.ExecutePublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.ExecutePublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.InitiatePublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.InitiatePublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.NotifyPublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.NotifyPublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.RequestPublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.RequestPublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.RetrievePublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.RetrievePublicOfferingFacilityResponse;
import org.museframework.bian.publicoffering.dto.UpdatePublicOfferingFacilityRequest;
import org.museframework.bian.publicoffering.dto.UpdatePublicOfferingFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Public Offering. ")
@GenericDomain(name="PublicOffering", group="PublicOfferingFacility")
public interface CrPublicOfferingFacility {
    @GenericDtxEndpoint
    @Description("Control Public Offering Facility")
    ControlPublicOfferingFacilityResponse controlPublicOfferingFacility(ControlPublicOfferingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Public Offering Facility")
    ExchangePublicOfferingFacilityResponse exchangePublicOfferingFacility(ExchangePublicOfferingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Public Offering Facility")
    ExecutePublicOfferingFacilityResponse executePublicOfferingFacility(ExecutePublicOfferingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Public Offering Facility")
    InitiatePublicOfferingFacilityResponse initiatePublicOfferingFacility(InitiatePublicOfferingFacilityRequest req);

    @Description("Notify Public Offering Facility")
    NotifyPublicOfferingFacilityResponse notifyPublicOfferingFacility(NotifyPublicOfferingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Public Offering Facility")
    RequestPublicOfferingFacilityResponse requestPublicOfferingFacility(RequestPublicOfferingFacilityRequest req);

    @Description("Retrieve Public Offering Facility")
    RetrievePublicOfferingFacilityResponse retrievePublicOfferingFacility(RetrievePublicOfferingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Public Offering Facility")
    UpdatePublicOfferingFacilityResponse updatePublicOfferingFacility(UpdatePublicOfferingFacilityRequest req);
}