package org.museframework.bian.marketorder;

import org.museframework.bian.marketorder.dto.RetrieveCustomerProcessingRequest;
import org.museframework.bian.marketorder.dto.RetrieveCustomerProcessingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrder", group="CustomerProcessing")
public interface BqCustomerProcessing {
    @Description("ReBQ Retrieve details about customer specific processing for a market order")
    RetrieveCustomerProcessingResponse retrieveCustomerProcessing(RetrieveCustomerProcessingRequest req);
}