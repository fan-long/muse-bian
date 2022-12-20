package org.museframework.bian.cortaxadv;

import org.museframework.bian.cortaxadv.dto.InitiateCorporateTaxAdvisoryFacilityRequest;
import org.museframework.bian.cortaxadv.dto.InitiateCorporateTaxAdvisoryFacilityResponse;
import org.museframework.bian.cortaxadv.dto.RequestCorporateTaxAdvisoryFacilityRequest;
import org.museframework.bian.cortaxadv.dto.RequestCorporateTaxAdvisoryFacilityResponse;
import org.museframework.bian.cortaxadv.dto.RetrieveCorporateTaxAdvisoryFacilityRequest;
import org.museframework.bian.cortaxadv.dto.RetrieveCorporateTaxAdvisoryFacilityResponse;
import org.museframework.bian.cortaxadv.dto.UpdateCorporateTaxAdvisoryFacilityRequest;
import org.museframework.bian.cortaxadv.dto.UpdateCorporateTaxAdvisoryFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Tax Advisory. ")
@GenericDomain(name="CorporateTaxAdvisory", group="CorporateTaxAdvisoryFacility")
public interface CrCorporateTaxAdvisoryFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a corporate tax advisory service")
    InitiateCorporateTaxAdvisoryFacilityResponse initiateCorporateTaxAdvisoryFacility(InitiateCorporateTaxAdvisoryFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for a corporate tax advisory service")
    UpdateCorporateTaxAdvisoryFacilityResponse updateCorporateTaxAdvisoryFacility(UpdateCorporateTaxAdvisoryFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention during the advisory service")
    RequestCorporateTaxAdvisoryFacilityResponse requestCorporateTaxAdvisoryFacility(RequestCorporateTaxAdvisoryFacilityRequest req);

    @Description("ReCR Retrieve details about a corporate tax advisory service arrangement")
    RetrieveCorporateTaxAdvisoryFacilityResponse retrieveCorporateTaxAdvisoryFacility(RetrieveCorporateTaxAdvisoryFacilityRequest req);
}