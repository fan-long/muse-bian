package org.museframework.bian.fraudresolution;

import org.museframework.bian.fraudresolution.dto.RetrieveCaseAnalysisRequest;
import org.museframework.bian.fraudresolution.dto.RetrieveCaseAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="FraudResolution", group="CaseAnalysis")
public interface BqCaseAnalysis {
    @Description("ReCR Retrieve information about an active fraud case analysis")
    RetrieveCaseAnalysisResponse retrieveCaseAnalysis(RetrieveCaseAnalysisRequest req);
}