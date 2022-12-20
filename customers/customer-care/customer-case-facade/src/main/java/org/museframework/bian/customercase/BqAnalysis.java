package org.museframework.bian.customercase;

import org.museframework.bian.customercase.dto.RetrieveAnalysisRequest;
import org.museframework.bian.customercase.dto.RetrieveAnalysisResponse;
import org.museframework.bian.customercase.dto.UpdateAnalysisRequest;
import org.museframework.bian.customercase.dto.UpdateAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerCase", group="Analysis")
public interface BqAnalysis {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the analysis in a customer case")
    UpdateAnalysisResponse updateAnalysis(UpdateAnalysisRequest req);

    @Description("ReBQ Retrieve details about the analysis of a customer case")
    RetrieveAnalysisResponse retrieveAnalysis(RetrieveAnalysisRequest req);
}