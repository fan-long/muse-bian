package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.InitiateCorporateLoanFacilityRequest;
import org.museframework.bian.corporateloan.dto.InitiateCorporateLoanFacilityResponse;
import org.museframework.bian.corporateloan.dto.RetrieveCorporateLoanFacilityRequest;
import org.museframework.bian.corporateloan.dto.RetrieveCorporateLoanFacilityResponse;
import org.museframework.bian.corporateloan.dto.UpdateCorporateLoanFacilityRequest;
import org.museframework.bian.corporateloan.dto.UpdateCorporateLoanFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Loan. ")
@GenericDomain(name="CorporateLoan", group="CorporateLoanFacility")
public interface CrCorporateLoanFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a corporate loan")
    InitiateCorporateLoanFacilityResponse initiateCorporateLoanFacility(InitiateCorporateLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an existing corporate loan")
    UpdateCorporateLoanFacilityResponse updateCorporateLoanFacility(UpdateCorporateLoanFacilityRequest req);

    @Description("ReCR Retrieve details about a corporate loan")
    RetrieveCorporateLoanFacilityResponse retrieveCorporateLoanFacility(RetrieveCorporateLoanFacilityRequest req);
}