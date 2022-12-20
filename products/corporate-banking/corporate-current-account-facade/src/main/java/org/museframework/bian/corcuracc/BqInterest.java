package org.museframework.bian.corcuracc;

import org.museframework.bian.corcuracc.dto.RetrieveInterestRequest;
import org.museframework.bian.corcuracc.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateCurrentAccount", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details of an interest transaction applied internally to the account")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}