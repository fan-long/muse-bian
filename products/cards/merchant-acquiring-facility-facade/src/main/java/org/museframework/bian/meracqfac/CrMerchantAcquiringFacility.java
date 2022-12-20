package org.museframework.bian.meracqfac;

import org.museframework.bian.meracqfac.dto.InitiateMerchantAcquiringFacilityRequest;
import org.museframework.bian.meracqfac.dto.InitiateMerchantAcquiringFacilityResponse;
import org.museframework.bian.meracqfac.dto.RetrieveMerchantAcquiringFacilityRequest;
import org.museframework.bian.meracqfac.dto.RetrieveMerchantAcquiringFacilityResponse;
import org.museframework.bian.meracqfac.dto.UpdateMerchantAcquiringFacilityRequest;
import org.museframework.bian.meracqfac.dto.UpdateMerchantAcquiringFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Merchant Acquiring Facility. ")
@GenericDomain(name="MerchantAcquiringFacility", group="MerchantAcquiringFacility")
public interface CrMerchantAcquiringFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a new merchant acquiring facility")
    InitiateMerchantAcquiringFacilityResponse initiateMerchantAcquiringFacility(InitiateMerchantAcquiringFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the merchant acquiring facility")
    UpdateMerchantAcquiringFacilityResponse updateMerchantAcquiringFacility(UpdateMerchantAcquiringFacilityRequest req);

    @Description("ReCR Retrieve details about a merchant facility")
    RetrieveMerchantAcquiringFacilityResponse retrieveMerchantAcquiringFacility(RetrieveMerchantAcquiringFacilityRequest req);
}