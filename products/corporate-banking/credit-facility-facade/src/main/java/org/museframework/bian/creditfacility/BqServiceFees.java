package org.museframework.bian.creditfacility;

import org.museframework.bian.creditfacility.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.creditfacility.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.creditfacility.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.creditfacility.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CreditFacility", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about a credit facility's applied fees")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}