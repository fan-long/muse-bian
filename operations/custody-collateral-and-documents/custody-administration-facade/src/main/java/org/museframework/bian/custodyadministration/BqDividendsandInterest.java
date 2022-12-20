package org.museframework.bian.custodyadministration;

import org.museframework.bian.custodyadministration.dto.InitiateDividendsandInterestRequest;
import org.museframework.bian.custodyadministration.dto.InitiateDividendsandInterestResponse;
import org.museframework.bian.custodyadministration.dto.RetrieveDividendsandInterestRequest;
import org.museframework.bian.custodyadministration.dto.RetrieveDividendsandInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CustodyAdministration", group="DividendsandInterest")
public interface BqDividendsandInterest {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Dividends and Interest")
    InitiateDividendsandInterestResponse initiateDividendsandInterest(InitiateDividendsandInterestRequest req);

    @Description("ReBQ Retrieve details about any aspect of Dividends and Interest")
    RetrieveDividendsandInterestResponse retrieveDividendsandInterest(RetrieveDividendsandInterestRequest req);
}