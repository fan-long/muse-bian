package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.RetrieveInterestRequest;
import org.museframework.bian.creditcard.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about interest accrued to an account")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}