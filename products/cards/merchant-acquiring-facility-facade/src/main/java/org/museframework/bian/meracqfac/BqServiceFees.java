package org.museframework.bian.meracqfac;

import org.museframework.bian.meracqfac.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.meracqfac.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.meracqfac.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.meracqfac.dto.RetrieveServiceFeesResponse;
import org.museframework.bian.meracqfac.dto.UpdateServiceFeesRequest;
import org.museframework.bian.meracqfac.dto.UpdateServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="MerchantAcquiringFacility", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("UpBQ Update a fee or penalty transaction booked against the account")
    UpdateServiceFeesResponse updateServiceFees(UpdateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about a fee or penalty charge")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}