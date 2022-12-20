package org.museframework.bian.fraudevaluation;

import org.museframework.bian.fraudevaluation.dto.EvaluateFraudEvaluationAssessmentRequest;
import org.museframework.bian.fraudevaluation.dto.EvaluateFraudEvaluationAssessmentResponse;
import org.museframework.bian.fraudevaluation.dto.RetrieveFraudEvaluationAssessmentRequest;
import org.museframework.bian.fraudevaluation.dto.RetrieveFraudEvaluationAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Fraud Evaluation. ")
@GenericDomain(name="FraudEvaluation", group="FraudEvaluationAssessment")
public interface CrFraudEvaluationAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Start a fraud evaluation for a production transaction set")
    EvaluateFraudEvaluationAssessmentResponse evaluateFraudEvaluationAssessment(EvaluateFraudEvaluationAssessmentRequest req);

    @Description("ReCr Retrieve details about a fraud evaluation assessment")
    RetrieveFraudEvaluationAssessmentResponse retrieveFraudEvaluationAssessment(RetrieveFraudEvaluationAssessmentRequest req);
}