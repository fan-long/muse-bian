package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.InitiateDepositsRequest;
import org.museframework.bian.leasing.dto.InitiateDepositsResponse;
import org.museframework.bian.leasing.dto.RetrieveDepositsRequest;
import org.museframework.bian.leasing.dto.RetrieveDepositsResponse;
import org.museframework.bian.leasing.dto.UpdateDepositsRequest;
import org.museframework.bian.leasing.dto.UpdateDepositsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Deposits")
public interface BqDeposits {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Deposits")
    InitiateDepositsResponse initiateDeposits(InitiateDepositsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Deposits")
    RetrieveDepositsResponse retrieveDeposits(RetrieveDepositsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Deposits")
    UpdateDepositsResponse updateDeposits(UpdateDepositsRequest req);
}