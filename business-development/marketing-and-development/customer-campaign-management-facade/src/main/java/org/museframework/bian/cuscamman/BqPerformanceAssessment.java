package org.museframework.bian.cuscamman;

import org.museframework.bian.cuscamman.dto.CreatePerformanceAssessmentRequest;
import org.museframework.bian.cuscamman.dto.CreatePerformanceAssessmentResponse;
import org.museframework.bian.cuscamman.dto.ExecutePerformanceAssessmentRequest;
import org.museframework.bian.cuscamman.dto.ExecutePerformanceAssessmentResponse;
import org.museframework.bian.cuscamman.dto.RequestPerformanceAssessmentRequest;
import org.museframework.bian.cuscamman.dto.RequestPerformanceAssessmentResponse;
import org.museframework.bian.cuscamman.dto.RetrievePerformanceAssessmentRequest;
import org.museframework.bian.cuscamman.dto.RetrievePerformanceAssessmentResponse;
import org.museframework.bian.cuscamman.dto.UpdatePerformanceAssessmentRequest;
import org.museframework.bian.cuscamman.dto.UpdatePerformanceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerCampaignManagement", group="PerformanceAssessment")
public interface BqPerformanceAssessment {
    @GenericDtxEndpoint
    @Description("CrBQ Create a performance assessment of the customer campaign portfolio")
    CreatePerformanceAssessmentResponse createPerformanceAssessment(CreatePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a customer campaign portfolio assessment")
    UpdatePerformanceAssessmentResponse updatePerformanceAssessment(UpdatePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action for a performance assessment")
    ExecutePerformanceAssessmentResponse executePerformanceAssessment(ExecutePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to a performance assessment")
    RequestPerformanceAssessmentResponse requestPerformanceAssessment(RequestPerformanceAssessmentRequest req);

    @Description("ReBQ Retrieve details about customer campaign performance assessment activity")
    RetrievePerformanceAssessmentResponse retrievePerformanceAssessment(RetrievePerformanceAssessmentRequest req);
}