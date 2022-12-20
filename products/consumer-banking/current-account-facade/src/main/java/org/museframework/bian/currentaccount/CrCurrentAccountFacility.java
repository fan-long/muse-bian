package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.InitiateCurrentAccountFacilityRequest;
import org.museframework.bian.currentaccount.dto.InitiateCurrentAccountFacilityResponse;
import org.museframework.bian.currentaccount.dto.RetrieveCurrentAccountFacilityRequest;
import org.museframework.bian.currentaccount.dto.RetrieveCurrentAccountFacilityResponse;
import org.museframework.bian.currentaccount.dto.UpdateCurrentAccountFacilityRequest;
import org.museframework.bian.currentaccount.dto.UpdateCurrentAccountFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Current Account. ")
@GenericDomain(name="CurrentAccount", group="CurrentAccountFacility")
public interface CrCurrentAccountFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate A new Current Account")
    InitiateCurrentAccountFacilityResponse initiateCurrentAccountFacility(InitiateCurrentAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a current account")
    UpdateCurrentAccountFacilityResponse updateCurrentAccountFacility(UpdateCurrentAccountFacilityRequest req);

    @Description("ReCR Retrieve information about a current account - either standard canned reports or selected instance attribute values")
    RetrieveCurrentAccountFacilityResponse retrieveCurrentAccountFacility(RetrieveCurrentAccountFacilityRequest req);
}