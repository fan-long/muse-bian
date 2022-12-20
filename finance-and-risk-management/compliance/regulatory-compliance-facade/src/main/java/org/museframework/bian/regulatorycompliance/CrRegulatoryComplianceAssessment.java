package org.museframework.bian.regulatorycompliance;

import org.museframework.bian.regulatorycompliance.dto.EvaluateRegulatoryComplianceAssessmentRequest;
import org.museframework.bian.regulatorycompliance.dto.EvaluateRegulatoryComplianceAssessmentResponse;
import org.museframework.bian.regulatorycompliance.dto.RequestRegulatoryComplianceAssessmentRequest;
import org.museframework.bian.regulatorycompliance.dto.RequestRegulatoryComplianceAssessmentResponse;
import org.museframework.bian.regulatorycompliance.dto.RetrieveRegulatoryComplianceAssessmentRequest;
import org.museframework.bian.regulatorycompliance.dto.RetrieveRegulatoryComplianceAssessmentResponse;
import org.museframework.bian.regulatorycompliance.dto.UpdateRegulatoryComplianceAssessmentRequest;
import org.museframework.bian.regulatorycompliance.dto.UpdateRegulatoryComplianceAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Regulatory Compliance. ")
@GenericDomain(name="RegulatoryCompliance", group="RegulatoryComplianceAssessment")
public interface CrRegulatoryComplianceAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Start a compliance evaluation assessment")
    EvaluateRegulatoryComplianceAssessmentResponse evaluateRegulatoryComplianceAssessment(EvaluateRegulatoryComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update submitted details or content for an on-going compliance assessment")
    UpdateRegulatoryComplianceAssessmentResponse updateRegulatoryComplianceAssessment(UpdateRegulatoryComplianceAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a review or adjudication for an assessment")
    RequestRegulatoryComplianceAssessmentResponse requestRegulatoryComplianceAssessment(RequestRegulatoryComplianceAssessmentRequest req);

    @Description("ReCR Retrieve details and content from an active compliance assessment")
    RetrieveRegulatoryComplianceAssessmentResponse retrieveRegulatoryComplianceAssessment(RetrieveRegulatoryComplianceAssessmentRequest req);
}