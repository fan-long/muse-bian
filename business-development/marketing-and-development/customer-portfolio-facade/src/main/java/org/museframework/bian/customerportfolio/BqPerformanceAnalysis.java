package org.museframework.bian.customerportfolio;

import org.museframework.bian.customerportfolio.dto.EvaluatePerformanceAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.EvaluatePerformanceAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.ExecutePerformanceAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.ExecutePerformanceAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.RequestPerformanceAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.RequestPerformanceAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.RetrievePerformanceAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.RetrievePerformanceAnalysisResponse;
import org.museframework.bian.customerportfolio.dto.UpdatePerformanceAnalysisRequest;
import org.museframework.bian.customerportfolio.dto.UpdatePerformanceAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="CustomerPortfolio", group="PerformanceAnalysis")
public interface BqPerformanceAnalysis {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer segment performance using a specific type of analysis")
    EvaluatePerformanceAnalysisResponse evaluatePerformanceAnalysis(EvaluatePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a specific customer segment performance analysis")
    UpdatePerformanceAnalysisResponse updatePerformanceAnalysis(UpdatePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action against on-going analysis")
    ExecutePerformanceAnalysisResponse executePerformanceAnalysis(ExecutePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to on-going analysis")
    RequestPerformanceAnalysisResponse requestPerformanceAnalysis(RequestPerformanceAnalysisRequest req);

    @Description("ReBQ Retrieve details about a specific customer segment performance analysis")
    RetrievePerformanceAnalysisResponse retrievePerformanceAnalysis(RetrievePerformanceAnalysisRequest req);
}