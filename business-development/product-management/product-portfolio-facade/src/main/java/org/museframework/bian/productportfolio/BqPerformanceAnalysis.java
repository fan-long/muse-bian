package org.museframework.bian.productportfolio;

import org.museframework.bian.productportfolio.dto.EvaluatePerformanceAnalysisRequest;
import org.museframework.bian.productportfolio.dto.EvaluatePerformanceAnalysisResponse;
import org.museframework.bian.productportfolio.dto.ExecutePerformanceAnalysisRequest;
import org.museframework.bian.productportfolio.dto.ExecutePerformanceAnalysisResponse;
import org.museframework.bian.productportfolio.dto.RequestPerformanceAnalysisRequest;
import org.museframework.bian.productportfolio.dto.RequestPerformanceAnalysisResponse;
import org.museframework.bian.productportfolio.dto.RetrievePerformanceAnalysisRequest;
import org.museframework.bian.productportfolio.dto.RetrievePerformanceAnalysisResponse;
import org.museframework.bian.productportfolio.dto.UpdatePerformanceAnalysisRequest;
import org.museframework.bian.productportfolio.dto.UpdatePerformanceAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ProductPortfolio", group="PerformanceAnalysis")
public interface BqPerformanceAnalysis {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate product performance using a specific type of analysis")
    EvaluatePerformanceAnalysisResponse evaluatePerformanceAnalysis(EvaluatePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a specific product performance analysis")
    UpdatePerformanceAnalysisResponse updatePerformanceAnalysis(UpdatePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action against on-going analysis")
    ExecutePerformanceAnalysisResponse executePerformanceAnalysis(ExecutePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to on-going analysis")
    RequestPerformanceAnalysisResponse requestPerformanceAnalysis(RequestPerformanceAnalysisRequest req);

    @Description("ReBQ Retrieve details about a specific product performance analysis")
    RetrievePerformanceAnalysisResponse retrievePerformanceAnalysis(RetrievePerformanceAnalysisRequest req);
}