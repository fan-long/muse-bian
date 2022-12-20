package org.museframework.bian.creditfacility;

import org.museframework.bian.creditfacility.dto.InitiateCreditLineFacilityRequest;
import org.museframework.bian.creditfacility.dto.InitiateCreditLineFacilityResponse;
import org.museframework.bian.creditfacility.dto.RetrieveCreditLineFacilityRequest;
import org.museframework.bian.creditfacility.dto.RetrieveCreditLineFacilityResponse;
import org.museframework.bian.creditfacility.dto.UpdateCreditLineFacilityRequest;
import org.museframework.bian.creditfacility.dto.UpdateCreditLineFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Credit Facility. ")
@GenericDomain(name="CreditFacility", group="CreditLineFacility")
public interface CrCreditLineFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a credit facility")
    InitiateCreditLineFacilityResponse initiateCreditLineFacility(InitiateCreditLineFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an existing credit facility")
    UpdateCreditLineFacilityResponse updateCreditLineFacility(UpdateCreditLineFacilityRequest req);

    @Description("ReCR Retrieve details about a credit facility")
    RetrieveCreditLineFacilityResponse retrieveCreditLineFacility(RetrieveCreditLineFacilityRequest req);
}