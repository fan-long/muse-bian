package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.InitiateWithdrawalsRequest;
import org.museframework.bian.mortgageloan.dto.InitiateWithdrawalsResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveWithdrawalsRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveWithdrawalsResponse;
import org.museframework.bian.mortgageloan.dto.UpdateWithdrawalsRequest;
import org.museframework.bian.mortgageloan.dto.UpdateWithdrawalsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Withdrawals")
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