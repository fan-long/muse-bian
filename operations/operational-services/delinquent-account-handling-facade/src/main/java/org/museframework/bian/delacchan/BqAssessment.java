package org.museframework.bian.delacchan;

import org.museframework.bian.delacchan.dto.RetrieveAssessmentRequest;
import org.museframework.bian.delacchan.dto.RetrieveAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="DelinquentAccountHandling", group="Assessment")
public interface BqAssessment {
    @Description("ReBQ Retrieve details about a delinquent account assessment")
    RetrieveAssessmentResponse retrieveAssessment(RetrieveAssessmentRequest req);
}