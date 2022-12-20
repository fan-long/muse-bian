package org.museframework.bian.cardauthorization;

import org.museframework.bian.cardauthorization.dto.EvaluateCreditCardAuthorizationAssessmentRequest;
import org.museframework.bian.cardauthorization.dto.EvaluateCreditCardAuthorizationAssessmentResponse;
import org.museframework.bian.cardauthorization.dto.RetrieveCreditCardAuthorizationAssessmentRequest;
import org.museframework.bian.cardauthorization.dto.RetrieveCreditCardAuthorizationAssessmentResponse;
import org.museframework.bian.cardauthorization.dto.UpdateCreditCardAuthorizationAssessmentRequest;
import org.museframework.bian.cardauthorization.dto.UpdateCreditCardAuthorizationAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Card Authorization. ")
@GenericDomain(name="CardAuthorization", group="CreditCardAuthorizationAssessment")
public interface CrCreditCardAuthorizationAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate a card transaction authorization assessment")
    EvaluateCreditCardAuthorizationAssessmentResponse evaluateCreditCardAuthorizationAssessment(EvaluateCreditCardAuthorizationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a card transaction authorization assessment")
    UpdateCreditCardAuthorizationAssessmentResponse updateCreditCardAuthorizationAssessment(UpdateCreditCardAuthorizationAssessmentRequest req);

    @Description("ReCR Retrieve details about an active car transaction authorization task")
    RetrieveCreditCardAuthorizationAssessmentResponse retrieveCreditCardAuthorizationAssessment(RetrieveCreditCardAuthorizationAssessmentRequest req);
}