package org.museframework.bian.cusbehins;

import org.museframework.bian.cusbehins.dto.ExecuteInsightRequest;
import org.museframework.bian.cusbehins.dto.ExecuteInsightResponse;
import org.museframework.bian.cusbehins.dto.RequestInsightRequest;
import org.museframework.bian.cusbehins.dto.RequestInsightResponse;
import org.museframework.bian.cusbehins.dto.RetrieveInsightRequest;
import org.museframework.bian.cusbehins.dto.RetrieveInsightResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="CustomerBehaviorInsights", group="Insight")
public interface BqInsight {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated task for a specific customer behavior insight (e.g. refresh)")
    ExecuteInsightResponse executeInsight(ExecuteInsightRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for a specific customer behavior insight (e.g. re-calculate)")
    RequestInsightResponse requestInsight(RequestInsightRequest req);

    @Description("ReBQ Retrieve details about a specific customer behavior insight")
    RetrieveInsightResponse retrieveInsight(RetrieveInsightRequest req);
}