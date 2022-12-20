package org.museframework.bian.promotionalevents;

import org.museframework.bian.promotionalevents.dto.CreateImpactAssessmentRequest;
import org.museframework.bian.promotionalevents.dto.CreateImpactAssessmentResponse;
import org.museframework.bian.promotionalevents.dto.RequestImpactAssessmentRequest;
import org.museframework.bian.promotionalevents.dto.RequestImpactAssessmentResponse;
import org.museframework.bian.promotionalevents.dto.RetrieveImpactAssessmentRequest;
import org.museframework.bian.promotionalevents.dto.RetrieveImpactAssessmentResponse;
import org.museframework.bian.promotionalevents.dto.UpdateImpactAssessmentRequest;
import org.museframework.bian.promotionalevents.dto.UpdateImpactAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="PromotionalEvents", group="ImpactAssessment")
public interface BqImpactAssessment {
    @GenericDtxEndpoint
    @Description("CrBQ Create an impact assessment of the promotional event activity")
    CreateImpactAssessmentResponse createImpactAssessment(CreateImpactAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of promotional event impact assessment")
    UpdateImpactAssessmentResponse updateImpactAssessment(UpdateImpactAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to an impact assessment")
    RequestImpactAssessmentResponse requestImpactAssessment(RequestImpactAssessmentRequest req);

    @Description("ReBQ Retrieve details about promotional event impact assessment activity")
    RetrieveImpactAssessmentResponse retrieveImpactAssessment(RetrieveImpactAssessmentRequest req);
}