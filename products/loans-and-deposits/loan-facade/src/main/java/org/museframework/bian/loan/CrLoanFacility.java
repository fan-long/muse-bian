package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.InitiateLoanFacilityRequest;
import org.museframework.bian.loan.dto.InitiateLoanFacilityResponse;
import org.museframework.bian.loan.dto.RetrieveLoanFacilityRequest;
import org.museframework.bian.loan.dto.RetrieveLoanFacilityResponse;
import org.museframework.bian.loan.dto.UpdateLoanFacilityRequest;
import org.museframework.bian.loan.dto.UpdateLoanFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Loan. ")
@GenericDomain(name="Loan", group="LoanFacility")
public interface CrLoanFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a loan")
    InitiateLoanFacilityResponse initiateLoanFacility(InitiateLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an existing loan")
    UpdateLoanFacilityResponse updateLoanFacility(UpdateLoanFacilityRequest req);

    @Description("ReCR Retrieve details about a loan")
    RetrieveLoanFacilityResponse retrieveLoanFacility(RetrieveLoanFacilityRequest req);
}