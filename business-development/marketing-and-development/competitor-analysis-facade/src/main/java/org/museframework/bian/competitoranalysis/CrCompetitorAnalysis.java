package org.museframework.bian.competitoranalysis;

import org.museframework.bian.competitoranalysis.dto.EvaluateCompetitorAnalysisRequest;
import org.museframework.bian.competitoranalysis.dto.EvaluateCompetitorAnalysisResponse;
import org.museframework.bian.competitoranalysis.dto.ExecuteCompetitorAnalysisRequest;
import org.museframework.bian.competitoranalysis.dto.ExecuteCompetitorAnalysisResponse;
import org.museframework.bian.competitoranalysis.dto.RequestCompetitorAnalysisRequest;
import org.museframework.bian.competitoranalysis.dto.RequestCompetitorAnalysisResponse;
import org.museframework.bian.competitoranalysis.dto.RetrieveCompetitorAnalysisRequest;
import org.museframework.bian.competitoranalysis.dto.RetrieveCompetitorAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Competitor Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="CompetitorAnalysis", group="CompetitorAnalysis")
public interface CrCompetitorAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Initialize competitor analysis")
    EvaluateCompetitorAnalysisResponse evaluateCompetitorAnalysis(EvaluateCompetitorAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Obtain an automated refresh of maintained competitor analysis")
    ExecuteCompetitorAnalysisResponse executeCompetitorAnalysis(ExecuteCompetitorAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a manual intervention in the development of competitor analysis")
    RequestCompetitorAnalysisResponse requestCompetitorAnalysis(RequestCompetitorAnalysisRequest req);

    @Description("ReCR Retrieve details about competitor analysis activity")
    RetrieveCompetitorAnalysisResponse retrieveCompetitorAnalysis(RetrieveCompetitorAnalysisRequest req);
}