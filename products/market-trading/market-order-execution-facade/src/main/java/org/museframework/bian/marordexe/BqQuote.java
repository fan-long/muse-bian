package org.museframework.bian.marordexe;

import org.museframework.bian.marordexe.dto.InitiateQuoteRequest;
import org.museframework.bian.marordexe.dto.InitiateQuoteResponse;
import org.museframework.bian.marordexe.dto.RetrieveQuoteRequest;
import org.museframework.bian.marordexe.dto.RetrieveQuoteResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="MarketOrderExecution", group="Quote")
public interface BqQuote {
    @GenericDtxEndpoint
    @Description("InBQ Obtain a trading quote for a proposed order")
    InitiateQuoteResponse initiateQuote(InitiateQuoteRequest req);

    @Description("ReBQ Retrieve details about quotation activity")
    RetrieveQuoteResponse retrieveQuote(RetrieveQuoteRequest req);
}