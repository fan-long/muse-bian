package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.InitiateWithdrawalsRequest;
import org.museframework.bian.leasing.dto.InitiateWithdrawalsResponse;
import org.museframework.bian.leasing.dto.RetrieveWithdrawalsRequest;
import org.museframework.bian.leasing.dto.RetrieveWithdrawalsResponse;
import org.museframework.bian.leasing.dto.UpdateWithdrawalsRequest;
import org.museframework.bian.leasing.dto.UpdateWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Withdrawals")
public interface BqWithdrawals {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Withdrawals")
    InitiateWithdrawalsResponse initiateWithdrawals(InitiateWithdrawalsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Withdrawals")
    RetrieveWithdrawalsResponse retrieveWithdrawals(RetrieveWithdrawalsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Withdrawals")
    UpdateWithdrawalsResponse updateWithdrawals(UpdateWithdrawalsRequest req);
}