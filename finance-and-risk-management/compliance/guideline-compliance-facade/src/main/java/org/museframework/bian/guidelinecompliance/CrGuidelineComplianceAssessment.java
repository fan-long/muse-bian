package org.museframework.bian.guidelinecompliance;

import org.museframework.bian.guidelinecompliance.dto.EvaluateGuidelineComplianceAssessmentRequest;
import org.museframework.bian.guidelinecompliance.dto.EvaluateGuidelineComplianceAssessmentResponse;
import org.museframework.bian.guidelinecompliance.dto.RetrieveGuidelineComplianceAssessmentRequest;
import org.museframework.bian.guidelinecompliance.dto.RetrieveGuidelineComplianceAssessmentResponse;
import org.museframework.bian.guidelinecompliance.dto.UpdateGuidelineComplianceAssessmentRequest;
import org.museframework.bian.guidelinecompliance.dto.UpdateGuidelineComplianceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Guideline Compliance. ")
@GenericDomain(name="GuidelineCompliance", group="GuidelineComplianceAssessment")
public interface CrGuidelineComplianceAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Start a guideline compliance evaluation assessment")
    EvaluateGuidelineComplianceAssessmentResponse evaluateGuidelineComplianceAssessment(EvaluateGuidelineComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update submitted details or content for an on-going guideline compliance assessment")
    UpdateGuidelineComplianceAssessmentResponse updateGuidelineComplianceAssessment(UpdateGuidelineComplianceAssessmentRequest req);

    @Description("ReCR Retrieve details and content from an active guideline compliance assessment")
    RetrieveGuidelineComplianceAssessmentResponse retrieveGuidelineComplianceAssessment(RetrieveGuidelineComplianceAssessmentRequest req);
}