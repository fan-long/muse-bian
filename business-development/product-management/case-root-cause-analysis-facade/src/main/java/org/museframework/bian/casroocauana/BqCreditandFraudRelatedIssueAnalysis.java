package org.museframework.bian.casroocauana;

import org.museframework.bian.casroocauana.dto.ExecuteCreditandFraudRelatedIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.ExecuteCreditandFraudRelatedIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.InitiateCreditandFraudRelatedIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.InitiateCreditandFraudRelatedIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RequestCreditandFraudRelatedIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RequestCreditandFraudRelatedIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RetrieveCreditandFraudRelatedIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RetrieveCreditandFraudRelatedIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.UpdateCreditandFraudRelatedIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.UpdateCreditandFraudRelatedIssueAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="CaseRootCauseAnalysis", group="CreditandFraudRelatedIssueAnalysis")
public interface BqCreditandFraudRelatedIssueAnalysis {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Credit and Fraud Related Issue Analysis")
    ExecuteCreditandFraudRelatedIssueAnalysisResponse executeCreditandFraudRelatedIssueAnalysis(ExecuteCreditandFraudRelatedIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Credit and Fraud Related Issue Analysis")
    InitiateCreditandFraudRelatedIssueAnalysisResponse initiateCreditandFraudRelatedIssueAnalysis(InitiateCreditandFraudRelatedIssueAnalysisRequest req);

    @Description("ReBQ Retrieve details about any aspect of Credit and Fraud Related Issue Analysis")
    RetrieveCreditandFraudRelatedIssueAnalysisResponse retrieveCreditandFraudRelatedIssueAnalysis(RetrieveCreditandFraudRelatedIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Credit and Fraud Related Issue Analysis")
    RequestCreditandFraudRelatedIssueAnalysisResponse requestCreditandFraudRelatedIssueAnalysis(RequestCreditandFraudRelatedIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Credit and Fraud Related Issue Analysis")
    UpdateCreditandFraudRelatedIssueAnalysisResponse updateCreditandFraudRelatedIssueAnalysis(UpdateCreditandFraudRelatedIssueAnalysisRequest req);
}