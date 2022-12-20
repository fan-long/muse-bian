package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.RetrieveInterestRequest;
import org.museframework.bian.consumerloan.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about interest applied to a consumer loan")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}