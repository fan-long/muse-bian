package org.museframework.bian.frauddiagnosis;

import org.museframework.bian.frauddiagnosis.dto.RequestAnalystReviewRequest;
import org.museframework.bian.frauddiagnosis.dto.RequestAnalystReviewResponse;
import org.museframework.bian.frauddiagnosis.dto.RetrieveAnalystReviewRequest;
import org.museframework.bian.frauddiagnosis.dto.RetrieveAnalystReviewResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="FraudDiagnosis", group="AnalystReview")
public interface BqAnalystReview {
    @GenericDtxEndpoint
    @Description("RqBQ Request access to an analist for an active diagnosis")
    RequestAnalystReviewResponse requestAnalystReview(RequestAnalystReviewRequest req);

    @Description("ReBQ Retrieve details about a analyst review of a transaction")
    RetrieveAnalystReviewResponse retrieveAnalystReview(RetrieveAnalystReviewRequest req);
}