package org.museframework.bian.customerportfolio;

import org.museframework.bian.customerportfolio.dto.EvaluateCustomerSegmentAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.EvaluateCustomerSegmentAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.RequestCustomerSegmentAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.RequestCustomerSegmentAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.RetrieveCustomerSegmentAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.RetrieveCustomerSegmentAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.UpdateCustomerSegmentAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.UpdateCustomerSegmentAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Customer Portfolio.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="CustomerPortfolio", group="CustomerSegmentAnalysis")
public interface CrCustomerSegmentAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate customer segment performance")
    EvaluateCustomerSegmentAnalysisResponse evaluateCustomerSegmentAnalysis(EvaluateCustomerSegmentAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update settings or content for customer segment analysis activity")
    UpdateCustomerSegmentAnalysisResponse updateCustomerSegmentAnalysis(UpdateCustomerSegmentAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the customer segment analysis activity")
    RequestCustomerSegmentAnalysisResponse requestCustomerSegmentAnalysis(RequestCustomerSegmentAnalysisRequest req);

    @Description("ReCR Retrieve details about customer segment analysis activity")
    RetrieveCustomerSegmentAnalysisResponse retrieveCustomerSegmentAnalysis(RetrieveCustomerSegmentAnalysisRequest req);
}