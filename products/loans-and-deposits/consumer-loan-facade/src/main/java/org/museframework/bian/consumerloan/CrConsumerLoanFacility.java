package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.InitiateConsumerLoanFacilityRequest;
import org.museframework.bian.consumerloan.dto.InitiateConsumerLoanFacilityResponse;
import org.museframework.bian.consumerloan.dto.RetrieveConsumerLoanFacilityRequest;
import org.museframework.bian.consumerloan.dto.RetrieveConsumerLoanFacilityResponse;
import org.museframework.bian.consumerloan.dto.UpdateConsumerLoanFacilityRequest;
import org.museframework.bian.consumerloan.dto.UpdateConsumerLoanFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Consumer Loan. ")
@GenericDomain(name="ConsumerLoan", group="ConsumerLoanFacility")
public interface CrConsumerLoanFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a consumer loan")
    InitiateConsumerLoanFacilityResponse initiateConsumerLoanFacility(InitiateConsumerLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an existing consumer loan")
    UpdateConsumerLoanFacilityResponse updateConsumerLoanFacility(UpdateConsumerLoanFacilityRequest req);

    @Description("ReCR Retrieve details about a consumer loan")
    RetrieveConsumerLoanFacilityResponse retrieveConsumerLoanFacility(RetrieveConsumerLoanFacilityRequest req);
}