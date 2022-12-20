package org.museframework.bian.trustservices;

import org.museframework.bian.trustservices.dto.ControlCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.ControlCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.ExchangeCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.ExchangeCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.ExecuteCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.ExecuteCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.InitiateCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.InitiateCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.NotifyCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.NotifyCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.RequestCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.RequestCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.RetrieveCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.RetrieveCorporateTrustServicesFacilityResponse;
import org.museframework.bian.trustservices.dto.UpdateCorporateTrustServicesFacilityRequest;
import org.museframework.bian.trustservices.dto.UpdateCorporateTrustServicesFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Trust Services. ")
@GenericDomain(name="TrustServices", group="CorporateTrustServicesFacility")
public interface CrCorporateTrustServicesFacility {
    @GenericDtxEndpoint
    @Description("Control Corporate Trust Services Facility")
    ControlCorporateTrustServicesFacilityResponse controlCorporateTrustServicesFacility(ControlCorporateTrustServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Corporate Trust Services Facility")
    ExchangeCorporateTrustServicesFacilityResponse exchangeCorporateTrustServicesFacility(ExchangeCorporateTrustServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Corporate Trust Services Facility")
    ExecuteCorporateTrustServicesFacilityResponse executeCorporateTrustServicesFacility(ExecuteCorporateTrustServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Corporate Trust Services Facility")
    InitiateCorporateTrustServicesFacilityResponse initiateCorporateTrustServicesFacility(InitiateCorporateTrustServicesFacilityRequest req);

    @Description("Notify Corporate Trust Services Facility")
    NotifyCorporateTrustServicesFacilityResponse notifyCorporateTrustServicesFacility(NotifyCorporateTrustServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Corporate Trust Services Facility")
    RequestCorporateTrustServicesFacilityResponse requestCorporateTrustServicesFacility(RequestCorporateTrustServicesFacilityRequest req);

    @Description("Retrieve Corporate Trust Services Facility")
    RetrieveCorporateTrustServicesFacilityResponse retrieveCorporateTrustServicesFacility(RetrieveCorporateTrustServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Corporate Trust Services Facility")
    UpdateCorporateTrustServicesFacilityResponse updateCorporateTrustServicesFacility(UpdateCorporateTrustServicesFacilityRequest req);
}