package org.museframework.bian.transactionauthorization;

import org.museframework.bian.transactionauthorization.dto.EvaluateInteractiveTransactionAssessmentRequest;
import org.museframework.bian.transactionauthorization.dto.EvaluateInteractiveTransactionAssessmentResponse;
import org.museframework.bian.transactionauthorization.dto.ExecuteInteractiveTransactionAssessmentRequest;
import org.museframework.bian.transactionauthorization.dto.ExecuteInteractiveTransactionAssessmentResponse;
import org.museframework.bian.transactionauthorization.dto.RequestInteractiveTransactionAssessmentRequest;
import org.museframework.bian.transactionauthorization.dto.RequestInteractiveTransactionAssessmentResponse;
import org.museframework.bian.transactionauthorization.dto.RetrieveInteractiveTransactionAssessmentRequest;
import org.museframework.bian.transactionauthorization.dto.RetrieveInteractiveTransactionAssessmentResponse;
import org.museframework.bian.transactionauthorization.dto.UpdateInteractiveTransactionAssessmentRequest;
import org.museframework.bian.transactionauthorization.dto.UpdateInteractiveTransactionAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Transaction Authorization. ")
@GenericDomain(name="TransactionAuthorization", group="InteractiveTransactionAssessment")
public interface CrInteractiveTransactionAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate a proposed interactive transaction for authorization")
    EvaluateInteractiveTransactionAssessmentResponse evaluateInteractiveTransactionAssessment(EvaluateInteractiveTransactionAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a proposed transaction for authorization")
    UpdateInteractiveTransactionAssessmentResponse updateInteractiveTransactionAssessment(UpdateInteractiveTransactionAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action for transaction authorization (e.g. upload data)")
    ExecuteInteractiveTransactionAssessmentResponse executeInteractiveTransactionAssessment(ExecuteInteractiveTransactionAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention (e.g. engage a specialist)")
    RequestInteractiveTransactionAssessmentResponse requestInteractiveTransactionAssessment(RequestInteractiveTransactionAssessmentRequest req);

    @Description("ReCR Retrieve details about an interactive transaction authorization")
    RetrieveInteractiveTransactionAssessmentResponse retrieveInteractiveTransactionAssessment(RetrieveInteractiveTransactionAssessmentRequest req);
}