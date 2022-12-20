package org.museframework.bian.productmatching;

import org.museframework.bian.productmatching.dto.InitiateContextCriteriaRequest;
import org.museframework.bian.productmatching.dto.InitiateContextCriteriaResponse;
import org.museframework.bian.productmatching.dto.RetrieveContextCriteriaRequest;
import org.museframework.bian.productmatching.dto.RetrieveContextCriteriaResponse;
import org.museframework.bian.productmatching.dto.UpdateContextCriteriaRequest;
import org.museframework.bian.productmatching.dto.UpdateContextCriteriaResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductMatching", group="ContextCriteria")
public interface BqContextCriteria {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Context Criteria")
    InitiateContextCriteriaResponse initiateContextCriteria(InitiateContextCriteriaRequest req);

    @Description("ReBQ Retrieve details about any aspect of Context Criteria")
    RetrieveContextCriteriaResponse retrieveContextCriteria(RetrieveContextCriteriaRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Context Criteria")
    UpdateContextCriteriaResponse updateContextCriteria(UpdateContextCriteriaRequest req);
}