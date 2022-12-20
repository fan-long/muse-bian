package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.consumerloan.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.consumerloan.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.consumerloan.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about a consumer loan fees")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}