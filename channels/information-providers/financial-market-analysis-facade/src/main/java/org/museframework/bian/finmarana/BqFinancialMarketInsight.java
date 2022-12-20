package org.museframework.bian.finmarana;

import org.museframework.bian.finmarana.dto.ExecuteFinancialMarketInsightRequest;
import org.museframework.bian.finmarana.dto.ExecuteFinancialMarketInsightResponse;
import org.museframework.bian.finmarana.dto.InitiateFinancialMarketInsightRequest;
import org.museframework.bian.finmarana.dto.InitiateFinancialMarketInsightResponse;
import org.museframework.bian.finmarana.dto.RequestFinancialMarketInsightRequest;
import org.museframework.bian.finmarana.dto.RequestFinancialMarketInsightResponse;
import org.museframework.bian.finmarana.dto.RetrieveFinancialMarketInsightRequest;
import org.museframework.bian.finmarana.dto.RetrieveFinancialMarketInsightResponse;
import org.museframework.bian.finmarana.dto.UpdateFinancialMarketInsightRequest;
import org.museframework.bian.finmarana.dto.UpdateFinancialMarketInsightResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Financial Market Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="FinancialMarketAnalysis", group="FinancialMarketInsight")
public interface BqFinancialMarketInsight {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Financial Market Insight")
    ExecuteFinancialMarketInsightResponse executeFinancialMarketInsight(ExecuteFinancialMarketInsightRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Financial Market Insight")
    InitiateFinancialMarketInsightResponse initiateFinancialMarketInsight(InitiateFinancialMarketInsightRequest req);

    @Description("ReBQ Retrieve details about any aspect of Financial Market Insight")
    RetrieveFinancialMarketInsightResponse retrieveFinancialMarketInsight(RetrieveFinancialMarketInsightRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Financial Market Insight")
    RequestFinancialMarketInsightResponse requestFinancialMarketInsight(RequestFinancialMarketInsightRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Financial Market Insight")
    UpdateFinancialMarketInsightResponse updateFinancialMarketInsight(UpdateFinancialMarketInsightRequest req);
}