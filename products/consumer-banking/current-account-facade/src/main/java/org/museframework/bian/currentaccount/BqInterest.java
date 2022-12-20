package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.RetrieveInterestRequest;
import org.museframework.bian.currentaccount.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CurrentAccount", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details of an interest transaction applied internally to the account")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}