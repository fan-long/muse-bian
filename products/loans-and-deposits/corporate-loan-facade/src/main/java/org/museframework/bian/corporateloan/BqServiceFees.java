package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.corporateloan.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.corporateloan.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.corporateloan.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about a corporate loan fees")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}