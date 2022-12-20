package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.RetrieveInterestRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details of an interest transaction applied internally to the account")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}