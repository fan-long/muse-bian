package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.RetrieveInterestRequest;
import org.museframework.bian.leasing.dto.RetrieveInterestResponse;
import org.museframework.bian.leasing.dto.UpdateInterestRequest;
import org.museframework.bian.leasing.dto.UpdateInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about any aspect of Interest")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Interest")
    UpdateInterestResponse updateInterest(UpdateInterestRequest req);
}