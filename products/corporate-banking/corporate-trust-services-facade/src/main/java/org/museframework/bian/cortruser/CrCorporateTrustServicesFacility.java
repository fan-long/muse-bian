package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ControlCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.ControlCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.ExchangeCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.ExchangeCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.ExecuteCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.ExecuteCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.InitiateCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.InitiateCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.NotifyCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.NotifyCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.RequestCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.RequestCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.RetrieveCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.RetrieveCorporateTrustServicesFacilityResponse;
import org.museframework.bian.cortruser.dto.UpdateCorporateTrustServicesFacilityRequest;
import org.museframework.bian.cortruser.dto.UpdateCorporateTrustServicesFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Trust Services. ")
@GenericDomain(name="CorporateTrustServices", group="CorporateTrustServicesFacility")
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