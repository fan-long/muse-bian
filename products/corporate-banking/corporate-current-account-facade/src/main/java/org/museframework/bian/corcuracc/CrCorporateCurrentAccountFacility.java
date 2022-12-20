package org.museframework.bian.corcuracc;

import org.museframework.bian.corcuracc.dto.InitiateCorporateCurrentAccountFacilityRequest;
import org.museframework.bian.corcuracc.dto.InitiateCorporateCurrentAccountFacilityResponse;
import org.museframework.bian.corcuracc.dto.RetrieveCorporateCurrentAccountFacilityRequest;
import org.museframework.bian.corcuracc.dto.RetrieveCorporateCurrentAccountFacilityResponse;
import org.museframework.bian.corcuracc.dto.UpdateCorporateCurrentAccountFacilityRequest;
import org.museframework.bian.corcuracc.dto.UpdateCorporateCurrentAccountFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Current Account. ")
@GenericDomain(name="CorporateCurrentAccount", group="CorporateCurrentAccountFacility")
public interface CrCorporateCurrentAccountFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate A new Corporate Current Account")
    InitiateCorporateCurrentAccountFacilityResponse initiateCorporateCurrentAccountFacility(InitiateCorporateCurrentAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a corporate current account")
    UpdateCorporateCurrentAccountFacilityResponse updateCorporateCurrentAccountFacility(UpdateCorporateCurrentAccountFacilityRequest req);

    @Description("ReCR Retrieve information about a corporate current account - either standard canned reports or selected instance attribute values")
    RetrieveCorporateCurrentAccountFacilityResponse retrieveCorporateCurrentAccountFacility(RetrieveCorporateCurrentAccountFacilityRequest req);
}