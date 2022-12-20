package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.EvaluateChannelActivityAnalysisRequest;
import org.museframework.bian.chaactana.dto.EvaluateChannelActivityAnalysisResponse;
import org.museframework.bian.chaactana.dto.ExchangeChannelActivityAnalysisRequest;
import org.museframework.bian.chaactana.dto.ExchangeChannelActivityAnalysisResponse;
import org.museframework.bian.chaactana.dto.RequestChannelActivityAnalysisRequest;
import org.museframework.bian.chaactana.dto.RequestChannelActivityAnalysisResponse;
import org.museframework.bian.chaactana.dto.RetrieveChannelActivityAnalysisRequest;
import org.museframework.bian.chaactana.dto.RetrieveChannelActivityAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Channel Activity Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="ChannelActivityAnalysis", group="ChannelActivityAnalysis")
public interface CrChannelActivityAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Initialize channel activity analysis")
    EvaluateChannelActivityAnalysisResponse evaluateChannelActivityAnalysis(EvaluateChannelActivityAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Obtain an automated refresh of channel activity analysis")
    ExchangeChannelActivityAnalysisResponse exchangeChannelActivityAnalysis(ExchangeChannelActivityAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a manual refresh of channel activity analysis")
    RequestChannelActivityAnalysisResponse requestChannelActivityAnalysis(RequestChannelActivityAnalysisRequest req);

    @Description("ReCR Retrieve details about channel activity analysis, including recent results")
    RetrieveChannelActivityAnalysisResponse retrieveChannelActivityAnalysis(RetrieveChannelActivityAnalysisRequest req);
}