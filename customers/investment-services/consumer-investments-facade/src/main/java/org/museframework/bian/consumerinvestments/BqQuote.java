package org.museframework.bian.consumerinvestments;

import org.museframework.bian.consumerinvestments.dto.RetrieveQuoteRequest;
import org.museframework.bian.consumerinvestments.dto.RetrieveQuoteResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="ConsumerInvestments", group="Quote")
public interface BqQuote {
    @Description("ReBQ Retrieve bank quote for a security")
    RetrieveQuoteResponse retrieveQuote(RetrieveQuoteRequest req);
}