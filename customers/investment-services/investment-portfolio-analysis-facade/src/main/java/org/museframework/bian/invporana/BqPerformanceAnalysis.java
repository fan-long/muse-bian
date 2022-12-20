package org.museframework.bian.invporana;

import org.museframework.bian.invporana.dto.ExecutePerformanceAnalysisRequest;
import org.museframework.bian.invporana.dto.ExecutePerformanceAnalysisResponse;
import org.museframework.bian.invporana.dto.RequestPerformanceAnalysisRequest;
import org.museframework.bian.invporana.dto.RequestPerformanceAnalysisResponse;
import org.museframework.bian.invporana.dto.RetrievePerformanceAnalysisRequest;
import org.museframework.bian.invporana.dto.RetrievePerformanceAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="InvestmentPortfolioAnalysis", group="PerformanceAnalysis")
public interface BqPerformanceAnalysis {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated task for a specific type of analysis")
    ExecutePerformanceAnalysisResponse executePerformanceAnalysis(ExecutePerformanceAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for a specific type of analysis")
    RequestPerformanceAnalysisResponse requestPerformanceAnalysis(RequestPerformanceAnalysisRequest req);

    @Description("ReBQ Retrieve details about a specific type of investment portfolio analysis")
    RetrievePerformanceAnalysisResponse retrievePerformanceAnalysis(RetrievePerformanceAnalysisRequest req);
}