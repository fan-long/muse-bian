package org.museframework.bian.underwriting;

import org.museframework.bian.underwriting.dto.EvaluateUnderwritingAssessmentRequest;
import org.museframework.bian.underwriting.dto.EvaluateUnderwritingAssessmentResponse;
import org.museframework.bian.underwriting.dto.RetrieveUnderwritingAssessmentRequest;
import org.museframework.bian.underwriting.dto.RetrieveUnderwritingAssessmentResponse;
import org.museframework.bian.underwriting.dto.UpdateUnderwritingAssessmentRequest;
import org.museframework.bian.underwriting.dto.UpdateUnderwritingAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Underwriting. ")
@GenericDomain(name="Underwriting", group="UnderwritingAssessment")
public interface CrUnderwritingAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate an underwriting decision")
    EvaluateUnderwritingAssessmentResponse evaluateUnderwritingAssessment(EvaluateUnderwritingAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an underwriting assessment")
    UpdateUnderwritingAssessmentResponse updateUnderwritingAssessment(UpdateUnderwritingAssessmentRequest req);

    @Description("ReCR Retrieve details about an underwriting assessment")
    RetrieveUnderwritingAssessmentResponse retrieveUnderwritingAssessment(RetrieveUnderwritingAssessmentRequest req);
}