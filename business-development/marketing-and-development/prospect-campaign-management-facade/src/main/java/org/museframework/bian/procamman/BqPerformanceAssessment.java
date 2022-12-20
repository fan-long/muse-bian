package org.museframework.bian.procamman;

import org.museframework.bian.procamman.dto.CreatePerformanceAssessmentRequest;
import org.museframework.bian.procamman.dto.CreatePerformanceAssessmentResponse;
import org.museframework.bian.procamman.dto.ExecutePerformanceAssessmentRequest;
import org.museframework.bian.procamman.dto.ExecutePerformanceAssessmentResponse;
import org.museframework.bian.procamman.dto.RequestPerformanceAssessmentRequest;
import org.museframework.bian.procamman.dto.RequestPerformanceAssessmentResponse;
import org.museframework.bian.procamman.dto.RetrievePerformanceAssessmentRequest;
import org.museframework.bian.procamman.dto.RetrievePerformanceAssessmentResponse;
import org.museframework.bian.procamman.dto.UpdatePerformanceAssessmentRequest;
import org.museframework.bian.procamman.dto.UpdatePerformanceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="ProspectCampaignManagement", group="PerformanceAssessment")
public interface BqPerformanceAssessment {
    @GenericDtxEndpoint
    @Description("CrBQ Create a performance assessment of the customer campaign portfolio")
    CreatePerformanceAssessmentResponse createPerformanceAssessment(CreatePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a prospect campaign portfolio assessment")
    UpdatePerformanceAssessmentResponse updatePerformanceAssessment(UpdatePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action for a performance assessment")
    ExecutePerformanceAssessmentResponse executePerformanceAssessment(ExecutePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to a performance assessment")
    RequestPerformanceAssessmentResponse requestPerformanceAssessment(RequestPerformanceAssessmentRequest req);

    @Description("ReBQ Retrieve details about prospect campaign performance assessment activity")
    RetrievePerformanceAssessmentResponse retrievePerformanceAssessment(RetrievePerformanceAssessmentRequest req);
}