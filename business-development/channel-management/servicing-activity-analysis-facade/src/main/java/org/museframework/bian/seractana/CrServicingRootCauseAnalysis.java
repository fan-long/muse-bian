package org.museframework.bian.seractana;

import org.museframework.bian.seractana.dto.ExecuteServicingRootCauseAnalysisRequest;
import org.museframework.bian.seractana.dto.ExecuteServicingRootCauseAnalysisResponse;
import org.museframework.bian.seractana.dto.InitiateServicingRootCauseAnalysisRequest;
import org.museframework.bian.seractana.dto.InitiateServicingRootCauseAnalysisResponse;
import org.museframework.bian.seractana.dto.RequestServicingRootCauseAnalysisRequest;
import org.museframework.bian.seractana.dto.RequestServicingRootCauseAnalysisResponse;
import org.museframework.bian.seractana.dto.RetrieveServicingRootCauseAnalysisRequest;
import org.museframework.bian.seractana.dto.RetrieveServicingRootCauseAnalysisResponse;
import org.museframework.bian.seractana.dto.UpdateServicingRootCauseAnalysisRequest;
import org.museframework.bian.seractana.dto.UpdateServicingRootCauseAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Servicing Activity Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="ServicingActivityAnalysis", group="ServicingRootCauseAnalysis")
public interface CrServicingRootCauseAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Initialize servicing root cause analysis")
    InitiateServicingRootCauseAnalysisResponse initiateServicingRootCauseAnalysis(InitiateServicingRootCauseAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update aspects of servicing root cause analysis")
    UpdateServicingRootCauseAnalysisResponse updateServicingRootCauseAnalysis(UpdateServicingRootCauseAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated aspect of root cause analysis")
    ExecuteServicingRootCauseAnalysisResponse executeServicingRootCauseAnalysis(ExecuteServicingRootCauseAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in servicing root cause analysis")
    RequestServicingRootCauseAnalysisResponse requestServicingRootCauseAnalysis(RequestServicingRootCauseAnalysisRequest req);

    @Description("ReCR Retrieve details about servicing root cause analysis")
    RetrieveServicingRootCauseAnalysisResponse retrieveServicingRootCauseAnalysis(RetrieveServicingRootCauseAnalysisRequest req);
}