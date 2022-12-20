package org.museframework.bian.legalcompliance;

import org.museframework.bian.legalcompliance.dto.EvaluateLegalComplianceAssessmentRequest;
import org.museframework.bian.legalcompliance.dto.EvaluateLegalComplianceAssessmentResponse;
import org.museframework.bian.legalcompliance.dto.RequestLegalComplianceAssessmentRequest;
import org.museframework.bian.legalcompliance.dto.RequestLegalComplianceAssessmentResponse;
import org.museframework.bian.legalcompliance.dto.RetrieveLegalComplianceAssessmentRequest;
import org.museframework.bian.legalcompliance.dto.RetrieveLegalComplianceAssessmentResponse;
import org.museframework.bian.legalcompliance.dto.UpdateLegalComplianceAssessmentRequest;
import org.museframework.bian.legalcompliance.dto.UpdateLegalComplianceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Legal Compliance. ")
@GenericDomain(name="LegalCompliance", group="LegalComplianceAssessment")
public interface CrLegalComplianceAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Start a legal assessment action")
    EvaluateLegalComplianceAssessmentResponse evaluateLegalComplianceAssessment(EvaluateLegalComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update submitted details or content for an on-going legal assessment")
    UpdateLegalComplianceAssessmentResponse updateLegalComplianceAssessment(UpdateLegalComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a review or adjudication for an assessment")
    RequestLegalComplianceAssessmentResponse requestLegalComplianceAssessment(RequestLegalComplianceAssessmentRequest req);

    @Description("ReCR Retrieve details and content from a legal assessment action")
    RetrieveLegalComplianceAssessmentResponse retrieveLegalComplianceAssessment(RetrieveLegalComplianceAssessmentRequest req);
}