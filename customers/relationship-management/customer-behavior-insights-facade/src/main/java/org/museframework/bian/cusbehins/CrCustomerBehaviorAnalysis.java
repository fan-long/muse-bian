package org.museframework.bian.cusbehins;

import org.museframework.bian.cusbehins.dto.EvaluateCustomerBehaviorAnalysisRequest;
import org.museframework.bian.cusbehins.dto.EvaluateCustomerBehaviorAnalysisResponse;
import org.museframework.bian.cusbehins.dto.ExecuteCustomerBehaviorAnalysisRequest;
import org.museframework.bian.cusbehins.dto.ExecuteCustomerBehaviorAnalysisResponse;
import org.museframework.bian.cusbehins.dto.RequestCustomerBehaviorAnalysisRequest;
import org.museframework.bian.cusbehins.dto.RequestCustomerBehaviorAnalysisResponse;
import org.museframework.bian.cusbehins.dto.RetrieveCustomerBehaviorAnalysisRequest;
import org.museframework.bian.cusbehins.dto.RetrieveCustomerBehaviorAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Customer Behavior Insights.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="CustomerBehaviorInsights", group="CustomerBehaviorAnalysis")
public interface CrCustomerBehaviorAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Set-up evaluation of customer behavior insights for a customer")
    EvaluateCustomerBehaviorAnalysisResponse evaluateCustomerBehaviorAnalysis(EvaluateCustomerBehaviorAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task for customer insights (e.g. automated refresh")
    ExecuteCustomerBehaviorAnalysisResponse executeCustomerBehaviorAnalysis(ExecuteCustomerBehaviorAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention for customer insights (e.g. unscheduled revision)")
    RequestCustomerBehaviorAnalysisResponse requestCustomerBehaviorAnalysis(RequestCustomerBehaviorAnalysisRequest req);

    @Description("ReCR Retrieve details about customer behavior insights")
    RetrieveCustomerBehaviorAnalysisResponse retrieveCustomerBehaviorAnalysis(RetrieveCustomerBehaviorAnalysisRequest req);
}