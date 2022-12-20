package org.museframework.bian.finmarana;

import org.museframework.bian.finmarana.dto.ExecuteFinancialMarketAnalysisRequest;
import org.museframework.bian.finmarana.dto.ExecuteFinancialMarketAnalysisResponse;
import org.museframework.bian.finmarana.dto.InitiateFinancialMarketAnalysisRequest;
import org.museframework.bian.finmarana.dto.InitiateFinancialMarketAnalysisResponse;
import org.museframework.bian.finmarana.dto.RequestFinancialMarketAnalysisRequest;
import org.museframework.bian.finmarana.dto.RequestFinancialMarketAnalysisResponse;
import org.museframework.bian.finmarana.dto.RetrieveFinancialMarketAnalysisRequest;
import org.museframework.bian.finmarana.dto.RetrieveFinancialMarketAnalysisResponse;
import org.museframework.bian.finmarana.dto.UpdateFinancialMarketAnalysisRequest;
import org.museframework.bian.finmarana.dto.UpdateFinancialMarketAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Financial Market Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="FinancialMarketAnalysis", group="FinancialMarketAnalysis")
public interface CrFinancialMarketAnalysis {
    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Financial Market Analysis")
    ExecuteFinancialMarketAnalysisResponse executeFinancialMarketAnalysis(ExecuteFinancialMarketAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Financial Market Analysis")
    InitiateFinancialMarketAnalysisResponse initiateFinancialMarketAnalysis(InitiateFinancialMarketAnalysisRequest req);

    @Description("ReCR Retrieve details about any aspect of Financial Market Analysis")
    RetrieveFinancialMarketAnalysisResponse retrieveFinancialMarketAnalysis(RetrieveFinancialMarketAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Financial Market Analysis")
    RequestFinancialMarketAnalysisResponse requestFinancialMarketAnalysis(RequestFinancialMarketAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Financial Market Analysis")
    UpdateFinancialMarketAnalysisResponse updateFinancialMarketAnalysis(UpdateFinancialMarketAnalysisRequest req);
}