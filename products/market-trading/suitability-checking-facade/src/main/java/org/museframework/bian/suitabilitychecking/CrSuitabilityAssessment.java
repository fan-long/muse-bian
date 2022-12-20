package org.museframework.bian.suitabilitychecking;

import org.museframework.bian.suitabilitychecking.dto.EvaluateSuitabilityAssessmentRequest;
import org.museframework.bian.suitabilitychecking.dto.EvaluateSuitabilityAssessmentResponse;
import org.museframework.bian.suitabilitychecking.dto.RequestSuitabilityAssessmentRequest;
import org.museframework.bian.suitabilitychecking.dto.RequestSuitabilityAssessmentResponse;
import org.museframework.bian.suitabilitychecking.dto.RetrieveSuitabilityAssessmentRequest;
import org.museframework.bian.suitabilitychecking.dto.RetrieveSuitabilityAssessmentResponse;
import org.museframework.bian.suitabilitychecking.dto.UpdateSuitabilityAssessmentRequest;
import org.museframework.bian.suitabilitychecking.dto.UpdateSuitabilityAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Suitability Checking. ")
@GenericDomain(name="SuitabilityChecking", group="SuitabilityAssessment")
public interface CrSuitabilityAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate the suitability of a proposed transaction")
    EvaluateSuitabilityAssessmentResponse evaluateSuitabilityAssessment(EvaluateSuitabilityAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a suitability evaluation")
    UpdateSuitabilityAssessmentResponse updateSuitabilityAssessment(UpdateSuitabilityAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention into an active evaluation")
    RequestSuitabilityAssessmentResponse requestSuitabilityAssessment(RequestSuitabilityAssessmentRequest req);

    @Description("ReCR Retrieve details about a suitability evaluation")
    RetrieveSuitabilityAssessmentResponse retrieveSuitabilityAssessment(RetrieveSuitabilityAssessmentRequest req);
}