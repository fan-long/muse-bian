package org.museframework.bian.investmentaccount;

import org.museframework.bian.investmentaccount.dto.InitiateInvestmentAccountFacilityRequest;
import org.museframework.bian.investmentaccount.dto.InitiateInvestmentAccountFacilityResponse;
import org.museframework.bian.investmentaccount.dto.RetrieveInvestmentAccountFacilityRequest;
import org.museframework.bian.investmentaccount.dto.RetrieveInvestmentAccountFacilityResponse;
import org.museframework.bian.investmentaccount.dto.UpdateInvestmentAccountFacilityRequest;
import org.museframework.bian.investmentaccount.dto.UpdateInvestmentAccountFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Investment Account. ")
@GenericDomain(name="InvestmentAccount", group="InvestmentAccountFacility")
public interface CrInvestmentAccountFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a new securities investment account")
    InitiateInvestmentAccountFacilityResponse initiateInvestmentAccountFacility(InitiateInvestmentAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an investment account")
    UpdateInvestmentAccountFacilityResponse updateInvestmentAccountFacility(UpdateInvestmentAccountFacilityRequest req);

    @Description("ReCR Retrieve information about an investment account - either standard canned reports or selected instance attribute values")
    RetrieveInvestmentAccountFacilityResponse retrieveInvestmentAccountFacility(RetrieveInvestmentAccountFacilityRequest req);
}