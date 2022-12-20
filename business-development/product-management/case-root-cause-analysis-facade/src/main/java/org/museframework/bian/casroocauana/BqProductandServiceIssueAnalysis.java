package org.museframework.bian.casroocauana;

import org.museframework.bian.casroocauana.dto.ExecuteProductandServiceIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.ExecuteProductandServiceIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.InitiateProductandServiceIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.InitiateProductandServiceIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RequestProductandServiceIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RequestProductandServiceIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RetrieveProductandServiceIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RetrieveProductandServiceIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.UpdateProductandServiceIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.UpdateProductandServiceIssueAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="CaseRootCauseAnalysis", group="ProductandServiceIssueAnalysis")
public interface BqProductandServiceIssueAnalysis {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Product and Service issue Analysis")
    ExecuteProductandServiceIssueAnalysisResponse executeProductandServiceIssueAnalysis(ExecuteProductandServiceIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Product and Service issue Analysis")
    InitiateProductandServiceIssueAnalysisResponse initiateProductandServiceIssueAnalysis(InitiateProductandServiceIssueAnalysisRequest req);

    @Description("ReBQ Retrieve details about any aspect of Product and Service issue Analysis")
    RetrieveProductandServiceIssueAnalysisResponse retrieveProductandServiceIssueAnalysis(RetrieveProductandServiceIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Product and Service issue Analysis")
    RequestProductandServiceIssueAnalysisResponse requestProductandServiceIssueAnalysis(RequestProductandServiceIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Product and Service issue Analysis")
    UpdateProductandServiceIssueAnalysisResponse updateProductandServiceIssueAnalysis(UpdateProductandServiceIssueAnalysisRequest req);
}