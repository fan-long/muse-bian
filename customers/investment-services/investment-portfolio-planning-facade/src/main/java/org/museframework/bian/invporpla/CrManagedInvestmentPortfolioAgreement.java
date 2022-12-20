package org.museframework.bian.invporpla;

import org.museframework.bian.invporpla.dto.EvaluateManagedInvestmentPortfolioAgreementRequest;
import org.museframework.bian.invporpla.dto.EvaluateManagedInvestmentPortfolioAgreementResponse;
import org.museframework.bian.invporpla.dto.RequestManagedInvestmentPortfolioAgreementRequest;
import org.museframework.bian.invporpla.dto.RequestManagedInvestmentPortfolioAgreementResponse;
import org.museframework.bian.invporpla.dto.RetrieveManagedInvestmentPortfolioAgreementRequest;
import org.museframework.bian.invporpla.dto.RetrieveManagedInvestmentPortfolioAgreementResponse;
import org.museframework.bian.invporpla.dto.UpdateManagedInvestmentPortfolioAgreementRequest;
import org.museframework.bian.invporpla.dto.UpdateManagedInvestmentPortfolioAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Investment Portfolio Planning.   ")
@GenericDomain(name="InvestmentPortfolioPlanning", group="ManagedInvestmentPortfolioAgreement")
public interface CrManagedInvestmentPortfolioAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Establish a managed investment portfolio agreement")
    EvaluateManagedInvestmentPortfolioAgreementResponse evaluateManagedInvestmentPortfolioAgreement(EvaluateManagedInvestmentPortfolioAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active managed investment portfolio agreement")
    UpdateManagedInvestmentPortfolioAgreementResponse updateManagedInvestmentPortfolioAgreement(UpdateManagedInvestmentPortfolioAgreementRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request review that proposed activity is compatible with the agreement")
    RequestManagedInvestmentPortfolioAgreementResponse requestManagedInvestmentPortfolioAgreement(RequestManagedInvestmentPortfolioAgreementRequest req);

    @Description("ReCR Retrieve details about a managed investment portfolio agreement")
    RetrieveManagedInvestmentPortfolioAgreementResponse retrieveManagedInvestmentPortfolioAgreement(RetrieveManagedInvestmentPortfolioAgreementRequest req);
}