package org.museframework.bian.advertising;

import org.museframework.bian.advertising.dto.CreatePerformanceAssessmentRequest;
import org.museframework.bian.advertising.dto.CreatePerformanceAssessmentResponse;
import org.museframework.bian.advertising.dto.ExecutePerformanceAssessmentRequest;
import org.museframework.bian.advertising.dto.ExecutePerformanceAssessmentResponse;
import org.museframework.bian.advertising.dto.RequestPerformanceAssessmentRequest;
import org.museframework.bian.advertising.dto.RequestPerformanceAssessmentResponse;
import org.museframework.bian.advertising.dto.RetrievePerformanceAssessmentRequest;
import org.museframework.bian.advertising.dto.RetrievePerformanceAssessmentResponse;
import org.museframework.bian.advertising.dto.UpdatePerformanceAssessmentRequest;
import org.museframework.bian.advertising.dto.UpdatePerformanceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="Advertising", group="PerformanceAssessment")
public interface BqPerformanceAssessment {
    @GenericDtxEndpoint
    @Description("CrBQ Create a performance assessment of the advertising campaign portfolio")
    CreatePerformanceAssessmentResponse createPerformanceAssessment(CreatePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a advertising campaign portfolio assessment")
    UpdatePerformanceAssessmentResponse updatePerformanceAssessment(UpdatePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action for a performance assessment (e.g. trigger assessment report)")
    ExecutePerformanceAssessmentResponse executePerformanceAssessment(ExecutePerformanceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to a performance assessment (e.g. request specific analysis)")
    RequestPerformanceAssessmentResponse requestPerformanceAssessment(RequestPerformanceAssessmentRequest req);

    @Description("ReBQ Retrieve details about advertising campaign performance assessment activity")
    RetrievePerformanceAssessmentResponse retrievePerformanceAssessment(RetrievePerformanceAssessmentRequest req);
}