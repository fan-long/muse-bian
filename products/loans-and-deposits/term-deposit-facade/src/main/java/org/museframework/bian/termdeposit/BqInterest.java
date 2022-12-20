package org.museframework.bian.termdeposit;

import org.museframework.bian.termdeposit.dto.RetrieveInterestRequest;
import org.museframework.bian.termdeposit.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="TermDeposit", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details of an interest transaction applied internally to the account")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}