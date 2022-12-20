package org.museframework.bian.creditmanagement;

import org.museframework.bian.creditmanagement.dto.EvaluateCreditPricingAssessmentRequest;
import org.museframework.bian.creditmanagement.dto.EvaluateCreditPricingAssessmentResponse;
import org.museframework.bian.creditmanagement.dto.RetrieveCreditPricingAssessmentRequest;
import org.museframework.bian.creditmanagement.dto.RetrieveCreditPricingAssessmentResponse;
import org.museframework.bian.creditmanagement.dto.UpdateCreditPricingAssessmentRequest;
import org.museframework.bian.creditmanagement.dto.UpdateCreditPricingAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Credit Management. ")
@GenericDomain(name="CreditManagement", group="CreditPricingAssessment")
public interface CrCreditPricingAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate a proposed transaction pricing against group credit policy")
    EvaluateCreditPricingAssessmentResponse evaluateCreditPricingAssessment(EvaluateCreditPricingAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active credit pricing assessment")
    UpdateCreditPricingAssessmentResponse updateCreditPricingAssessment(UpdateCreditPricingAssessmentRequest req);

    @Description("ReCR Retrieve details about a credit pricing assessment")
    RetrieveCreditPricingAssessmentResponse retrieveCreditPricingAssessment(RetrieveCreditPricingAssessmentRequest req);
}