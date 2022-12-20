package org.museframework.bian.productportfolio;

import org.museframework.bian.productportfolio.dto.EvaluateProductPortfolioAnalysisRequest;
import org.museframework.bian.productportfolio.dto.EvaluateProductPortfolioAnalysisResponse;
import org.museframework.bian.productportfolio.dto.RequestProductPortfolioAnalysisRequest;
import org.museframework.bian.productportfolio.dto.RequestProductPortfolioAnalysisResponse;
import org.museframework.bian.productportfolio.dto.RetrieveProductPortfolioAnalysisRequest;
import org.museframework.bian.productportfolio.dto.RetrieveProductPortfolioAnalysisResponse;
import org.museframework.bian.productportfolio.dto.UpdateProductPortfolioAnalysisRequest;
import org.museframework.bian.productportfolio.dto.UpdateProductPortfolioAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Product Portfolio.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="ProductPortfolio", group="ProductPortfolioAnalysis")
public interface CrProductPortfolioAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate product portfolio performance")
    EvaluateProductPortfolioAnalysisResponse evaluateProductPortfolioAnalysis(EvaluateProductPortfolioAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update settings or content for product portfolio analysis activity")
    UpdateProductPortfolioAnalysisResponse updateProductPortfolioAnalysis(UpdateProductPortfolioAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the product portfolio analysis activity")
    RequestProductPortfolioAnalysisResponse requestProductPortfolioAnalysis(RequestProductPortfolioAnalysisRequest req);

    @Description("ReCR Retrieve details about product portfolio analysis activity")
    RetrieveProductPortfolioAnalysisResponse retrieveProductPortfolioAnalysis(RetrieveProductPortfolioAnalysisRequest req);
}