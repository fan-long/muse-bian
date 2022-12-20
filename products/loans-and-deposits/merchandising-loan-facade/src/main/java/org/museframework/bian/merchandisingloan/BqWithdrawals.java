package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.InitiateWithdrawalsRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateWithdrawalsResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveWithdrawalsRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveWithdrawalsResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateWithdrawalsRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Withdrawals")
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