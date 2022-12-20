package org.museframework.bian.invporman;

import org.museframework.bian.invporman.dto.ExecuteManagedInvestmentPortfolioFacilityRequest;
import org.museframework.bian.invporman.dto.ExecuteManagedInvestmentPortfolioFacilityResponse;
import org.museframework.bian.invporman.dto.InitiateManagedInvestmentPortfolioFacilityRequest;
import org.museframework.bian.invporman.dto.InitiateManagedInvestmentPortfolioFacilityResponse;
import org.museframework.bian.invporman.dto.RequestManagedInvestmentPortfolioFacilityRequest;
import org.museframework.bian.invporman.dto.RequestManagedInvestmentPortfolioFacilityResponse;
import org.museframework.bian.invporman.dto.RetrieveManagedInvestmentPortfolioFacilityRequest;
import org.museframework.bian.invporman.dto.RetrieveManagedInvestmentPortfolioFacilityResponse;
import org.museframework.bian.invporman.dto.UpdateManagedInvestmentPortfolioFacilityRequest;
import org.museframework.bian.invporman.dto.UpdateManagedInvestmentPortfolioFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Investment Portfolio Management. ")
@GenericDomain(name="InvestmentPortfolioManagement", group="ManagedInvestmentPortfolioFacility")
public interface CrManagedInvestmentPortfolioFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate investment portfolio management activity for a customer")
    InitiateManagedInvestmentPortfolioFacilityResponse initiateManagedInvestmentPortfolioFacility(InitiateManagedInvestmentPortfolioFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active investment portfolio management arrangement")
    UpdateManagedInvestmentPortfolioFacilityResponse updateManagedInvestmentPortfolioFacility(UpdateManagedInvestmentPortfolioFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated service")
    ExecuteManagedInvestmentPortfolioFacilityResponse executeManagedInvestmentPortfolioFacility(ExecuteManagedInvestmentPortfolioFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention")
    RequestManagedInvestmentPortfolioFacilityResponse requestManagedInvestmentPortfolioFacility(RequestManagedInvestmentPortfolioFacilityRequest req);

    @Description("ReCR Retrieve details about a managed investment portfolio")
    RetrieveManagedInvestmentPortfolioFacilityResponse retrieveManagedInvestmentPortfolioFacility(RetrieveManagedInvestmentPortfolioFacilityRequest req);
}