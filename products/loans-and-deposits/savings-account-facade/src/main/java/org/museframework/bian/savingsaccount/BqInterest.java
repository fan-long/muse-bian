package org.museframework.bian.savingsaccount;

import org.museframework.bian.savingsaccount.dto.RetrieveInterestRequest;
import org.museframework.bian.savingsaccount.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="SavingsAccount", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details of an interest transaction applied internally to the account")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}