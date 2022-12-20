package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.RetrieveInterestRequest;
import org.museframework.bian.loan.dto.RetrieveInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about interest applied to a loan")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);
}