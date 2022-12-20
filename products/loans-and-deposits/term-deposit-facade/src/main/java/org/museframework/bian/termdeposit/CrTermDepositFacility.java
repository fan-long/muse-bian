package org.museframework.bian.termdeposit;

import org.museframework.bian.termdeposit.dto.InitiateTermDepositFacilityRequest;
import org.museframework.bian.termdeposit.dto.InitiateTermDepositFacilityResponse;
import org.museframework.bian.termdeposit.dto.RetrieveTermDepositFacilityRequest;
import org.museframework.bian.termdeposit.dto.RetrieveTermDepositFacilityResponse;
import org.museframework.bian.termdeposit.dto.UpdateTermDepositFacilityRequest;
import org.museframework.bian.termdeposit.dto.UpdateTermDepositFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Term Deposit. ")
@GenericDomain(name="TermDeposit", group="TermDepositFacility")
public interface CrTermDepositFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate A new term deposit account")
    InitiateTermDepositFacilityResponse initiateTermDepositFacility(InitiateTermDepositFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a term deposit account")
    UpdateTermDepositFacilityResponse updateTermDepositFacility(UpdateTermDepositFacilityRequest req);

    @Description("ReCR Retrieve information about a term deposit account - either standard canned reports or selected instance attribute values")
    RetrieveTermDepositFacilityResponse retrieveTermDepositFacility(RetrieveTermDepositFacilityRequest req);
}