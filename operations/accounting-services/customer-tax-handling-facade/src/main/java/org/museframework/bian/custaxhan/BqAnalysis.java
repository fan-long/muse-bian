package org.museframework.bian.custaxhan;

import org.museframework.bian.custaxhan.dto.RetrieveAnalysisRequest;
import org.museframework.bian.custaxhan.dto.RetrieveAnalysisResponse;
import org.museframework.bian.custaxhan.dto.UpdateAnalysisRequest;
import org.museframework.bian.custaxhan.dto.UpdateAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CustomerTaxHandling", group="Analysis")
public interface BqAnalysis {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of the tax handling analysis")
    UpdateAnalysisResponse updateAnalysis(UpdateAnalysisRequest req);

    @Description("ReBQ Retrieve details about the tax reporting analysis")
    RetrieveAnalysisResponse retrieveAnalysis(RetrieveAnalysisRequest req);
}