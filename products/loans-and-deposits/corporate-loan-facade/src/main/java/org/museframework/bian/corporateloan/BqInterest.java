package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.RetrieveInterestRequest;
import org.museframework.bian.corporateloan.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about interest applied to a corporate loan")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}