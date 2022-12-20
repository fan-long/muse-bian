package org.museframework.bian.savingsaccount;

import org.museframework.bian.savingsaccount.dto.InitiateSavingsAccountFacilityRequest;
import org.museframework.bian.savingsaccount.dto.InitiateSavingsAccountFacilityResponse;
import org.museframework.bian.savingsaccount.dto.RetrieveSavingsAccountFacilityRequest;
import org.museframework.bian.savingsaccount.dto.RetrieveSavingsAccountFacilityResponse;
import org.museframework.bian.savingsaccount.dto.UpdateSavingsAccountFacilityRequest;
import org.museframework.bian.savingsaccount.dto.UpdateSavingsAccountFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Savings Account. ")
@GenericDomain(name="SavingsAccount", group="SavingsAccountFacility")
public interface CrSavingsAccountFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate A new savings account")
    InitiateSavingsAccountFacilityResponse initiateSavingsAccountFacility(InitiateSavingsAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a savings account")
    UpdateSavingsAccountFacilityResponse updateSavingsAccountFacility(UpdateSavingsAccountFacilityRequest req);

    @Description("ReCR Retrieve information about a savings account - either standard canned reports or selected instance attribute values")
    RetrieveSavingsAccountFacilityResponse retrieveSavingsAccountFacility(RetrieveSavingsAccountFacilityRequest req);
}