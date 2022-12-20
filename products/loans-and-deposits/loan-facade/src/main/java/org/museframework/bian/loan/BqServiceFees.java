package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.loan.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.loan.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.loan.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about a loan fees")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}