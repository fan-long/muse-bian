package org.museframework.bian.invporana;

import org.museframework.bian.invporana.dto.EvaluateManagedInvestmentPortfolioAnalysisRequest;
import org.museframework.bian.invporana.dto.EvaluateManagedInvestmentPortfolioAnalysisResponse;
import org.museframework.bian.invporana.dto.ExecuteManagedInvestmentPortfolioAnalysisRequest;
import org.museframework.bian.invporana.dto.ExecuteManagedInvestmentPortfolioAnalysisResponse;
import org.museframework.bian.invporana.dto.RequestManagedInvestmentPortfolioAnalysisRequest;
import org.museframework.bian.invporana.dto.RequestManagedInvestmentPortfolioAnalysisResponse;
import org.museframework.bian.invporana.dto.RetrieveManagedInvestmentPortfolioAnalysisRequest;
import org.museframework.bian.invporana.dto.RetrieveManagedInvestmentPortfolioAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Investment Portfolio Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="InvestmentPortfolioAnalysis", group="ManagedInvestmentPortfolioAnalysis")
public interface CrManagedInvestmentPortfolioAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR perform an evaluation of an investment portfolio")
    EvaluateManagedInvestmentPortfolioAnalysisResponse evaluateManagedInvestmentPortfolioAnalysis(EvaluateManagedInvestmentPortfolioAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task for a evaluation")
    ExecuteManagedInvestmentPortfolioAnalysisResponse executeManagedInvestmentPortfolioAnalysis(ExecuteManagedInvestmentPortfolioAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention for an evaluation")
    RequestManagedInvestmentPortfolioAnalysisResponse requestManagedInvestmentPortfolioAnalysis(RequestManagedInvestmentPortfolioAnalysisRequest req);

    @Description("ReCR Retrieve details about an investment portfolio analysis")
    RetrieveManagedInvestmentPortfolioAnalysisResponse retrieveManagedInvestmentPortfolioAnalysis(RetrieveManagedInvestmentPortfolioAnalysisRequest req);
}