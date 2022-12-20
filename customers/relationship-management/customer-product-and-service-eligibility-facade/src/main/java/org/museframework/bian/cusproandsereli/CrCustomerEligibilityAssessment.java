package org.museframework.bian.cusproandsereli;

import org.museframework.bian.cusproandsereli.dto.EvaluateCustomerEligibilityAssessmentRequest;
import org.museframework.bian.cusproandsereli.dto.EvaluateCustomerEligibilityAssessmentResponse;
import org.museframework.bian.cusproandsereli.dto.ExecuteCustomerEligibilityAssessmentRequest;
import org.museframework.bian.cusproandsereli.dto.ExecuteCustomerEligibilityAssessmentResponse;
import org.museframework.bian.cusproandsereli.dto.RequestCustomerEligibilityAssessmentRequest;
import org.museframework.bian.cusproandsereli.dto.RequestCustomerEligibilityAssessmentResponse;
import org.museframework.bian.cusproandsereli.dto.RetrieveCustomerEligibilityAssessmentRequest;
import org.museframework.bian.cusproandsereli.dto.RetrieveCustomerEligibilityAssessmentResponse;
import org.museframework.bian.cusproandsereli.dto.UpdateCustomerEligibilityAssessmentRequest;
import org.museframework.bian.cusproandsereli.dto.UpdateCustomerEligibilityAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CustomerProductAndServiceEligibility", group="CustomerEligibilityAssessment")
public interface CrCustomerEligibilityAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate a customer's eligibility for a product/service")
    EvaluateCustomerEligibilityAssessmentResponse evaluateCustomerEligibilityAssessment(EvaluateCustomerEligibilityAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the product/service eligibility record (e.g. for newly sold products)")
    UpdateCustomerEligibilityAssessmentResponse updateCustomerEligibilityAssessment(UpdateCustomerEligibilityAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against an active evaluation (e.g. provide additional data)")
    ExecuteCustomerEligibilityAssessmentResponse executeCustomerEligibilityAssessment(ExecuteCustomerEligibilityAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in an evaluation (e.g. engage a specialist or negotiator)")
    RequestCustomerEligibilityAssessmentResponse requestCustomerEligibilityAssessment(RequestCustomerEligibilityAssessmentRequest req);

    @Description("ReCR Retrieve details about an eligibility request")
    RetrieveCustomerEligibilityAssessmentResponse retrieveCustomerEligibilityAssessment(RetrieveCustomerEligibilityAssessmentRequest req);
}