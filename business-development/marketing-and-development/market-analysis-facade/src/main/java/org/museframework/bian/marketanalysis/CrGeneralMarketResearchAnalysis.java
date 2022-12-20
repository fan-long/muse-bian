package org.museframework.bian.marketanalysis;

import org.museframework.bian.marketanalysis.dto.EvaluateGeneralMarketResearchAnalysisRequest;
import org.museframework.bian.marketanalysis.dto.EvaluateGeneralMarketResearchAnalysisResponse;
import org.museframework.bian.marketanalysis.dto.ExecuteGeneralMarketResearchAnalysisRequest;
import org.museframework.bian.marketanalysis.dto.ExecuteGeneralMarketResearchAnalysisResponse;
import org.museframework.bian.marketanalysis.dto.RequestGeneralMarketResearchAnalysisRequest;
import org.museframework.bian.marketanalysis.dto.RequestGeneralMarketResearchAnalysisResponse;
import org.museframework.bian.marketanalysis.dto.RetrieveGeneralMarketResearchAnalysisRequest;
import org.museframework.bian.marketanalysis.dto.RetrieveGeneralMarketResearchAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Market Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="MarketAnalysis", group="GeneralMarketResearchAnalysis")
public interface CrGeneralMarketResearchAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Initialize a market research analysis")
    EvaluateGeneralMarketResearchAnalysisResponse evaluateGeneralMarketResearchAnalysis(EvaluateGeneralMarketResearchAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Obtain an automated refresh of market research analysis")
    ExecuteGeneralMarketResearchAnalysisResponse executeGeneralMarketResearchAnalysis(ExecuteGeneralMarketResearchAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a manual refresh of market research analysis")
    RequestGeneralMarketResearchAnalysisResponse requestGeneralMarketResearchAnalysis(RequestGeneralMarketResearchAnalysisRequest req);

    @Description("ReCR Retrieve details about market research analysis, including recent results")
    RetrieveGeneralMarketResearchAnalysisResponse retrieveGeneralMarketResearchAnalysis(RetrieveGeneralMarketResearchAnalysisRequest req);
}