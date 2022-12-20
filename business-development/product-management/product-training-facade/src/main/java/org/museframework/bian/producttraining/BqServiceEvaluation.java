package org.museframework.bian.producttraining;

import org.museframework.bian.producttraining.dto.ExchangeServiceEvaluationRequest;
import org.museframework.bian.producttraining.dto.ExchangeServiceEvaluationResponse;
import org.museframework.bian.producttraining.dto.RequestServiceEvaluationRequest;
import org.museframework.bian.producttraining.dto.RequestServiceEvaluationResponse;
import org.museframework.bian.producttraining.dto.RetrieveServiceEvaluationRequest;
import org.museframework.bian.producttraining.dto.RetrieveServiceEvaluationResponse;
import org.museframework.bian.producttraining.dto.UpdateServiceEvaluationRequest;
import org.museframework.bian.producttraining.dto.UpdateServiceEvaluationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="ProductTraining", group="ServiceEvaluation")
public interface BqServiceEvaluation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Service Evaluation processing")
    ExchangeServiceEvaluationResponse exchangeServiceEvaluation(ExchangeServiceEvaluationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Service Evaluation")
    RetrieveServiceEvaluationResponse retrieveServiceEvaluation(RetrieveServiceEvaluationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Service Evaluation")
    RequestServiceEvaluationResponse requestServiceEvaluation(RequestServiceEvaluationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Service Evaluation")
    UpdateServiceEvaluationResponse updateServiceEvaluation(UpdateServiceEvaluationRequest req);
}