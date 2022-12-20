package org.museframework.bian.finstaass;

import org.museframework.bian.finstaass.dto.EvaluateFinancialStatementAssessmentRequest;
import org.museframework.bian.finstaass.dto.EvaluateFinancialStatementAssessmentResponse;
import org.museframework.bian.finstaass.dto.ExecuteFinancialStatementAssessmentRequest;
import org.museframework.bian.finstaass.dto.ExecuteFinancialStatementAssessmentResponse;
import org.museframework.bian.finstaass.dto.GrantFinancialStatementAssessmentRequest;
import org.museframework.bian.finstaass.dto.GrantFinancialStatementAssessmentResponse;
import org.museframework.bian.finstaass.dto.NotifyFinancialStatementAssessmentRequest;
import org.museframework.bian.finstaass.dto.NotifyFinancialStatementAssessmentResponse;
import org.museframework.bian.finstaass.dto.RequestFinancialStatementAssessmentRequest;
import org.museframework.bian.finstaass.dto.RequestFinancialStatementAssessmentResponse;
import org.museframework.bian.finstaass.dto.RetrieveFinancialStatementAssessmentRequest;
import org.museframework.bian.finstaass.dto.RetrieveFinancialStatementAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Financial Statement Assessment. ")
@GenericDomain(name="FinancialStatementAssessment", group="FinancialStatementAssessment")
public interface CrFinancialStatementAssessment {
    @GenericDtxEndpoint
    @Description("Evaluate Financial Statement Assessment")
    EvaluateFinancialStatementAssessmentResponse evaluateFinancialStatementAssessment(EvaluateFinancialStatementAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Financial Statement Assessment")
    ExecuteFinancialStatementAssessmentResponse executeFinancialStatementAssessment(ExecuteFinancialStatementAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("Grant Financial Statement Assessment")
    GrantFinancialStatementAssessmentResponse grantFinancialStatementAssessment(GrantFinancialStatementAssessmentRequest req);

    @Description("Notify Financial Statement Assessment")
    NotifyFinancialStatementAssessmentResponse notifyFinancialStatementAssessment(NotifyFinancialStatementAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Financial Statement Assessment")
    RequestFinancialStatementAssessmentResponse requestFinancialStatementAssessment(RequestFinancialStatementAssessmentRequest req);

    @Description("Retrieve Financial Statement Assessment")
    RetrieveFinancialStatementAssessmentResponse retrieveFinancialStatementAssessment(RetrieveFinancialStatementAssessmentRequest req);
}