package org.museframework.bian.consumerinvestments;

import org.museframework.bian.consumerinvestments.dto.RetrieveOrderInitiationRequest;
import org.museframework.bian.consumerinvestments.dto.RetrieveOrderInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="ConsumerInvestments", group="OrderInitiation")
public interface BqOrderInitiation {
    @Description("ReBQ Retrieve details about a consumer securities order")
    RetrieveOrderInitiationResponse retrieveOrderInitiation(RetrieveOrderInitiationRequest req);
}